package leerFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Malaga {

	public static void main(String[] args) {
	        
		try {
			
			BufferedReader br= new BufferedReader(new FileReader("src/ejercicioFicheros/Malaga.txt"));
		    BufferedWriter nuevo = new BufferedWriter(new FileWriter("src/ejercicioFicheros/Malaga2.txt",false));

			String linea;
		
			
			while(br.ready()) {
				linea=br.readLine();
				System.out.println(linea);
				nuevo.write(linea+"\n");
				
				
			}
			
			br.close();
			nuevo.close();
		}catch (FileNotFoundException e) {
			System.out.println("no se encuentra el fichero");
		}catch(IOException e) {
			System.out.println("no se puede leer el fichero");
		}
		
		
		
		
	}
	

}
