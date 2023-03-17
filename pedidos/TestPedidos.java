public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo articulo1 = new Articulo("moka", 4.5);
        Articulo articulo2 = new Articulo("latte", 4);
        Articulo articulo3 = new Articulo("cafe de goteo", 2.5);
        Articulo articulo4 = new Articulo("capuchino", 3);

    
        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido("Cindhuri");
        Pedido pedido2 = new Pedido("Jimmy");
        pedido1.items.add(articulo1);
        pedido1.total += articulo1.precio;
        pedido2.listo = true;

        Pedido pedido3 = new Pedido("Noah");
        pedido3.items.add(articulo4);
        pedido3.total += articulo4.precio;

        Pedido pedido4 = new Pedido("Sam");
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;


    
        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);

        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.listo);

        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.listo);

        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.listo);
    }
}

