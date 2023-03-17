package asignacionLista;

public class ListaSimpleEnlazada {
    public Nodo head;
    public ListaSimpleEnlazada() {
    	this.head = null;
    }
    // Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
    public void add(int value) {
        Nodo newNodo = new Nodo(value);
        if(head == null) {
            head = newNodo;
        } else {
            Nodo runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNodo;
        }
    } 
    
    public void remove() {
    	Nodo runner = head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }
    
    public void printValues() {
    	Nodo runner = head;
    	System.out.println("Valor: " + runner.value);
        while(runner.next != null) {
            runner = runner.next;
            System.out.println("Valor: " + runner.value);
        }        
    }
    
    public void encontrar(int n) {
    	Nodo runner = head;
    	boolean existe = false;
    	while(runner.next != null) {
    		if(runner.value == n) {
    			System.out.println("Valor: " + runner.value + " Encontrado...");
    			existe = true;
    			break;
    		}
            runner = runner.next;
        }
    	if(!existe) {
    		System.out.println("Nodo no encontrado...");
    	}
    }
    
    public void eliminarNodoSig(int n) {
    	Nodo runner = head;
    	if(n == 0) {
    		head = runner.next;    		
    	}else {
    		for(int i = 1; i<n; i++) {
        		runner = runner.next;    		
        	}
        	runner.next = runner.next.next;    		
    	}    	
    }
}
