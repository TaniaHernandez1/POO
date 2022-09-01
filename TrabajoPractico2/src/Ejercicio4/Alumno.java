package Ejercicio4;

public class Alumno {
	private String nombre;
	private String apellido;
	private int dni;

	public Alumno() {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		//	this.dni = dni;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreYApellido() {
		return getNombre() + " " + getApellido();
	}
	public void setNombreYApellido(String Nombre, String apellido) {
		this.nombre = Nombre;
		this.apellido = apellido;
	}
}
