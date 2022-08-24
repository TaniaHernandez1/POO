package modelo;

public class Gato extends Carnivoro {

	public Gato(Double peso) {
		super(peso);
		System.out.println("En gato");
	}

	@Override
	public void comer() {
		
		System.out.println("El gato come ratones.");
		super.comer();
	}
}
