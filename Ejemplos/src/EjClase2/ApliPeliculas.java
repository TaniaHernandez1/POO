package EjClase2;
import java.util.Date;

public class ApliPeliculas { 

	public static void main(String[] args) {
		Persona director1 = new Persona("jorge", "Alpachino");
		Pelicula p1 = new Pelicula("Accion", "Duro de matar", Double.valueOf(120.3), new Date(), director1);
		System.out.println(p1);
	}

}
