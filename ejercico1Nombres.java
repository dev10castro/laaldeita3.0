package ejercicio1;

import java.util.ArrayList;

public class ejercico1Nombres {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Juan");
		nombres.add("Pedro");
<<<<<<< HEAD
		nombres.add("Paco Mer");
		nombres.add("Carlos iyiy");
		nombres.add("Misi Potter");
=======
		nombres.add("Luis");
		nombres.add("Carlos");
		nombres.add("Ana");
>>>>>>> parent of 2da2c2a (Alterasiones)
		
		
		int contador = 1;
		for (String nombre : nombres) {
			System.out.println("Nombre " + contador + ": " + nombre);
			contador++;
		}

	}

}
