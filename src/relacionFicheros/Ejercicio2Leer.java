package relacionFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2Leer {

	public static void main(String[] args) {
		//Realiza un programa que lea el fichero creado en el ejercicio anterior
		//y que muestre los números por pantalla
		
		String fichero = "src/relacionFicheros/primos.dat";
		
		try {
			BufferedReader nuevo = new BufferedReader(new FileReader(fichero));
			
			String linea;
			
			while(nuevo.ready()) {
				
				linea=nuevo.readLine();
				
				System.out.println(linea.toString());
			}
			
			nuevo.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
