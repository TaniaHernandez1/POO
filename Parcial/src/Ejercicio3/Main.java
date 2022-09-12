package Ejercicio3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Heladera> heladeras = new ArrayList<Heladera>();
		ArrayList<Cocinas> cocinas = new ArrayList<Cocinas>();
		ArrayList<Lavarropas> lavarrop = new ArrayList<Lavarropas>();

//Genero heladeras
		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt();
			heladeras.add(new Heladera("Modelo" + i, num, "Marca" + i, "color" + i));
		}
//Genero cocinas
		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt();
			cocinas.add(new Cocinas("Modelo" + i, num, "marca" + i, "color" + i, true));
		}
//Genero lavarropas
		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt();
			lavarrop.add(new Lavarropas("modelo" + i, num, "marca" + i, "color" + i, false, 80.0));
		}
		
		System.out.println("Heladeras recomendadas: ");
		int aleatorio = new Random().nextInt();
		for (int i = 0; i < 10; i++) {
			
		}
	}
}
