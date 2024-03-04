package ejercicio1;

import java.util.ArrayList;

public class ejercico1Nombres {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Paco");
		nombres.add("Pedro");
		nombres.add("Paco Mer");
		nombres.add("Carlos");
		nombres.add("Misi Potter");
		
		
		int contador = 1;
		for (String nombre : nombres) {
			System.out.println("Nombre " + contador + ": " + nombre);
			contador++;
		}

	}

}
