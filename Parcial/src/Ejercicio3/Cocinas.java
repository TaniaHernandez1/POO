package Ejercicio3;

public class Cocinas extends Electrodomestico {
	private Boolean electrico;

	public Cocinas(String modelo, int precio, String marca, String color, Boolean electrico) {
		super(modelo, precio, marca, color);
		this.electrico = electrico;
	}

	public Boolean getElectrico() {
		return electrico;
	}

	public String impCocina() {
		return "Electrico: " + this.electrico;
	}
}
