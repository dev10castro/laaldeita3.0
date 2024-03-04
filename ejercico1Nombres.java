package ejercicio1;

import java.util.ArrayList;

public class ejercico1Nombres {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Luis");
		nombres.add("Carlos");
		nombres.add("Ana");
		nombres.add("eloy");
		
		int contador = 1;
		for (String nombre : nombres) {
			System.out.println("Nombre " + contador + ": " + nombre);
			contador++;
		}

	}

}
