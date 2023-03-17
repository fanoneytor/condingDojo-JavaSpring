package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCalculadora {
    
    public static void main(String[] args) {
    	ArrayList<Double> numeros = new ArrayList<Double>();
    	ArrayList<String> simbolos = new ArrayList<String>();
    	Scanner teclado = new Scanner(System.in);
    	String valor;
    	Operaciones operacion = new Operaciones();
    	boolean num=true;
    	while(true) {    		
    		if(num) {
    			System.out.print("Ingrese un numero: ");
        		valor = teclado.nextLine();
    			if(operacion.validarNumero(valor)) {
    				numeros.add(Double.parseDouble(valor));
    				num = false;
    			}else {
    				System.out.println("Error: " + valor+" No es un numero");
    			}		
    		}
    		if(!num){
    			System.out.print("Ingrese un operador: ");
        		valor = teclado.nextLine();
        		if(valor.equals("=")) {
        			break;
        		}
    			if(operacion.validarOperador(valor)) {
    				simbolos.add(valor);
    				num = true;
    			}else {
    				System.out.println("Error: " + valor+" No es un operador");
    			}
    		}
    	}    	
    	operacion.getResultado(numeros, simbolos);
    }        
}