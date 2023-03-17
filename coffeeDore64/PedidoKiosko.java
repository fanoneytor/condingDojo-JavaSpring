import java.util.ArrayList;
public class PedidoKiosko {
    private ArrayList<Articulo> menu;
    private ArrayList<Pedido> pedidos;

    public PedidoKiosko(){
        menu = new ArrayList<>();
        pedidos = new ArrayList<>();

    }

    public void addMenuItem(String nombre, double precio){
        int index = menu.size();
        Articulo articulo = new Articulo(nombre, precio, index);
        menu.add(articulo);
    }

    public void displayMenu(){
        for(Articulo elemento: menu){
            System.out.printf("%1$s %2$s -- $%3$s%n", elemento.getIndex(), elemento.getNombre(), elemento.getPrecio());
        }
    }

    public void newOrder() {        
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();
    
        Pedido pedido = new Pedido(name);
        
        displayMenu();

        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            pedido.addArticulos(menu.get(Integer.parseInt(itemNumber)));
            displayMenu();
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();
        }
        pedido.display();
    }

    public ArrayList<Articulo> getMenu(){
        return menu;
    }

    public void setMenu(ArrayList<Articulo> menu){
        this.menu = menu;
    }

    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
    }
    
}
