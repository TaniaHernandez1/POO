package Ejercicio4;

import java.util.Random;

public abstract class Main extends Personaje {
	// bucle si alg murio
	public static void main(String[] args) {
		Integer ataque, defensa;
		Boolean comienzo;
		Paladin paladin = new Paladin(60, 90) { //ATAC/DEF
		};
		Naruto naruto = new Naruto(70, 50) {
		};
		naruto.setVida(100);
		paladin.setVida(100);
		Random ran = new Random();

		comienzo = ran.nextBoolean();
		if (comienzo) { // comienza paladin
			ataque = paladin.atacar();
			naruto.defender(ataque);
			System.out.println("Paladin atacó a Naruto con " + ataque + ".");
			System.out.println("Naruto quedó con " + naruto.getVida() + " de vida.");

		} else { // comienza naruto
			ataque = naruto.atacar();
			paladin.defender(ataque);
			System.out.println("Naruto atacó a Paladin con " + ataque + ".");
			System.out.println("Paladin quedó con " + paladin.getVida() + " de vida");
		}
	}

}
