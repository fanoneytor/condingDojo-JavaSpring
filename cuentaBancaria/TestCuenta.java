public class TestCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria(); 
        CuentaBancaria cuenta3 = new CuentaBancaria();
        
        cuenta1.depositar("ahorros", 100);
        cuenta1.depositar("ahorros", 250);
        cuenta2.depositar("ahorros", 50);
        cuenta2.depositar("ahorros", 50);
        cuenta3.depositar("ahorros", 120);
        cuenta3.depositar("ahorros", 180);

        cuenta1.getTotalCuentas();
    }
    
}
