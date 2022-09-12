import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Banda 1","Banda 2","Banda 3","Banda 4","Banda 5"));
		for(int i = 0; i<3;i++) {
			// Integer num = new Random().nextInt(nombres.size());
			int num = new Random().nextInt(nombres.size());
			//String nom = nombres.get(num);
			String nom = nombres.remove(num);
			//nombres.remove(num);
			System.out.println(new Banda("estilo "+i,nom).toSring());
		}
	}

}
