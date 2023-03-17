package com.codingdojo.stefano;

public interface ManejarVehiculo {
	/*
	 3 tipos de metodos distintos
	 Metodo abstracto: Obliga a la clase a que se implemente en el metodo. OJO no tiene accion.
	 Metodo Default: Ese no necesita ser implementado, ese ya se declara en la interface.
	 Metodos Estaticos: Metodo que pertenece a la interface y solo se utiliza aqui.
	 */
	
	abstract void acelerar();
	abstract void desacelerar();
	
	default void checkEngines() {
		System.out.println("Revisando vehiculo");
	}
}
