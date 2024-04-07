package relacionFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1Primos {

	public static void main(String[] args) {

		// Escribe un programa que guarde en un fichero con nombre primos.dat
		// los números primos que hay entre 1 y 500.

		String fichero = "src/relacionFicheros/primos.dat";

		try {

			BufferedWriter nuevo = new BufferedWriter(new FileWriter(fichero));

			for (int i = 0; i < 501; i++) {
				if (esPrimo(i)) {
					nuevo.write(Integer.toString(i) + "\n");

				}
			}
			nuevo.close();

		} catch (IOException e) {
			System.out.println();
		}

	}

	public static Boolean esPrimo(long n) {
		if (n < 2) {
			return false;
		} else {
			for (long i = n / 2; i >= 2; i--) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}