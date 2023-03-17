import java.util.ArrayList;
public class TestReto2 {
    public static void main(String[] args) {
        int[] numeros = {1, 8, 3, 4, 5};
        Reto2 app = new Reto2();
        int resultado = app.sumatoria(numeros);
        int mayor = app.numeroMayor(numeros);
        System.out.println("La sumatoria es: " + resultado);
        System.out.println("El valor mayor es: " + mayor);

        int numero1 = 4;
        int numero2 = 12;
        System.out.println("El factorial de "+numero1+" es " + app.factorial(numero1));
        ArrayList<Integer> respuesta = app.fibonacci(numero2);
        System.out.println("Los " + numero2 +" primeros numeros de fibonacci son: " + respuesta);
    }    
}
