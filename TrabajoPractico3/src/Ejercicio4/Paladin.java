package Ejercicio4;

import java.util.Random;

public abstract class Paladin extends Personaje { /* SUB CLASE (( se extiende a Naruto)) */
	public Paladin(Integer ataque, Integer defensa) {
		//super();
		this.setNivelAtaque(ataque);
		this.setNivelDefensa(defensa);
	}

	public void defender(Integer puntos) { // OBLIGACION DE IMPLEMENTAR

		Random rnd = new Random();
		if (rnd.nextBoolean()) {
				this.setVida((this.getVida() - ( this.getNivelDefensa() - puntos)));
			} else {
				this.setVida(this.getVida() - puntos);
			}
		}
	

	public void ataque(Integer puntos) { // OBLIGACION DE IMPLEMENTAR

		Random rnd = new Random();
		if (rnd.nextBoolean()) {
			this.setNivelAtaque(puntos);
		} else {
			this.setNivelAtaque(puntos + 20);
		}
	}
}