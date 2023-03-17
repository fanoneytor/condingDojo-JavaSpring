package com.codingdojo.stefano;

public class Vehiculo {
	
	protected String modelo;
	protected String marca;
	protected int anio;
	protected String color;
	protected int ruedas;
	protected int velocidad;
	
	public Vehiculo() {
	}

	public Vehiculo(String modelo, String marca, int anio, String color, int ruedas) {
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
		this.color = color;
		this.ruedas = ruedas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void imprimir() {
		System.out.println("Año: " + this.anio+" Marca: " + this.marca + " Modelo: " + this.modelo + " Color: " + this.color + " Ruedas: " + this.ruedas);
	}
}
