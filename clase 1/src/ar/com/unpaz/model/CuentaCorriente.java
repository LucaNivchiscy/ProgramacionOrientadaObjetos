package ar.com.unpaz.model;

public class CuentaCorriente  extends Cuenta {
    private double descubierto;


    public CuentaCorriente(double saldo, double descubierto) {
        super(saldo);
        this.descubierto = descubierto;
    }


    public double getDescubierto() {
        return descubierto;
    }
} 
