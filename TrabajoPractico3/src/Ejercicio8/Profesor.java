package Ejercicio8;

public class Profesor {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer horasTrabajadas;

	public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

}
