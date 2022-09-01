package Ejercicio8;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Calendar fechaNacimiento = new GregorianCalendar();
		Persona persona1 = new Persona("Lili ", "Hernandez ", GregorianCalendar(1999,11,23));
		Persona persona2 = new Persona("Pamela","Juarez", GregorianCalendar(1983, 12, 10));
		Persona persona3 = new Persona ("Gaston","Perez", GregorianCalendar(1993, 2, 10));
		System.out.println("Nombre y Apellido: " + persona1.getNombre() + persona1.getApellido() + "- Fecha de nacimiento: " + persona1.getFechaNacimiento() );
		System.out.println("Nombre y Apellido: " + persona2.getNombre() + persona2.getApellido() + "- Fecha de nacimiento: " + persona2.getFechaNacimiento() );
		System.out.println("Nombre y Apellido: " + persona3.getNombre() + persona3.getApellido() + "- Fecha de nacimiento: " + persona3.getFechaNacimiento() );
//public static int calculoEdad (LocalDate.)
//Calendar inicio = Calendar.getInstance();
//inicio.set(2022, 8, 19);
//Calendar fechaActual = Calendar.getInstance();
//int diferencia = fechaActual.get(Calendar.YEAR)- persona1.get(FechaNacimiento.year);

	}

	private static Calendar GregorianCalendar(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

}