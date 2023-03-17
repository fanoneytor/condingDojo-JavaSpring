package com.codingdojo.stefano;

public class Auto extends Vehiculo implements ManejarVehiculo {
	
	private String placas;

	public Auto(String modelo, String marca, int anio, String color, int ruedas, String placas) {
		super(modelo, marca, anio, color, ruedas);
		this.placas = placas;
		// TODO Auto-generated constructor stub
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	//Polimorfismo: el tener el mismo metodo a travez de clases PERO con distintos comportamientos.
	
	public void imprimir() {
		//System.out.println("Año: " + this.anio +" Marca: " + this.marca + " Modelo: " + this.modelo + " Placas: " + this.placas);
		super.imprimir();
		System.out.println("Placas: " + this.placas);
	}
	
	public void acelerar() {
		System.out.println("Voy a acelerar... ");
		velocidad += 2;
		System.out.println("Mi velocidad es de: " + velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Voy a bajar mi velocidad... ");
		velocidad -= 2;
		System.out.println("Mi velocidad es de : " + velocidad);
	}
}
