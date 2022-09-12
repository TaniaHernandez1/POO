package Ejercicio3;

import java.util.ArrayList;
import java.util.Random;

public class Electrodomestico {
	private String modelo;
	private int precio;
	private String marca;
	private String color;
	ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

	public Electrodomestico(String modelo, int precio, String marca, String color) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;
	}

	private String impElectr() {
		return "Modelo: " + this.modelo + ", Precio:  " + this.precio + ", Marca: " + this.marca + ", Color: "
				+ this.color;
	}

}
