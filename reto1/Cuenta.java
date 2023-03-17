public class Cuenta {
    private String titular;
    private long numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(){

    }

    public Cuenta(String titular, long numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }    
}
