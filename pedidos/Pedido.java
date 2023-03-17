import java.util.ArrayList;

public class Pedido {
    String nombre;
    double total=0;
    boolean listo;
    ArrayList<Articulo> items = new ArrayList<>();

    public Pedido(){
    }
    public Pedido(String nombre){
        this.nombre = nombre;
    }
}
