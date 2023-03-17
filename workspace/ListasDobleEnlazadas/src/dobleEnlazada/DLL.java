package dobleEnlazada;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    public void push(Node newNode) {
    	// si no hay head en la lista, es decir, una lista vacía, establecemos el newNode para que sea head y el tail de la lista
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // primero encuentra el lastNode en la lista
        // luego, establece next al lastNode para ser el newNode
        // después, tenemos que establecer el previous del lastNode al lastNode que encontramos antes
        // finalmente, establecemos el tail de la lista para que sea el nodo que hemos agregado
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;    	
    }
    
    public void printValuesForward() {
        // encuentra el primer nodo, también conocido como head.
        Node current = this.head;
        
        // mientras exista el nodo actual...
        while(current != null) {
            // imprime su valor
            System.out.println(current.value);
            // y pasa al siguiente nodo.
            current = current.next;
        }
    }
    
    void printValuesBackward() {
    	Node current = this.tail;
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }    	
    }
    
    Node pop() {
    	Node runner = this.head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        Node eliminado = runner.next;
        runner.next = null;
        tail = runner;
        return eliminado;
    }
    
    boolean contains(Integer value) {
    	Node runner = head;
    	boolean existe = false;
    	while(runner.next != null) {
    		if(runner.value == value) {
    			System.out.println("Valor: " + runner.value + " Encontrado...");
    			existe = true;
    		}
            runner = runner.next;
        }
    	if(!existe) {
    		return false;
    	}else {
    		return true;
    	}
    }
    
    int size() {
    	Node runner = this.head;
    	int contador=1;
        while(runner.next.next != null) {
        	contador++;
            runner = runner.next;
        }
        return contador+1;
    }
}
