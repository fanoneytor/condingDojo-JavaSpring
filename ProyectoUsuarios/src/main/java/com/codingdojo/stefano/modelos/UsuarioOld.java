package com.codingdojo.stefano.modelos;

public class UsuarioOld {
	
	private String nombre;
	private String Apellido;
	private long id;
	
	public UsuarioOld(String nombre, String apellido, long id) {
		this.nombre = nombre;
		Apellido = apellido;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	
}
