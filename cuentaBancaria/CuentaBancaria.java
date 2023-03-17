import java.util.Random;
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private static int cantidadCuentas = 0;
    private static double dineroTotal = 0;

    CuentaBancaria() {
        this.numeroCuenta = generarCuenta();
        cantidadCuentas++;
    }

    public void depositar(String tipoCuenta, double deposito){
        if(tipoCuenta.equals("ahorros")){
            this.saldoCuentaAhorros+=deposito;
        }else if(tipoCuenta.equals("corriente")){
            this.saldoCuentaCorriente+=deposito;
        }else{
            System.out.println(tipoCuenta + "No es valido ingrese ahorros o corriente.");
        }
        dineroTotal+=deposito;
    }

    public void retiro(String tipoCuenta, double retiro){
        if(tipoCuenta.equals("ahorros") && this.saldoCuentaAhorros-retiro>=0){
            this.saldoCuentaAhorros -= retiro;
        }else if(tipoCuenta.equals("corriente") && this.saldoCuentaCorriente-retiro>=0){
            this.saldoCuentaCorriente -= retiro;
        }else if(this.saldoCuentaCorriente-retiro<0){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println(tipoCuenta + "No es valido ingrese ahorros o corriente.");
        }
        dineroTotal-=retiro;
    }

    private String generarCuenta(){
        Random rand = new Random();
        String numero = "";
        for (int i = 0; i < 10; i++) {
            numero += rand.nextInt(9);                        
        }
        return numero;
    }

    public void getTotalCuentas(){
        System.out.println("El total de dinero en ambas cuentas es: " + this.saldoCuentaAhorros+this.saldoCuentaCorriente);
    }

    public double getSaldoCuentaCorriente() {
        return this.saldoCuentaCorriente;
    }

    public double getSaldoCuentaAhorros() {
        return this.saldoCuentaAhorros;
    }
}
