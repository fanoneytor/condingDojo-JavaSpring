public class Cafe{
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeDeFiltro = 3;
        double precioCafeConLeche = 4.2;
        double precioCapuchino = 5;

    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;
        
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
        System.out.println(cliente1 + mensajePendiente);
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //

        if(estaListoOrden4){
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapuchino);
        }else{
            System.out.println(cliente4 + mensajePendiente);
        }

        if(estaListoOrden2){
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal + (2*precioCapuchino));
        }else{
            System.out.println(cliente2 + mensajePendiente);
        }

        System.out.println(mensajeMostrarTotal + (precioCafeConLeche-precioCafeDeFiltro));
    }
}
