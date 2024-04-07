package relacionFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer7ficheroMedia {

	public static void main(String[] args) {

		String fichero = "src/relacionFicheros/numero2.txt";
		
		
		try {
			
			BufferedReader bLectura = new BufferedReader(new FileReader(fichero));
			
			String linea=null;
			double suma=0;
			int contador=0;
			double total=0;
			
			while(bLectura.ready()) {
				linea=bLectura.readLine();
				suma+=Integer.parseInt(linea);
				contador++;
				
			}
			bLectura.close();
			total=suma/contador;
			
			System.out.println("La media total de todos los numeros del fichero es: "+total);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero de texto");


		}catch(IOException e) {
			System.out.println("error en el fichero");
		}
		
		
	}

}
