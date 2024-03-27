package ejercicio1;

/**
 * 
 * @author DCS
 */

public class Jugador {

	private String nombre;
	private int dorsal;
	private String posicion;
	private int npuntos;
	private int nrebotes;
	
	
	
	/**
	 * construcutor por defecto
	 */
	public Jugador() {
		super();
	}


	/**
	 * constructor con todos los parametros
	 * 
	 * @param nombre
	 * @param dorsal
	 * @param posicion
	 * @param npuntos
	 * @param nrebotes
	 */
	public Jugador(String nombre, int dorsal, String posicion, int npuntos, int nrebotes) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.npuntos = npuntos;
		this.nrebotes = nrebotes;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}


	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}


	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	/**
	 * @return the npuntos
	 */
	public int getNpuntos() {
		return npuntos;
	}


	/**
	 * @param npuntos the npuntos to set
	 */
	public void setNpuntos(int npuntos) {
		this.npuntos = npuntos;
	}


	/**
	 * @return the nrebotes
	 */
	public int getNrebotes() {
		return nrebotes;
	}


	/**
	 * @param nrebotes the nrebotes to set
	 */
	public void setNrebotes(int nrebotes) {
		this.nrebotes = nrebotes;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", posicion=" + posicion + ", npuntos=" + npuntos
				+ ", nrebotes=" + nrebotes + "]";
	}
	
	
	
	
	
}
