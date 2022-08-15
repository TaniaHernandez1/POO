import java.util.Scanner;

public class mainEjercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String frase1, frase2, fraseFinal;
Scanner in = new Scanner(System.in);
System.out.println("Ingresar la primer frase: ");
frase1 = in.nextLine();
System.out.println("Ingresar la segunda frase: ");
frase2 = in.nextLine();
fraseFinal = frase1 + " " + frase2;
System.out.println("El resultado de las dos frases ingresadas es: " + fraseFinal);

	}

}
