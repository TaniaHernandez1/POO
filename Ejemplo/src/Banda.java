import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Banda {
	
	private String estilo,nombre;
	private ArrayList<Musico> integrantes = new ArrayList<>();

	public Banda(String estilo, String nombre){
		this.estilo = estilo;
		this.nombre = nombre;
		this.generarIntegrantes();
	}
	
	private void generarIntegrantes() {
		Integer num = new Random().nextInt(10)+1;
		for(int i = 0; i < num;i++) {
			integrantes.add(new Musico());
		}
	}
	
	public String toSring() {
		String texto = "Banda " + this.nombre;
		for (Musico musico : integrantes) {
			texto = texto + "\n" + musico.imprimir();
		}
		return texto;
	}
	
	
}
