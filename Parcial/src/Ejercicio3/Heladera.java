package Ejercicio3;

public class Heladera extends Electrodomestico {

	private String capacidad;
	private int freezer;

	public Heladera(String modelo, int precio, String marca, String color) {
		super(modelo, precio, marca, color);
		this.capacidad = capacidad;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public int getFreezer() {
		return freezer;
	}

	public String impHeladera() {
		return " Capacidad: " + this.capacidad + ", Freezer en litros: " + this.freezer;
	}

}
