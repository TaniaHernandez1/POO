import java.util.Random;
import java.util.Scanner;

public class mainEjercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, numAleatorio ;
Scanner in = new Scanner(System.in);
Random ram = new Random();
int [] vector = new int[6];

//INGRESANDO VALORES ENTRE 0 Y 50 (DEBE SER A PARTIR DE 1)

/*System.out.println("Ingresar valor numero entre 1 y 50: ");
num = in.nextInt();
vector[0] = num; */

for (int i = 0; i < vector.length; i++) {
	System.out.println("Ingresar valor numero entre 1 y 50: ");
	num = in.nextInt();
	for (int j = i + 1 ; j < vector.length; j++) {
		if (vector[i] == vector[j]) {
			System.out.println("El numero se encuentra repetido. Vuelva a ingresar un numero entre 1 y 50: ");
			num = in.nextInt();
		} else {
			vector[i + 1] = num;	
		}

		}
}
//IMPRIMIENDO EL VECTOR INGRESADO
System.out.print("[ " );
for (int i = 0; i < vector.length; i++) {
	System.out.print(vector[i]);
}
System.out.print( " ]");
/*
//CREANDO EL VECTOR RANDOM
for ( int i = 0; i < vector.length; i++) {
//System.out.println("Ingresar un numero entre 1 y 50: ");
 numAleatorio = ram.nextInt(6); // num es numero random entre 0 y 50
vector [i] = numAleatorio;
}
//IMPRIMIENDO EL VECTOR RANDOM
for (int i = 0; i < vector.length; i++) {
	System.out.print("[ " );
	System.out.print(vector[i]);
	System.out.print( " ]"); */

	}

}
