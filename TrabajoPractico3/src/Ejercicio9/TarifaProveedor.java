package Ejercicio9;

public class TarifaProveedor {
	private int ValorSMS = 1;
	private int ValorMinutosLlamada = 15;
	private int ValorGigas = 20;
	
	
	public TarifaProveedor(int valorSMS, int valorMinutosLlamada, int valorGigas) {
		super();
		ValorSMS = valorSMS;
		ValorMinutosLlamada = valorMinutosLlamada;
		ValorGigas = valorGigas;
	}
	
	
	public int getValorSMS() {
		return ValorSMS;
	}
	public int getValorMinutosLlamada() {
		return ValorMinutosLlamada;
	}
	public int getValorGigas() {
		return ValorGigas;
	}

	private int calcularSMS(int totalSMS) {
		return totalSMS*ValorSMS ;
	}
	
	private int calcularMinutosLlamada(int totalMinutosLlamadas) {
		return totalMinutosLlamadas*ValorMinutosLlamada;
	}
	
	private int calcularGigas(int totalGigas) {
		return totalGigas*ValorGigas;
	}
	
public int calcular(int totalSMS, int totalMinutosLlamada, int totalGigas) {
	return calcularSMS(totalSMS) + calcularMinutosLlamada(totalMinutosLlamada) + calcularGigas(totalGigas);
}








}
