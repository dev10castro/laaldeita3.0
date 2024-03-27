package ejercicio1;

/**
 * 
 * @author DCS
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {

	private String nombreE;

	ArrayList<Jugador> equipo;

	/**
	 * metodo para crear un nuevo array
	 * 
	 * @param nombreE
	 */

	public Equipo(String nombreE) {

		this.nombreE = nombreE;

		equipo = new ArrayList<Jugador>();
	}

	/**
	 * metodo para buscar un jugador
	 * 
	 * @param dorsal
	 */
	public void noestaJugador(int dorsal) {

		boolean jugEncontrado = false;

		for (Jugador jugador : equipo) {

			if (jugador.getDorsal() == dorsal) {
				System.out.println("el dorsal ya está inscrito en ese equipo");
				jugEncontrado = true;

			}
		}

		if (!jugEncontrado) {
			System.out.println("el dorsal no esta inscrito");

		}

	}

	/**
	 * metodo para agregar un jugador al equipo
	 * 
	 * @param nuevo
	 */
	public void agregarJugador(Jugador nuevo) {

		boolean jugEncontrado = false;

		for (Jugador jugador : equipo) {

			if (jugador.getDorsal() == nuevo.getDorsal()) {
				System.out.println("el dorsal ya está inscrito en ese equipo");
				jugEncontrado = true;

			}
		}

		if (!jugEncontrado) {
			equipo.add(nuevo);
			

		}
	}

	/**
	 * metodo para eliminar un jugador del equipo utilizando un iterador
	 * 
	 * @param dorsal
	 */
	public void eliminarJugador(int dorsal) {
		Iterator<Jugador> it = equipo.iterator();
		while (it.hasNext()) {
			Jugador jugador = it.next();
			if (jugador.getDorsal() == dorsal) {
				it.remove();
			}
		}
	}

	/**
	 * metodo que recorre el array y devuelve la media de los puntos obtenidos y la
	 * media de rebotes
	 */
	public void mediaJugadores() {
		double mPuntos = 0;
		double mRebotes = 0;
		for (Jugador jugador : equipo) {
			mPuntos += jugador.getNpuntos();
			mRebotes += jugador.getNrebotes();
		}
		System.out.println("La media de puntos: " + mPuntos / equipo.size());
		System.out.println("La media de rebotes: " + mRebotes / equipo.size());
	}
	
	
	/**
	 * metodo para visualizar jugadores del equipo
	 * 
	 */
	public void mostrarEquipo() {
		for (Jugador jugador : equipo) {
			System.out.println(jugador.toString());
		}
	}

	/**
	 * @return the nombreE
	 */
	public String getNombreE() {
		return nombreE;
	}

	/**
	 * @param nombreE the nombreE to set
	 */
	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	@Override
	public String toString() {
		return "Equipo [nombreE=" + nombreE + ", equipo=" + equipo + "]";
	}
	
	

}
