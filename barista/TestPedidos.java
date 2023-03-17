public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo articulo1 = new Articulo("moka", 4.5);
        Articulo articulo2 = new Articulo("latte", 4);
        Articulo articulo3 = new Articulo("cafe de goteo", 2.5);
        Articulo articulo4 = new Articulo("capuchino", 3);

        //Pedidos sin cliente especificado
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        //Pedidos con cliente
        Pedido pedido3 = new Pedido("Juan");
        Pedido pedido4 = new Pedido("Pedro");
        Pedido pedido5 = new Pedido("Pablo");

        //Articulos para cada pedido
        pedido1.addArticulos(articulo1);
        pedido1.addArticulos(articulo4);
        pedido2.addArticulos(articulo2);
        pedido2.addArticulos(articulo4);
        pedido3.addArticulos(articulo1);
        pedido3.addArticulos(articulo1);
        pedido4.addArticulos(articulo1);
        pedido4.addArticulos(articulo2);
        pedido5.addArticulos(articulo3);
        pedido5.addArticulos(articulo2);
        
        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();


        pedido1.setListo(true);
        pedido4.setListo(true);
        pedido1.getStatusMessage();
    }
}

