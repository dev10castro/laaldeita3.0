package leerFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {

	public static void main(String[] args) {
		
		
		
		try(FileReader nuevo = new FileReader("src/leerFicheros/hola.txt")){
			
			int c = nuevo.read();
			
			while(c!=-1) {
				
				System.out.print((char)c);
				
				c = nuevo.read();
			}
			
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("no se encuentra el fichero");
		}catch(IOException o) {
			System.out.println("no se puede leer ");
		}

	}

}
