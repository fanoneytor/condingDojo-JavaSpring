import java.util.ArrayList;

public class Reto2 {
    // Crea un método que reciba un arreglo de enteros y regrese su sumatoria
    public static int sumatoria(int[] arreglo) {
        int sumatoria = 0;
        for (int valor : arreglo) {
            sumatoria += valor;
        }
        return sumatoria;
    }

    // Crea un método que reciba un arreglo de enteros y regrese el número mayor
    public static int numeroMayor(int[] arreglo) {
        int mayor = arreglo[0];

        for (int valor : arreglo) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

    // Crea un método que reciba un número entero y regrese el factorial de este. 4
    // ! = 1*2*3*4 = 24

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Crea un método que reciba un número y que regrese un ArrayList con la serie
    // fibonacci hasta esa posición
    // 0 1 1 2 3 5 8 13 21 34 55 89

    public static ArrayList<Integer> fibonacci(int posicion) {
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 1; i < posicion-1; i++) {
            fibo.add(fibo.get(i) + fibo.get(i - 1));
        }

        return fibo;
    }
}