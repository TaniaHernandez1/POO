import java.util.Random;
import java.util.Scanner;

public class mainEjercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAleatorio;
		// RANDOM
		//numAleatorio = 1;
		Random ran = new Random();
		numAleatorio = 1+ ran.nextInt(10);
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = in.nextInt();
		if ( num > numAleatorio) {
			System.out.println(numAleatorio + " es menor a " + num);
		}
		if ( num < numAleatorio) {
			System.out.println(numAleatorio + " es mayor a " + num);
		}
		if ( num == numAleatorio) {
			System.out.println(numAleatorio + " es igual a " + num);
		}
		if ( num != numAleatorio) {
			System.out.println(numAleatorio + " es distinto a " + num);
		}
		if ( num <= numAleatorio) {
			System.out.println(numAleatorio + " es mayor o igual a " + num);
		}
		if ( num >=  numAleatorio) {
			System.out.println(numAleatorio + " es menor o igual a " + num);
		}
		
		
		
	}

}
