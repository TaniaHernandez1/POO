package Ejercicio8;

public class ProfesorTitular extends Profesor {
	private Integer antiguedad;
	private final Double valorAntiguedad = 1000.0;
	private final Double valorHora = 300.0;
	//final es un metodo q no se puede redefinir o sobreescribir (tipo constante)

	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
		super(nombre, apellido, edad, horasTrabajadas);
		this.antiguedad = antiguedad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getRemuneracionPorAntiguedad() {
		return this.valorAntiguedad * this.getAntiguedad();
	}

	public Double getRemuneracionMensual() {
		return this.valorHora * this.getHorasTrabajadas();
	}

}
