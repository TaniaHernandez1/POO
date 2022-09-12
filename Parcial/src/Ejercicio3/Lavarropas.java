package Ejercicio3;

public class Lavarropas extends Electrodomestico {
	private Boolean cargaFrontal;
	private Double capacidad;

	public Lavarropas(String modelo, int precio, String marca, String color, Boolean cargaFrontal, Double capacidad) {
		super(modelo, precio, marca, color);
		this.cargaFrontal = cargaFrontal;
		this.capacidad = capacidad;
	}

	public Boolean getCargaFrontal() {
		return cargaFrontal;
	}

	public Double getCapacidad() {
		return capacidad;
	}

	public String impLavarropa() {
		return "Carga frontal: " + this.cargaFrontal + ", capacidad: " + this.capacidad;
	}
}
