import java.util.Random;

public class Musico {
	
	private String nombre, instrumento;
	
	public Musico() {
		this.GenerarNombres();
	}
	
	private void GenerarNombres() {
		String[] nombres = {"nombre1","nombre2","nombre3","nombre4","nombre5"};
		String[] instrumentos = {"instrumento1","instrumento2","instrumento3","instrumento4","instrumento5"};
		this.nombre = nombres[new Random().nextInt(5)];
		this.instrumento = instrumentos[new Random().nextInt(5)];
	}

	public String imprimir() {
		return "Nombre = "+this.nombre + ", Instrumento = "+ this.instrumento + "\n";
	}
	
}
