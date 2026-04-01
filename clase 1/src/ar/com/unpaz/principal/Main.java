package ar.com.unpaz.principal;
import ar.com.unpaz.model.*;
import ar.com.unpaz.repositorio.LecturaArchivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//option del menu
		int option = 0;
		// Para lectura de archivos, se debe crear un objeto de la clase LecturaArchivo, y luego llamar al método leerArchivo, pasándole como parámetro la ruta del archivo a leer. El método devolverá una lista de objetos CuentaCorriente, que se pueden recorrer para mostrar sus atributos.
		LecturaArchivo lecturaDeArchivos = new LecturaArchivo();
		List<Cliente> clientes = lecturaDeArchivos.leerArchivo("src/cuenta.txt");

		for (Cliente cliente : clientes) {
			for (Cuenta cuenta : cliente.getCuenta()) {
				if (cuenta instanceof CuentaCorriente) {
					System.out.println(((CuentaCorriente) cuenta).getDescubierto());
				}
			}
		}

		Scanner sc = new Scanner(System.in);


		System.out.println("Bienvenido al sistema de gestion Bancaria");
		
		do {
			mostrarMenuPrincipal();
			option = sc.nextInt();


			switch (option) {
				case 1:
					crearCuenta(sc, clientes);
					break;
				case 2:
					ingresarCuenta(sc, clientes);
					break;
				case 3:
					System.out.println("Saliendo del sistema...");
					return;
				default:
					System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
			}

		}
		while (option != 3);
		//close is a metod of the Scanner class that closes the scanner and releases any resources associated with it. It is important to close the scanner when it is no longer needed to prevent memory leaks and other issues.
		sc.close();

	}
	private static void mostrarMenuPrincipal() {
		System.out.println("1. Crear cuenta");
		System.out.println("2. ingresar a cuenta");
		System.out.println("3. Salir");
	}
	
	private static void crearCuenta(Scanner sc, List<Cliente> clientes) {
		System.out.println("1. Crear Cuenta Corriente");
		System.out.println("2. Crear Cuenta de Ahorro");
		System.out.println("3. Crear Cuenta Sueldo");
		int option = sc.nextInt();
		sc.nextLine(); // Consumir el salto de línea

		Cliente cliente  = crearCliente(sc);
		clientes.add(cliente);
		switch (option) {
			case 1:
				System.out.println("Ingrese el descubierto de la cuenta corriente:");
				double descubierto = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea
				System.out.println("Ingrese el saldo de la cuenta corriente:");
				double saldo = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea

				CuentaCorriente cc = new CuentaCorriente(saldo, descubierto);
				cliente.getCuenta().add(cc);

				System.out.println("Cuenta corriente creada exitosamente.");
				break;
			case 2:
				System.out.println("Ingrese el saldo de la cuenta de ahorro:");
				double saldoAhorro = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea
				System.out.println("Ingrese el interés de la cuenta de ahorro:");
				double interes = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea


				CajaAhorro ca = new CajaAhorro(saldoAhorro, interes);
				cliente.getCuenta().add(ca);

				System.out.println("Cuenta de ahorro creada exitosamente.");
				break;
			case 3:
				System.out.println("Ingrese el saldo de la cuenta sueldo:");
				double saldoSueldo = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea
				System.out.println("Ingrese la empresa de la cuenta sueldo:");
				String empresa = sc.nextLine();



				CuentaSueldo cs = new CuentaSueldo(saldoSueldo, empresa);
				cliente.getCuenta().add(cs);

				System.out.println("Cuenta sueldo creada exitosamente.");
				break;

		}

	}
	

	private static void  ingresarCuenta(Scanner sc, List<Cliente> clientes) {
		System.out.println("Ingrese número de cuenta:");
        int numero = sc.nextInt();
        sc.nextLine();

        for (Cliente cliente : clientes) {
            for (Cuenta cuenta : cliente.getCuenta()) {
                if (cuenta.getNumeroCuenta() == numero) {
                    System.out.println("Cuenta encontrada. Saldo: " + cuenta.getSaldo());
                    return;
                }
            }
        }

        System.out.println("Cuenta no encontrada.");
    }
	

	private static Cliente crearCliente(Scanner sc) {
		// Pedir al usuario que ingrese los datos del cliente
		System.out.println("Ingrese el nombre del cliente:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido del cliente:");
		String apellido = sc.nextLine();
		System.out.println("Ingrese el DNI del cliente:");
		int dni = sc.nextInt();
		sc.nextLine(); // Consumir el salto de línea


		//Pedir al usuario que ingrese los datos del contacto
		System.out.println("Ingrese la calle del cliente:");
		String calle = sc.nextLine();
		System.out.println("Ingrese el numero de calle del cliente:");
		int numeroCalle = sc.nextInt();
		System.out.println("Ingrese la localidad del cliente:");
		String localidad = sc.nextLine();
		System.out.println("Ingrese el mail del cliente:");
		String mail = sc.nextLine();
		System.out.println("Ingrese el telefono del cliente:");
		int telefono = sc.nextInt();
		System.out.println("Ingrese el codigo postal del cliente:");
		int cp = sc.nextInt();
		sc.nextLine(); // Consumir el salto de línea
		


		// Object Contacto is required to create Cliente
		Contacto contacto = new Contacto(calle, numeroCalle, localidad, mail, telefono, cp);



		sc.nextLine(); // Consumir el salto de línea
		// To create a Cliente object, we need to pass a new array to put accounts.
		return new Cliente(nombre, apellido, dni, contacto, new ArrayList<>());
	}
	

}
