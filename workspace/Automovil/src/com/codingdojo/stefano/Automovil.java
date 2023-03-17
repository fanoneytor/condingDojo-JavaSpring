package com.codingdojo.stefano;

public class Automovil {
	protected int gasolina = 10;
	

	public Automovil() {
	}

	public Automovil(int gasolina) {
		this.gasolina = gasolina;
	}
	
	public void cantidadGasolina() {
		if(gasolina>0) {
			System.out.println("Cantidad de gasolina: " + this.gasolina + "/10");			
		}else {
			System.out.println("Juego terminado, se acabo la gasolina.");
		}
		
	}
	
	

}
