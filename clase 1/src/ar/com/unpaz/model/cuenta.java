package ar.com.unpaz.model;



public class Cuenta {
	private static int ultimoNumero = 0;
	private int numeroCuenta;
	private double saldo;


	public Cuenta( double saldo) {
		this.numeroCuenta = generarNumeroCuenta();
		this.saldo = saldo;	
	}
	//numero de cuenta
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	private int generarNumeroCuenta() {
		ultimoNumero++;
		return ultimoNumero;
	}
	
	//Saldo
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
