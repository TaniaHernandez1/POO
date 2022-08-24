package excepcion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String  path ="";
		Scanner input = new Scanner(System.in);
			
		System.out.println("Ingrese nombre del archivo o directorio:");

		try { //BLOQUE TRY COMUN
			path = input.nextLine();// "assets/probando.csv"
			leerArchivo(path);

		} catch (IOException e) { //CATCH COMUN 
			//e.printStackTrace();
			System.err.println("no existe el archivo, se procede a crearlo ");
			crearArchivo(path);
		}
		/*catch (Exception|IOException e) { //CATCH multiples capturas 
		}*/
		finally {
			if(input != null) {
			input.close();}
		}
	}

	private static void leerArchivo(String path) throws IOException {
		Scanner inFile = new Scanner(Paths.get(path));
		System.out.printf("%-10s%-12s%-12s%10s%n", "cuenta", "nombre", "apellido", "balance");
		inFile.useDelimiter("\\r\\n|\\n\\r");
		String[] datos;
		while (inFile.hasNext()) {
			datos = inFile.next().split(";");
			System.out.println(Integer.valueOf(datos[0]) + " " + datos[1] + " " + datos[2] + " "
					+ Double.valueOf(datos[3].replace(",", ".")));
		}
		inFile.close();
		
	}
	private static void crearArchivo(String path) {
		Scanner input = new Scanner(System.in);
		try (Formatter output = new Formatter(path)) { //TRY-WITH-RESOURCES se asegura de cerrar el recurso antes que el programa termine
			//aplica para todo lo que implemente la interfaz java.lang.AutoCloseable
			System.out.printf("%s%n%s%n?", "Ingrese numero de cuenta, nombre, apellido, balance (..X,XX).",
					"ingrese ctrl+z para finalizar.");
			while (input.hasNext()) {
				try {
					output.format("%d;%s;%s;%.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
				} catch (NoSuchElementException elementException) {
					System.err.println("Valor invalido. Ingrese otra vez");
					input.nextLine();
				}
				System.out.print("? ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			input.close();
		}
		input.close();
		}

}
