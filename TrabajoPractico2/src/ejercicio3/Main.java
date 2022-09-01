package ejercicio3;

public class Main {
	public static void main(String[] args) {
		Cancion cancion = new Cancion(null, null, 0);
		/* Definimos los valores de cada atributo */
		cancion.nombre = "Un velero llamado libertad";
		cancion.autor = "José Luis Perales";
		cancion.duracion=222;
		/* Imprimimos cada atributo */
		System.out.println(cancion.nombre);
		System.out.println(cancion.autor);
		System.out.println(cancion.duracion);
		}

}
