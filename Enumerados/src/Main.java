
public class Main {

	public static void main(String[] args) {
		new EnumTest(Dia.LUNES).pruebaDia();
		new EnumTest(Dia.MARTES).pruebaDia();
		new EnumTest(Dia.SABADO).pruebaDia();
	
		for (Dia dia : Dia.values()) {
			System.out.println(dia);
		}
	}

}
