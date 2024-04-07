package relacionFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		/**
		 * A partir de un fichero creado manualmente por nosotros que contenga 5
		 * números, uno por línea, realizar un programa que lea dichos números y realice
		 * la suma de los números. El programa ha de imprimir los números leídos y la
		 * suma total.
		 */
		
		String fichero = "src/relacionFicheros/fichero3.txt";
		
		try {
			
			FileWriter nuevo = new FileWriter(fichero);
			
			nuevo.write("10\n");
			nuevo.write("20\n");
			nuevo.write("30\n");
			nuevo.write("40\n");
			
			nuevo.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			
			BufferedReader nuevoB = new BufferedReader(new FileReader(fichero));
			
			String linea=null;
			
			int suma = 0;
			
			
			while(nuevoB.ready()) {
				
				linea = nuevoB.readLine();
				
				suma += Integer.parseInt(linea);
				
				
				
			}
			
			nuevoB.close();
			System.out.println(" el total de la suma es : "+ suma);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
