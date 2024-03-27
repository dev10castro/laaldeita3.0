package ejercicio1;

/**
 * 
 * @author DCS
 */

import java.util.Scanner;

public class PruebaEquipo {

	public static void main(String[] args) {
		
		Scanner consola=new Scanner(System.in);
		
		//creamos equipo
	   Equipo nuevo=new Equipo("Real Madrid");
	   
	   // creamos tres jugadores y los metemos en el equipo
	   Jugador jug1= new Jugador("Lebron", 23, "alero", 58, 9);
	   Jugador jug2= new Jugador("Lucas", 16, "alero", 33, 6);
	   Jugador jug3= new Jugador("McDonalds", 22, "alero", 23, 8);

	   
		nuevo.agregarJugador(jug1);
		nuevo.agregarJugador(jug2);
		nuevo.agregarJugador(jug3);
		
		int opcion=0;
		
		while(opcion==0) {
			
			System.out.println("------GESTIONA TU EQUIPO------");
			System.out.println("1.comprobar dorsal");
			System.out.println("2.añadir jugador");
			System.out.println("3.eliminar jugador");
			System.out.println("4.obtener media de puntod de jugadores");
			System.out.println("5.salir");
			int eleccion=consola.nextInt();
			consola.nextLine();
			
			switch(eleccion) {
			
			case 1:
				// aqui comprobamos si el dorsal de un jugador ya esta en el equipo
				System.out.println("introduce dorsal");
				int dorsal=consola.nextInt();
				consola.nextLine();
				
				nuevo.noestaJugador(dorsal);
				
				break;
				
			case 2:
				
				// aqui creamos un nuevo jugador y lo metemos en el equipo llamando al metodo de la clase equipo
				System.out.println("nombre del nuevo jugador");
				String nombre=consola.nextLine();
				System.out.println("introduce dorsal");
				int dors=consola.nextInt();
				consola.nextLine();
				System.out.println("introduce posicion");
				String posicion=consola.nextLine();
				System.out.println("introduce numero de puntos por partdido");
				int npuntos=consola.nextInt();
				consola.nextLine();
				System.out.println("introduce numero de rebotes");
				int nrebo=consola.nextInt();
				consola.nextLine();
				
				Jugador newJugador=new Jugador(nombre,dors,posicion,npuntos,nrebo);
				nuevo.agregarJugador(newJugador);
				System.out.println("jugador añadido!!");
				System.out.println();
				break;
				
				
			case 3:
				//aqui borramos a unjugador por su dorsal llamando al metodo de la clase equipo
				System.out.println("que jugador desea eliminar??? (introduce su dorsal)");
				nuevo.mostrarEquipo();
				System.out.println();
				System.out.println("introduce su dorsal");
				int dorsalBorr=consola.nextInt();
				consola.nextLine();
				
				nuevo.eliminarJugador(dorsalBorr);
				System.out.println("jugador borrado con exito");
				System.out.println();
				
				break;
				
			case 4:
				//aqui comprobamos la media llamando al metodo de la clase equipo
				System.out.println("media de puntos y media de rebotes del equipo");
				nuevo.mediaJugadores();
				break;
				
			case 5:
				System.out.println("saliendo");
				opcion=1;
				break;
				
				default:
					System.out.println("introduce una opcion correcta");
				
			}
		}
	
		

		consola.close();
	}

}
