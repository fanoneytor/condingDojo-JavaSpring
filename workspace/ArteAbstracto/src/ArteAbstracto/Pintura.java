package ArteAbstracto;

public class Pintura extends Arte {
	private String tipoPintura;	

	public Pintura(String tipoPintura, String titulo, String autor, String descripcion){
		super(titulo, autor, descripcion);
		this.tipoPintura = tipoPintura;
	}

	public void verArte() {
		System.out.printf("Tipo pintura: %s%nTitulo: %s%nAutor: %s%nDescripcion: %s%n%n", tipoPintura, titulo, autor, descripcion);	
	}
}
