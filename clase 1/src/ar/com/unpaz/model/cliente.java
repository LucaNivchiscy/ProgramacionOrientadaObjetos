package ar.com.unpaz.model;

import java.util.List;
import java.util.ArrayList;


public class Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	private Contacto contacto;
	// acc list
	private List<Cuenta> cuentas;


	//Constructor
	public Cliente(String nombre, String apellido, int dni, Contacto contacto, List<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contacto = contacto;
		this.cuentas = (cuentas != null) ? cuentas : new ArrayList<>(); // Si la lista de cuentas es nula, se inicializa como una nueva lista vacía
		
	}
	
	//getters

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public List<Cuenta> getCuenta() {
		return cuentas;
	}

	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}

	public void setDni(int dni) {
		this.dni = dni;
		
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public void setCuenta(List<Cuenta> cuentas) {
		this.cuentas = (cuentas != null) ? cuentas : new ArrayList<>(); // Si la lista de cuentas es nula, se inicializa como una nueva lista vacía
	}

}
