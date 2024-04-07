package relacionFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio5hora {

	public static void main(String[] args) {

		/**
		 * Realizar un programa que cada vez que se ejecute cree un fichero cuyo nombre
		 * sea la hora de ese momento (por ejemplo, si el programa se ejecuta a las
		 * 16:25:10, pues que el nombre del fichero sea 16_25_10.txt) y escribir en él 5
		 * números aleatorios entre 0 y 100
		 */

		LocalTime now = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH_mm_ss");
        String forma = now.format(formato);
        
        try {
        	
        	
			FileWriter nuevo = new FileWriter("src/relacionFicheros/"+forma+".txt");
			
			for (int i = 0; i < 6; i++) {
				nuevo.write((int) (Math.random()*100));
			}
			
			nuevo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
