package Ejercicio8;

public class ProfesorSuplente extends Profesor {
	private Double valorHora = 200.0;

	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super(nombre, apellido, edad, horasTrabajadas);
		this.valorHora = valorHora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public Double getRemuneracionMensual() {
		return this.valorHora * this.getHorasTrabajadas();
	}
}
