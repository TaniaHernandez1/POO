import java.util.Scanner;

public class mainEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int numEntero1, numEntero2;
	Scanner in = new Scanner(System.in);
	System.out.println("Ingresar el primer numero entero: ");
	numEntero1 = in.nextInt();
	System.out.println("Ingresar el segundo numero entero: ");
	numEntero2 = in.nextInt();
	int sumaEnteros;
	sumaEnteros = numEntero1 + numEntero2;
	System.out.println("La suma de los numeros enteros es: " + sumaEnteros);

	}

}
