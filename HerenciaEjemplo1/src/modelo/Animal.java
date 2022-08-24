package modelo;

public abstract class Animal {
	private Double peso;
	
	public Animal() {
		System.out.println("En animal");
	}

	public Animal(Double peso) {
		super();
		this.peso = peso;
		System.out.println("En animal, peso: "+peso);
	}
	
	public abstract void comer();
	

}
