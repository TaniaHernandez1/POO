package modelo;

public abstract class Carnivoro extends Animal {

	public Carnivoro() {
		super();
		System.out.println("En carnivoro");
	}
	public Carnivoro(Double peso) {
		//super(peso);
		System.out.println("En carnivoro");
	}
	@Override
	public void comer() {
		System.out.println("come carne");
	} 
}
