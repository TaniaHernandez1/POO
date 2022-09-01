package ejercicio3;

public class Cancion {
	public String nombre;
	public String autor;
	public int duracion; /* en segundos */
	
	public Cancion(String nombre, String autor, int duracion) { //source y la ult de generar
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
