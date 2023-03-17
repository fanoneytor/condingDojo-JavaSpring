package com.codingdojo.stefano;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Vehiculo barco = new Vehiculo("Civic", "Honda", 2015, "Rojo", 4);
		
		barco.imprimir();
		
		Auto auto1 = new Auto("Civic", "Honda", 2020, "Azul", 4, "ABC123");
		auto1.imprimir();
		
		auto1.acelerar();
		auto1.acelerar();
		auto1.desacelerar();
		
		System.out.println("------");
		
		Bicicleta bici = new Bicicleta();
		
		bici.acelerar();
		bici.acelerar();
		bici.desacelerar();
	}
}
