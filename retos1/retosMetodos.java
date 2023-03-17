public class retosMetodos {
    public static void imprimeNumeros(int numero){
        System.out.println("Imprime los numeros de uno en uno.");
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);            
        }
    }

    public static void multiplosCinco(int numero) {
        System.out.println("Imprime los numero en multiplos de 5.");
        for (int i = 5; i <= numero; i+=5) {
            System.out.println(i);            
        }        
    }

    public static void divisible(int numero) {
        System.out.println("Numeros divisibles por 5(dojo) y 10(coding dojo).");

        for (int i = 1; i <= numero; i++) {
            if(i%5==0){
                System.out.println(i + " coding");
            }
            if(i%10==0){
                System.out.println(i + " coding dojo");
            }
        }        
    } 
    
    public static void impares(int numero) {
        System.out.println("Imprime los numeros impares");
        double sumatoria = 0;
        for (int i = 0; i <= numero; i++) {
            if(i%2 != 0){
                sumatoria+=i;
            }            
        }
        System.out.println("El resultado es: " + sumatoria);        
    }

    public static void cuentaRegresiva(int numero) {
        System.out.println("Imprimer cuenta regresica de 4 en 4.");
        for (int i = numero; i >= 0; i-=4) {
            System.out.println(i);
        }
        
    }
}