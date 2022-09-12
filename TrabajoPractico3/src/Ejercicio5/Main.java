package Ejercicio5;

import java.util.Random;

import Ejercicio4.Naruto;
import Ejercicio4.Paladin;
import Ejercicio4.Personaje;

public abstract class Main extends Personaje {

	public static void main(String[] args) {
		Integer ataque, defensa;
		Boolean comienzo, sigue;
		int contador = 1;
		Paladin paladin = new Paladin(40, 70) { // ATAC/DEF
		};
		Naruto naruto = new Naruto(50, 30) {
		};
		naruto.setVida(80);
		paladin.setVida(80);
		Random ran = new Random();

		while (contador < 4) {
			System.out.println(contador + " R O U N D ");
			sigue = true; 

			comienzo = ran.nextBoolean();
			
			if (comienzo) { // comienza paladin
			while (sigue) {
				ataque = paladin.atacar();
				naruto.defender(ataque);
				System.out.println("Paladin atacó a Naruto con " + ataque + ".");
				try {
					if (naruto.getVida() >= 0) {
						
						System.out.println("Naruto quedó con " + naruto.getVida() + " de vida.");
						sigue = false;
					} else {
						sigue = true;
						throw new MiExcepcion("¡ PALADIN GANADOR ! ");
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
					
			//	} while (sigue = false);
				
				
			} else { // comienza naruto
				do {
					ataque = naruto.atacar();
					paladin.defender(ataque);
					System.out.println("Naruto atacó a Paladin con " + ataque + ".");
					try {
						if (paladin.getVida() >= 0) {
							System.out.println("Paladin quedó con " + naruto.getVida() + " de vida.");
						} else {
							throw new MiExcepcion("¡ NARUTO GANADOR ! ");
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} while (sigue = false);
			}
			System.out.println(" ");
			contador++;
		}
	}
}
