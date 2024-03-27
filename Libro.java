package coche;

public class Libro {
 
	
	private String nombre;
	private String autor;
	private String precio;
	
	/**
	 * @param nombre
	 * @param autor
	 * @param precio
	 */
	public Libro(String nombre, String autor, String precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	
	
}
