package Ejercicio9;

import java.security.PublicKey;
import java.util.ArrayList;

import Ejercicio5.Materia;

public class Familia {
	private String apellido;
	private String direccion;
	private ArrayList personas;


	public Familia(String direccion, String apellido) {
		super();
		this.apellido = apellido;
		this.direccion = direccion;
		personas = new ArrayList<Persona>();
	}

	public String getDireccion() {
		return direccion;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Familia: " + apellido + ", direccion: " + direccion +  ".";
	}



} // Ult llave
