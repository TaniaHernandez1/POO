import java.util.Scanner;

public class mainEjercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Ingresar la primer palabra: ");
String palabra1 = in.nextLine();
System.out.println("Ingresar la segunda palabra: ");
String palabra2 = in.nextLine();
System.out.println(palabra1 == palabra2);
System.out.println("Comparado con .equals(): " + palabra1.equals(palabra2));


	}

}
