package Ejercicio9;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Persona> personas = new ArrayList<>();
	private static ArrayList<Familia> familias = new ArrayList<>();

	public static void main(String[] args) {

		Persona persona1 = new Persona("Micaela", "Martinez", 17, "Femenino", true, false);
		personas.add(persona1);
		Persona persona2 = new Persona("Veronica", "Mino", 40, "Femenino", false, true);
		personas.add(persona2);
		Persona persona3 = new Persona("Ricardo", "Martinez", 43, "Masculino", false, true);
		personas.add(persona3);

		Familia martinez = new Familia("Martinez", "Olmos 802");
		familias.add(martinez);
		/*
		 * Familia becerra = new Familia("Becerra", "Saavedra 708");
		 * familias.add(becerra); Familia niccolai = new Familia("Nicolai",
		 * "J. Sixto Almiron 1534");
		 */

		System.out.println("Imprimiendo vector ");
		for (int j = 0; j < familias.size(); j++) {
			System.out.println("Familia: " + familias.get(j));
			for (int i = 0; i < personas.size(); i++) {
				System.out.println(" Persona: ");
				System.out.println(personas.get(i));
			}
		}
	}

} // ult llave
