
public class Cuadrado extends Figura {
private Double lado;

	public  Cuadrado(String color, Double lado) {
		super(color);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	public Double getLado() {
		return lado;
	}

	@Override
	public String toString() {
		return "Cuadrado lado=" + lado + super.toString() ; 
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public Double area() {
		return lado*lado ;
	}
	

	
}
