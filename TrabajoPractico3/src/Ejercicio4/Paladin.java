package Ejercicio4;

import java.util.Random;

public class Paladin extends Personaje {
	public Paladin(Integer ataque, Integer defensa) {
		super();
		super.setNivelAtaque(ataque);
		this.setNivelAtaque(defensa);
	}

	public void defender(Integer puntos) {

		Random rnd = new Random();
		if (rnd.nextBoolean()) {
			if (this.getNivelDefensa() < puntos) {
				this.setVida(this.getVida() - (puntos - this.getNivelDefensa()));
			} else {

			}
		}
	}
}