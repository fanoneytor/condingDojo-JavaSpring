import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public static ArrayList<Integer> getTenRolls() {
        Random aleatorio = new Random();
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(aleatorio.nextInt(21));                        
        }
        return listaNumeros;        
    }

    public static String getRandomLetter() {
        Random aleatorio = new Random();
        int indiceAleatorio = aleatorio.nextInt(26);
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                            "p","q","r","s","t","u","v","w","x","y","z"};
        return letras[indiceAleatorio];      
    }

    public static String generatePassword() {
        String lista = "";

        for (int i = 0; i < 8; i++) {
            lista += getRandomLetter();                   
        }
        return lista;        
    }

    public static ArrayList<String> getNewPasswordSet(int longitud) {
        ArrayList<String> matrizPass = new ArrayList<String>();

        for (int i = 0; i < longitud; i++) {
            matrizPass.add(generatePassword());                    
        }
        
        return matrizPass;
    }

    public static ArrayList<String> shuffleArray(ArrayList<String> arreglo) {
        ArrayList<String> nuevoArreglo = new ArrayList<>();
        for (String elemento : arreglo) {
            nuevoArreglo.add(elemento);            
        }
        Random aleatorio = new Random();
        int longitud = nuevoArreglo.size();
        int prev = aleatorio.nextInt(longitud);
        int next = aleatorio.nextInt(longitud);
        String prevStr = nuevoArreglo.get(prev);
        String nextStr = nuevoArreglo.get(next);
        for (int i = 0; i < longitud; i++) {
            nuevoArreglo.set(prev, nextStr);
            nuevoArreglo.set(next, prevStr);
            prev = aleatorio.nextInt(longitud);
            next = aleatorio.nextInt(longitud);
            prevStr = nuevoArreglo.get(prev);
            nextStr = nuevoArreglo.get(next);            
        }        
        return nuevoArreglo;        
    }
}
