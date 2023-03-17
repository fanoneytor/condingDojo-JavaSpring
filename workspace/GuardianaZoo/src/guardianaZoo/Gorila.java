package guardianaZoo;

public class Gorila extends Mamifero{

	public Gorila() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gorila(int nivelEnergia) {
		super(nivelEnergia);
		// TODO Auto-generated constructor stub
	}
	
	public void lanzarAlgo() {
		System.out.println("El gorila arrojo un objeto...");
		this.nivelEnergia -= 5;
		mostrarEnergia();
	}
	
	public void comerBananas() {
		System.out.println("Gorila comio banana, gorila feliz...");
		this.nivelEnergia += 10;
		mostrarEnergia();
	}
	
	public void trepar() {
		System.out.println("El gorila trepo un arbol...");
		this.nivelEnergia -= 10;
		mostrarEnergia();
	}
	

}
