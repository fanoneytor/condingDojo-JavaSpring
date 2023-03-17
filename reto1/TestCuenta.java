public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setTitular("Stefano");
        cuenta1.setNumeroCuenta(12345678);

        System.out.format("El numero de cuenta de %1$s es %2$s", cuenta1.getTitular(), cuenta1.getNumeroCuenta());
    }
    
}
