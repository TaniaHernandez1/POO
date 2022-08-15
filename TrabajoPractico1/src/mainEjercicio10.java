import java.nio.file.FileSystemException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class mainEjercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAleatorio1, numAleatorio2, rta, rta2, ganado, perdido;
		rta2 = 1;
		ganado = 0;
		perdido = 0;
// RANDOM
		do {
		Random ran = new Random();
		 numAleatorio1 = ran.nextInt(10);
		 numAleatorio2 = ran.nextInt(10);
		while (numAleatorio1 == numAleatorio2) {
			 numAleatorio1 = ran.nextInt(10);
			 numAleatorio2 = ran.nextInt(10);	
		}
		Scanner in = new Scanner(System.in);
		System.out.println("¿ Eliges apostar por el valor 1 o por el valor 2 ?  ");
		rta =  in.nextInt(3);
		System.out.println("ATENCION!!!!!!!!!");
		System.out.println("Valor 1: " + numAleatorio1);		
		System.out.println("Valor 2: " + numAleatorio2);
		switch (rta) {
		case 1:	
			rta = 1 ;
		if (numAleatorio1 > numAleatorio2) {
			System.out.println("FELICIDADES, GANASTE!");
			ganado = ganado + 1;
		} else { System.out.println("PERDISTE :( ");
		perdido = perdido + 1;
		}
		break;
		case 2: rta = 2;
		if (numAleatorio2 > numAleatorio1) {
			System.out.println("FELICIDADES, GANASTE!");
			ganado = ganado + 1;
		} else { System.out.println("PERDISTE :( ");
		perdido = perdido + 1;
		break;
		}
		}
		
		try {
			System.out.println("Apostaste por el valor " + rta); 
			System.out.println("¿Desea jugar otra partida? << Ingresar 1 para SI o 2 para NO >>");
			rta2 =  in.nextInt(3);
		} catch (InputMismatchException errorDeTipo) {
			System.err.printf("Excepcion: ", errorDeTipo);
			System.out.println("Debe ingresar enteros, vuelva a intentarlo: ");
		}
		System.out.println("Cantidad de pertidas ganadas: " + ganado);
		System.out.println("Cantidad de partidas perdidas: " + perdido);
		} while (rta2 == 1);
		
	}}
		

