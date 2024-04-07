package leerFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Malaga2 {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new FileReader("src/ejercicioFicheros/Malaga.txt"));
			BufferedReader br1 = new BufferedReader(new FileReader("src/ejercicioFicheros/Malaga3.txt"));

			BufferedWriter nuevo = new BufferedWriter(new FileWriter("src/ejercicioFicheros/Malaga2.txt", false));
			BufferedWriter nuevo1 = new BufferedWriter(new FileWriter("src/ejercicioFicheros/Malaga2.txt", true));

			String linea;

			while (br.ready()) {

				linea = br.readLine();
				System.out.println(linea);
				nuevo.write(linea + "\n");

			}
			while (br1.ready()) {

				linea = br1.readLine();
				System.out.println(linea);
				nuevo1.write(linea + "\n");

			}
			br.close();
			br1.close();
			nuevo.close();
			nuevo1.close();

		} catch (FileNotFoundException e) {
			System.out.println("no se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("no se puede leer el fichero");
		}

	}

}
