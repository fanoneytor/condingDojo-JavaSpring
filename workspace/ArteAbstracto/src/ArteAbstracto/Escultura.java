package ArteAbstracto;

public class Escultura extends Arte {
	private String material;
	

	public Escultura(String material, String titulo, String autor, String descripcion) {
		super(titulo, autor, descripcion);
		this.material = material;
	}


	public void verArte() {
		System.out.printf("Material: %s%nTitulo: %s%nAutor: %s%nDescripcion: %s%n%n", material, titulo, autor, descripcion);	
	}
}
