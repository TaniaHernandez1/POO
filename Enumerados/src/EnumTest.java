
public class EnumTest {
	private Dia dia;

	public EnumTest(Dia dia) {
		super();
		this.dia = dia;
	} 
	public void pruebaDia() {
		switch (dia) {
		case LUNES: 
			System.out.println("Horrible los lunes, salvo por la clase de poo...");
		
		break;
		case VIERNES: System.out.println("Termina la semana! ");
		break;
		case SABADO: case DOMINGO: System.out.println("Ya estamos en el fin de semana!");
		break;
		
		default:
			System.out.println("mehh dia de semana ");
			break;
		}
	}

}
