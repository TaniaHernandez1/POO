
public class MainPlaneta {

	public static void main(String[] args) {
		Double pesoEnTierra = 78.2;
		Double masa = pesoEnTierra / Planeta.TIERRA.gravedadEnSuperficie();
		for (Planeta p : Planeta.values())
			System.out.printf("Tu peso en %s es %f%n", p, p.pesoEnSuperficie(masa));
	}
}
