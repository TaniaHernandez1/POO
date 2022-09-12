package Ejercicio9;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private Boolean estudia;
	private Boolean trabaja;

	public Persona(String nombre, String apellido, int edad, String sexo, Boolean estudia, Boolean trabaja) {
		// Source -> ante ult generate
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.estudia = estudia;
		this.trabaja = trabaja;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public Boolean getEstudia() {
		return estudia;
	}

	public Boolean getTrabaja() {
		return trabaja;
	}

	@Override
	public String toString() {
		return "[nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", sexo: " + sexo
				+ ", estudia: " + estudia + ", trabaja: " + trabaja + "]";
	}
	

}
