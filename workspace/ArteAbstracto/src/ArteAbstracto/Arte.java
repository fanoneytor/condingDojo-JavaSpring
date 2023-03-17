package ArteAbstracto;

public abstract class Arte {
	protected String titulo;
	protected String autor;
	protected String descripcion;
	
	public Arte(String titulo, String autor, String descripcion) {
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
	}

	public abstract void verArte();
}
