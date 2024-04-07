package relacionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeDosFicheros {

	public static void main(String[] args) throws IOException {
		
		String ficheroA = "src/relacionFicheros/ficheroAAA.txt";
		String ficheroB = "src/relacionFicheros/ficheroBBB.txt";
		String salida = "src/relacionFicheros/salida.txt";
		
		
		try {
		
		BufferedReader bfA = new BufferedReader(new FileReader(ficheroA));
		BufferedReader bfB = new BufferedReader(new FileReader(ficheroB));
		
		BufferedWriter nuevoW = new BufferedWriter(new FileWriter(salida));
		
		String linea = null;
		
		while(bfA.ready() && bfB.ready()) {
			
			linea=bfA.readLine();
			nuevoW.write(linea+"\n");
			linea=bfB.readLine();
			nuevoW.write(linea+"\n");
			
			
		}
		
		bfA.close();
		bfB.close();
		nuevoW.close();
		
		
		
		
		
		}catch(IOException e) {
			System.out.println("no se puede acceder al fichero");
		}
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(salida));
			
			String linea2=null;
			while(lector.ready()) {
				
				linea2=lector.readLine();
				System.out.println(linea2.toString());
				
			}
			lector.close();
			
				
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
