package Ejercicio9;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private Boolean estudia;
	private Boolean trabaja;

	private ArrayList<Persona> personas = new ArrayList<>();

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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Boolean getEstudia() {
		return estudia;
	}

	public void setEstudia(Boolean estudia) {
		this.estudia = estudia;
	}

	public Boolean getTrabaja() {
		return trabaja;
	}

	public void setTrabaja(Boolean trabaja) {
		this.trabaja = trabaja;
	}

	public void añadirPersona(Persona persona) {
		this.personas.add(persona);
	}

} // Ult llave
