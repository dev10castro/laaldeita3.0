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
	public Libro(String nombre1, String autor1, String precio1) {
		super();
		this.nombre = nombre1;
		this.autor = autor1;
		this.precio = precio1;
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
