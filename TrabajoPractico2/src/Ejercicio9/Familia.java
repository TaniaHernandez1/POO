package Ejercicio9;

import java.security.PublicKey;
import java.util.ArrayList;

import Ejercicio5.Materia;

public class Familia {
	private String direccion;
	private String apellido;
	private ArrayList personas;

	private ArrayList<Familia> familias = new ArrayList<>();

	public Familia(String direccion, String apellido) {
		super();
		//this.direccion = direccion;
		//this.apellido = apellido;
		personas = new ArrayList<Persona>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void añadirFamilia(Familia Familia) {
		this.familias.add(Familia);
	}

} // Ult llave
