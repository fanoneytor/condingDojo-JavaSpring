package com.codingdojo.stefano;

public class Conductor extends Automovil{
	
	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	public Conductor(int gasolina) {
		super(gasolina);
		// TODO Auto-generated constructor stub
	}

	public void conducir() {
		System.out.println("Conduciendo...");
		this.gasolina -= 1;
	}
	
	public void propulsores() {
		if(this.gasolina > 3) {
			System.out.println("Propulsores Activos...");
			this.gasolina -= 3;			
		}else {
			System.out.println("Nivel de gasolina bajo, no es posible usar propulsores...");
		}
	}
	
	public void llenarGasolina() {
		if(this.gasolina <= 8) {
			System.out.println("Llenando gasolina...");
			this.gasolina += 2;			
		}else {
			System.out.println("El nivel de la gasolina es alto...");
		}		
	}

}
