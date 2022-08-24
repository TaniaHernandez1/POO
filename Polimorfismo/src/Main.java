import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Cuadrado unCuadrado = new Cuadrado("azul", 2.0);
		Circulo unCirculo = new Circulo("verde", 4.0);
		Figura unaFigura = new Cuadrado("rojo", 6.0);
		unCuadrado.getLado();
		unCuadrado.area();
		unaFigura.area();
		unaFigura = unCirculo;
//System.out.println(unaFigura +"             area: "+ unaFigura.area()) ; 
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			if (ran.nextBoolean()) {
				figuras.add(new Cuadrado("color", ran.nextDouble(10.0)));

			} else {
				figuras.add(new Circulo("rojo", ran.nextDouble(2.0)));
			}
		}
		for (Figura figura1 : figuras) {
			System.out.println(figura1 + "             area: " + figura1.area());
		//if(figura1 instanceof Cuadrado) { //retorna boolean si es Cuadrado
		  ((Cuadrado) figura1).getLado(); // casting. es cambiar de un tipo a otro :)
		   Cuadrado unCuadradoAux = ( Cuadrado) figura1 ;
		  System.out.println( "un Cuadrado aux :  "+unCuadradoAux.getLado());
		//}
		}
	}

}
