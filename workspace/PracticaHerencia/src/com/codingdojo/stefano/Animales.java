package com.codingdojo.stefano;

public class Animales {
	protected String nombre;
	protected int edad;
	protected int maxEdad;
	protected double altura;
	
	public Animales() {
	}

	public Animales(String nombre, int edad, int maxEdad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.maxEdad = maxEdad;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMaxEdad() {
		return maxEdad;
	}

	public void setMaxEdad(int maxEdad) {
		this.maxEdad = maxEdad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
