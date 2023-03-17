public class KioskoCafe {
    public static void main(String[] args) {

        PedidoKiosko pedido1 = new PedidoKiosko();

        pedido1.addMenuItem("Cafe", 3);
        pedido1.addMenuItem("Moka", 4.3);
        pedido1.addMenuItem("Latte", 4);
        pedido1.addMenuItem("Capuchino", 5);
        pedido1.newOrder();
    }
}

