package EjClase2;
import java.util.Date;

public class Pelicula {
	private String  genero, titulo;
	private Double duracion; 
	private Date estreno;
	private Persona director;
	public Pelicula(String genero, String titulo, Double duracion, Date estreno, Persona director) {
		super();
		this.genero = genero;
		this.titulo = titulo;
		this.duracion = duracion;
		this.estreno = estreno;
		this.director = director;
	}


	@Override
	public String toString() {
		return "Pelicula [genero=" + genero + ", titulo=" + titulo + ", duracion=" + duracion + ", estreno=" + estreno
				+ ", director=" + director + "]";
	}


	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public Date getEstreno() {
		return estreno;
	}
	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}
	public Persona getDirector() {
		return director;
	}
	public void setDirector(Persona director) {
		this.director = director;
	}



	//cast lista de persona 

}
}