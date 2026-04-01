package ar.com.unpaz.model;

public class CajaAhorro extends Cuenta {
    private double interes;

    public CajaAhorro( double saldo, double interes) {
        super(saldo);
        this.interes = interes;
    }
    


}
