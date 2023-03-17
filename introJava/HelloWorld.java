public class HelloWorld {
    /*
     * Tipo de funcion: public, private, protected.
     * STATIC - Pendiente
     * Tipo de valor de retorno; String, int, double. Si NO regresa nada es void
     */
    public static String hola(){
        return "Hola mundo";
    }
    
    public static String hola(String nombre){
        return "Hola " + nombre;
    }

    public static String hola(String nombre, String apellido){
        return "Hola " + nombre + " " + apellido;
    }

    public static String hola(String nombre, int edad){
        return "Hola " + nombre + " Tu edad es: " + edad;
    }

    public static void hola_void(){
        System.out.println("Hola void");
    }
}
