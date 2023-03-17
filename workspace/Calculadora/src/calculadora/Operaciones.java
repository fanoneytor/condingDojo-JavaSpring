package calculadora;

import java.util.ArrayList;

public class Operaciones {
	public boolean validarNumero(String numero) {		
		try {
			Double.parseDouble(numero);
			return true;			
		}catch(NumberFormatException e){
			return false;			
		}		
	}
	
	public boolean validarOperador(String numero) {
		String simbolos = "+"+"-"+"*"+"/";
		if(simbolos.contains(numero)) {
			return true;
		}else {
			return false;
		}
	}
	//&& (simbolos.get(i+1)=="*" || simbolos.get(i+1)=="/")
	public void getResultado(ArrayList<Double> numeros, ArrayList<String> simbolos){
		double resultado=0;
		for(int i=0; i<simbolos.size(); i++) {			
			if(simbolos.get(i).equals("*")) {
				resultado = numeros.get(i) * numeros.get(i+1);
				numeros.set(i, 0.0);
				numeros.set(i+1, resultado);
				simbolos.set(i, "+");
			}
			if(simbolos.get(i).equals("/")) {
				resultado = numeros.get(i) / numeros.get(i+1);
				numeros.set(i, 0.0);
				numeros.set(i+1, resultado);
				simbolos.set(i, "+");
			}
		}
		resultado = numeros.get(0);
		for(int i=0; i<simbolos.size(); i++) {			
			if(simbolos.get(i).equals("+")) {
				resultado += numeros.get(i+1);
			}
			if(simbolos.get(i).equals("/")) {
				resultado -= numeros.get(i+1);
			}
		}
		System.out.println("El resultado es: " + resultado);
	}
}