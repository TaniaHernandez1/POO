package Ejercicio5;

public abstract class Personaje { 
	
	private Integer vida, nivelAtaque, nivelDefensa;

	public Integer atacar() {
		return nivelAtaque;
	}

	public abstract void defender(Integer puntos);

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) throws MiExcepcion {
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

	public void setNivelDefensa(Integer nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}
}
