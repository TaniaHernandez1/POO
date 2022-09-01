package Ejercicio8;

import java.time.LocalDate;
import java.util.Calendar;

public class Persona { //clase persona con atributos
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;

	public Persona(String nombre, String apellido, Calendar fechaNacimiento) {//Constructor con parametros x atributo
		this.nombre= nombre;
		this.apellido = apellido; 
		this.fechaNacimiento = fechaNacimiento;
	} 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + "]";
	}


	
} //Ult
