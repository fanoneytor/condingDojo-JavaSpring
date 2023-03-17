import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<>();

    public Pedido(){
        this.nombre = "Invitado";
    }
    public Pedido(String nombre){
        this.nombre = nombre;
    }

    public void addArticulos(Articulo articulo){
        this.items.add(articulo);
    }

    public void getStatusMessage(){
        if(this.listo){
            System.out.println("\nTu pedido está listo");
        }else{
            System.out.println("\nGracias por esperar. Tu pedido estará listo pronto");
        }
    }

    public void display(){
        System.out.printf("%nNombre Cliente: %s%n", this.nombre);
        for (Articulo elemento : items) {
            System.out.printf("%1$s: $%2$s%n", elemento.getNombre(), elemento.getPrecio());            
        }
        System.out.printf("Total: %s", getOrderTotal());
    }

    public double getOrderTotal(){
        double total = 0;
        for (Articulo elemento : items) {
            total += elemento.getPrecio();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getListo(){
        return listo;
    }
    public void setListo(boolean listo){
        this.listo = listo;
    }

    public ArrayList<Articulo> getItems() {
        return items;
    }
    public void setItems(ArrayList<Articulo> items) {
        this.items = items;
    }
}
