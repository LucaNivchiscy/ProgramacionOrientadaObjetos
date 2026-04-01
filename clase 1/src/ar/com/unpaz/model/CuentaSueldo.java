package ar.com.unpaz.model;

public class CuentaSueldo extends Cuenta {
    private String empresa;
    
    public CuentaSueldo( double saldo, String empresa) {
        super(saldo);
        this.empresa = empresa;
    }
    public String getEmpresa() {
        return empresa;
    }

}
