package guardianaZoo;

public class Murcielago extends Mamifero{

	public Murcielago() {
		super();
		setNivelEnergia(300);
	}

	public Murcielago(int nivelEnergia) {
		super(nivelEnergia);
		setNivelEnergia(300);
	}
	
	public void volar(){
		System.out.println("Despegando...");
		this.nivelEnergia -= 50;
		mostrarEnergia();
	}
	
	public void comerHumanos(){
		System.out.println("Comiendo humanos...");
		this.nivelEnergia += 25;
		mostrarEnergia();
	}
	
	public void atacarPueblo(){
		System.out.println("Atacando pueblo...");
		this.nivelEnergia-=100;
		mostrarEnergia();
	}
	
}
