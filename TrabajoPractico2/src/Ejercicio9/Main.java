package Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		ArrayList<Persona> personasFamilia1 = new ArrayList<Persona>();
		ArrayList<Persona> personasFamilia2 = new ArrayList<Persona>();
		ArrayList<Persona> personasFamilia3 = new ArrayList<Persona>();
		List<Familia> familias = new ArrayList<Familia>();

		Persona persona1F1 = new Persona("Micaela", "Martinez", 17, "Femenino", true, false);
		Persona persona2F1 = new Persona("Veronica", "Mino", 40, "Femenino", false, true);
		Persona persona3F1 = new Persona("Ricardo", "Martinez", 43, "Masculino", false, true);

		personasFamilia1.add(persona2F1);
		personasFamilia1.add(persona1F1);
		personasFamilia1.add(persona3F1);

		Familia familia1 = new Familia("Los Olmos 802", "Martinez");
		familias.add(familia1);

		Persona persona1F2 = new Persona("Juliana", "Hernández", 14, "Femenino", true, false);
		Persona persona2F2 = new Persona("Veronica", "Benitez", 40, "Femenino", true, true);
		
		personasFamilia2.add(persona1F2);
		personasFamilia2.add(persona2F2);

		Familia familia2 = new Familia("Los Olmos 804", "Benitez");
		familias.add(familia2);

		Persona persona1F3 = new Persona("Manuel", "Muñoz", 45, "Masculino", false, true);
		Persona persona2F3 = new Persona("Ricardo", "Muñoz", 12, "Masculino", true, false);
		Persona persona3F3 = new Persona("Mirta", "Morales de Muñoz", 44, "Femenino", false, false);
		Persona persona4F3 = new Persona("Ramiro", "Muñoz", 20, "Masculino", true, true);

		personasFamilia3.add(persona1F3);
		personasFamilia3.add(persona2F3);
		personasFamilia3.add(persona3F3);
		personasFamilia3.add(persona4F3);

		Familia familia3 = new Familia("Roca 947", "Muñoz");
		familias.add(familia3);

		System.out.println("Listado de familias: ");
		while (i <= 2) {
			System.out.println(" ");
			System.out.println(familias.get(i));
			if (i == 0) {
				System.out.println("Formada por "+personasFamilia1.size() + " integrantes: ");
				for (int j = 0; j < personasFamilia1.size(); j++) {
					System.out.println(personasFamilia1.get(j).toString());
				}
			}
			if (i == 1) {
				System.out.println("Formada por "+personasFamilia2.size() + " integrantes: ");
				for (int j = 0; j < personasFamilia2.size(); j++) {
					System.out.println(personasFamilia2.get(j).toString());
				}

			}
			if (i == 2) {
				System.out.println("Formada por "+personasFamilia3.size() + " integrantes: ");
				for (int j = 0; j < personasFamilia3.size(); j++) {
					System.out.println(personasFamilia3.get(j).toString());
				}

			}

			i++;
		} // while

//System.out.println(personas.get(i).getnombre); --> SI PONGO ESTO, SOLO ME MUESTRA EL NOMBRE
	}

} // ult llave
