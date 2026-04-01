package ar.com.unpaz.model;



public class Contacto {
	private String calle;
	private int numeroCalle;
	private String localidad;
	private String mail;
	private int telefono;
	private int cp;
	

	public Contacto(String calle, int numeroCalle, String localidad, String mail, int telefono, int cp) {
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.localidad = localidad;
		this.mail = mail;
		this.telefono = telefono;
		this.cp = cp;
	}
	
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

	//Telefono
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	//Codigo Postal
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
}
