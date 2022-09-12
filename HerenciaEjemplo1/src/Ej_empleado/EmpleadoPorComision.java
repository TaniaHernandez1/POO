package Ej_empleado;

public class EmpleadoPorComision {
private String nombre, apellido, dni;
private Double ventasBrutas, tarifaComision;
public EmpleadoPorComision(String nombre, String apellido, String dni, Double ventasBrutas, Double tarifaComision) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.ventasBrutas = ventasBrutas;
	this.tarifaComision = tarifaComision;
}
public Double ingreso( ) {
	return getVentasBrutas()*getTarifaComision();
}

@Override
public String toString() {
	return "nombre: " + getNombre()+ "apellido: " + getApellido() + "dni: " +getDni() + "ventas brutas: "+ getVentasBrutas() + "taifa comision: " + getTarifaComision() + "ingresos total: " + ingreso() ;
}
public Double getVentasBrutas() {
	return ventasBrutas;
}
public void setVentasBrutas(Double ventasBrutas) {
	this.ventasBrutas = ventasBrutas;
}
public Double getTarifaComision() {
	return tarifaComision;
}
public void setTarifaComision(Double tarifaComision) {
	this.tarifaComision = tarifaComision;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public String getDni() {
	return dni;
}

}
