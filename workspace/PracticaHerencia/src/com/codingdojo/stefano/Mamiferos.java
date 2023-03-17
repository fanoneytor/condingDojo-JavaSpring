package com.codingdojo.stefano;

public class Mamiferos extends Animales{
	private String alimentacion;
	private String habitad;

	public Mamiferos(String nombre, int edad, int maxEdad, double altura, String alimentacion, String habitad) {
		super(nombre, edad, maxEdad, altura);
		// TODO Auto-generated constructor stub
		this.alimentacion = alimentacion;
		this.habitad = habitad;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	public void imprimir() {
		System.out.printf("Nombre: %1$s%nEdad: %2$s%nEdad de Vida: %3$s%nAltura: %4$s%nAlimentacion: %5$s%nHabitad: %6$s%n", this.nombre, this.edad, this.maxEdad, this.altura, this.alimentacion, this.habitad);
	}
}
