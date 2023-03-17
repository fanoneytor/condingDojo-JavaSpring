import java.util.ArrayList; //Importamos la libreria para utilizar la variable tipo objeto de arreglo.

public class Intro{
    public static void main(String[] args){
        System.out.println("asrfasf");

        //Variables primitivas
        int miNumero;//Podemos declarar una variable sin establecer su valor.
        miNumero = 400; //Despues asignarle el valor.
        double pi = 3.1416; //Podemos declarar y asignar un valor en la misma linea.
        boolean bool = true;
        char singleChar = 'A';
        String multiplesChars = "ABC";

        //Variables tipo objeto --> Metodos o funciones pre-hechas
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myCHar = 'A';

        System.out.println(miNumero);
        System.out.println(myInt);

        String myString = myInt.toString();
        System.out.println(myString.length());

        //Cadenas -Strings
        String cadena = "Buenos dias a todos mis compañeros";
        int length = cadena.length();
        System.out.println("La longitud de la cadena es: " + length);
        char letra = cadena.charAt(1);
        System.out.println(letra);

        int a = cadena.indexOf("Buenos"); //Regresa la posicion en la que se encuentra la palabra "Buenos"
        System.out.println(a);
        int b = cadena.indexOf("compañeros");
        System.out.println(b);

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String str1 = "Mi nombre es ";
        String str2 = "Stefano Arias";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String x = "hola";
        String y = "hola";
        System.out.println(x.equals(y));

        //Arreglos 
        int[] myArray;
        myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        //myArray[5] = 10; --> Error fuera de indice.

        System.out.println(myArray[2]);

        int[] myArray2 = {4, 8, 8, 5, 9};

        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        myArray3.add(10);

        //Condicionales y operadores
        boolean llueve = true;
        boolean soleado = false;

        if(llueve){
            System.out.println("Lleva un paraguas.");
        }

        if(soleado){
            System.out.println("Ponte bloqueador");
        }else{
            System.out.println("Disfruta tu dia");
        }

        llueve = false;
        soleado = true;

        if(llueve){
            System.out.println("Lleva un paraguas.");
        }else if(soleado){
            System.out.println("Ponte bloqueador");
        }else{
            System.out.println("Disfruta tu dia");
        }
    }
}