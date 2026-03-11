package ar.com.unpaz.model;

public class Contacto {
	private String calle;
	private int numeroCalle;
	private String localidad;
	private String mail;
	
	
	//calle
	public String getCalle() {
		return calle;
		
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
//Numero de Calle
	public int getNumeroCalle() {
	return numeroCalle;
		
	}
	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	
	
//localidad
	public String getLocalidad() {
	return localidad;
		
	}
	public void setLocalidad(String localidad) {
		this.localidad= localidad;
	}
	
	//Mail
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
		
	}
	
}
