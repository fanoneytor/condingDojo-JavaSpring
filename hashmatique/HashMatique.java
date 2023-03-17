package hashmatique;

import java.util.HashMap;
import java.util.Set;

public class HashMatique {
    public static void main(String[] args) {
        HashMatique objeto = new HashMatique();
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("cancion1", "Letra de la cancion numero 1");
        tracklist.put("cancion2", "Letra de la cancion numero 2");
        tracklist.put("cancion3", "Letra de la cancion numero 3");
        tracklist.put("cancion4", "Letra de la cancion numero 4");
        System.out.println("Letra de la cancion: " + objeto.unTrack(tracklist, "cancion3"));
        objeto.listaTracks(tracklist);

    }

    public static String unTrack(HashMap<String, String> tracklist, String titulo) {
        String letra = tracklist.get(titulo);
        return letra;
    }

    public static void listaTracks(HashMap<String, String> tracklist) {
        Set<String> keys = tracklist.keySet();
        System.out.println("Lista de cancines:");
        for (String key : keys) {
            System.out.println(key);
            System.out.println(tracklist.get(key));
        }
    }
}