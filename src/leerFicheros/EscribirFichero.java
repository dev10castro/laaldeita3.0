package leerFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		
		String hola="Hola como estas?";
		
		FileWriter fichero=null;

		try {
			
			fichero= new FileWriter("src/leerFicheros/pruebaFichero.txt");
			
			fichero.write(hola);
			
			fichero.close();
			
			
			
		}catch(IOException e) {
			
			System.out.println("no se puede escribir");
		}
		
		

	}

}
