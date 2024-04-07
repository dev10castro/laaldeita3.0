package relacionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Del1al20 {

	public static void main(String[] args) {

		String numero1 = "src/relacionFicheros/numero1.txt";
		String numero2 = "src/relacionFicheros/numero2.txt";
		String mezcla = "src/relacionFicheros/mezcla.txt";

		try {
			BufferedReader buffer1 = new BufferedReader(new FileReader(numero1));
			BufferedReader buffer2 = new BufferedReader(new FileReader(numero2));
			BufferedWriter bMezcla = new BufferedWriter(new FileWriter(mezcla,true));

			String linea = null;

			while (buffer1.ready() && buffer2.ready()) {

				linea = buffer1.readLine();
				bMezcla.write(linea+"\n");
				linea = buffer2.readLine();
				bMezcla.write(linea+"\n");

			}

			buffer1.close();
			buffer2.close();
			bMezcla.close();

		} catch (FileNotFoundException f) {

			System.out.println("no se encuentra el fichero");

		} catch (IOException e) {
			System.out.println("error en el fichero");

		}

	}

}
