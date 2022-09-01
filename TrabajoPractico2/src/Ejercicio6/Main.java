package Ejercicio6;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Lili ", "Hernandez ", LocalDate.of(1999, 11, 1));
		Persona persona2 = new Persona("Pamela","Juarez",LocalDate.of(1983, 12, 10));
		Persona persona3 = new Persona ("Gaston","Perez", LocalDate.of(1993, 2, 10));
		System.out.println("Nombre y Apellido: " + persona1.getNombre() + persona1.getApellido() + "- Fecha de nacimiento: " + persona1.getFechaNacimiento() );
		System.out.println("Nombre y Apellido: " + persona2.getNombre() + persona2.getApellido() + "- Fecha de nacimiento: " + persona2.getFechaNacimiento() );
		System.out.println("Nombre y Apellido: " + persona3.getNombre() + persona3.getApellido() + "- Fecha de nacimiento: " + persona3.getFechaNacimiento() );


	}

}
