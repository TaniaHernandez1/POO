package Ej_empleado;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
private Double salarioBase;

	public EmpleadoBaseMasComision(String nombre, String apellido, String dni, Double ventasBrutas,
			Double tarifaComision, Double salarioBase) {
		super(nombre, apellido, dni, ventasBrutas, tarifaComision);
		this.salarioBase = salarioBase;
	}

}
