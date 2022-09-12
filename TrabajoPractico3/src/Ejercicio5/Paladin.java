package Ejercicio5;
import java.util.Random;

import Ejercicio4.Personaje;

public abstract class Paladin extends Personaje { 
	public Paladin(Integer ataque, Integer defensa) {
		//super();
		this.setNivelAtaque(ataque);
		this.setNivelDefensa(defensa);
	}

	public void defender(Integer puntos) { 

		Random rnd = new Random();
		if (rnd.nextBoolean()) {
				this.setVida((this.getVida() - ( this.getNivelDefensa() - puntos)));
			} else {
				this.setVida(this.getVida() - puntos);
			}
		}
	

	public void ataque(Integer puntos) { 

		Random rnd = new Random();
		if (rnd.nextBoolean()) {
			this.setNivelAtaque(puntos);
		} else {
			this.setNivelAtaque(puntos + 20);
		}
	}
}
