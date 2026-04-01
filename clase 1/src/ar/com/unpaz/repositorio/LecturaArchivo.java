package ar.com.unpaz.repositorio;
import java.util.List;

import ar.com.unpaz.model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
/***
 * @author
 * Class para hacer lectura de archivos
 *///Traigo file desde java.io.File

public class LecturaArchivo {
    
    public List<Cliente> leerArchivo(String rutaArchivo) {

        //Crear una lista
        List<Cliente> clientes = new ArrayList<Cliente>();

        //primero crear un obejto de tipo File
        File archivoFile = new File(rutaArchivo);

        try {
            //debo controlar la excepcion que puede generar el FileReader
            try (BufferedReader br = new BufferedReader(new FileReader(archivoFile))) {

                String linea;

                
                while ((linea = br.readLine()) != null) {

                    String [] datos = linea.split(";");

                    String tipo = datos[0];
                    String nombre = datos[1];
                    String apellido = datos[2];
                    int dni = Integer.parseInt(datos[3]);

                    double saldo = Double.parseDouble(datos[4]);
                    Contacto contacto = new Contacto("", 0, "","",0,0);
                    Cliente cliente = new Cliente(nombre, apellido, dni, contacto, new ArrayList<Cuenta>());
                    Cuenta cuenta = null;
                    switch (tipo) {
                        case "CORRIENTE":
                            double descubierto = Double.parseDouble(datos[5]);
                            cuenta = new CuentaCorriente(saldo, descubierto);
                            break;
                        case "AHORRO":
                            double interes = Double.parseDouble(datos[5]);
                            cuenta = new CajaAhorro(saldo, interes);
                            break;
                        case "SUELDO":
                            String empresa = datos[5];
                            cuenta = new CuentaSueldo(saldo, empresa);
                            break;
                        default:
                            System.out.println("Tipo de cuenta desconocido: " + tipo);
                    }
                    if (cuenta != null) {
                        cliente.getCuenta().add(cuenta);
                    }
                    clientes.add(cliente);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
    }

}
