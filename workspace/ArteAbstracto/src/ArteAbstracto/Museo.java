package ArteAbstracto;

import java.util.ArrayList;
import java.util.Random;

public class Museo {

	public static void main(String[] args) {
		ArrayList<Arte> museo = new ArrayList<Arte> ();
		ArrayList<Integer> indice = new ArrayList<>();

		Pintura pintura1 = new Pintura("Oleo", "Pintura oleo" ,"Juan Oleo","Pintura de puro Oleo");
		Pintura pintura2 = new Pintura("Acuarela", "Pintura Acuarela" ,"Pedro Acuarela","Pintura de puro Acuarela");
		Pintura pintura3 = new Pintura("Acrilico", "Pintura Acrilico" ,"Victor Acrilico","Pintura de puro Acrilico");
		
		Escultura escultura1 = new Escultura("Marmol", "Escultura Marmol" ,"Juan Marmol","Escultura de puro Marmol");
		Escultura escultura2 = new Escultura("Bronce", "Escultura Bronce" ,"Pedro Bronce","Escultura de puro Bronce");
		Escultura escultura3 = new Escultura("Porcelana", "Escultura Porcelana" ,"Victor Porcelana","Escultura de puro Porcelana");
		
		museo.add(pintura1);
		museo.add(pintura2);
		museo.add(pintura3);
		museo.add(escultura1);
		museo.add(escultura2);
		museo.add(escultura3);
		
		for(int i=0; i<museo.size();i++) {
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(museo.size());
			if(indice.indexOf(numero)==-1) {
				indice.add(numero);
			}else {
				i--;
			}
		}
		
		for(int elemento: indice){
			museo.get(elemento).verArte();
		}
	}
}
