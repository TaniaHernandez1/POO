package Ejercicio4;

public abstract class Personaje {
	private Integer vida, nivelAtaque, nivelDefensa;

	public Integer atacar() {
		return nivelAtaque;
	}

	public abstract void defender(Integer puntos);

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getNivelAtaque() {
		return nivelAtaque;
	}

	public void setNivelAtaque(Integer nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}

	public Integer getNivelDefensa() {
		return nivelDefensa;
	}

	public void setNivelDefenza(Integer nivelDefenza) {
		this.nivelDefensa = nivelDefensa;
	}
}
