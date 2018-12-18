package cafetera;

/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Consumible{
	
	private int tiempo;
	private int capsulas;
	private double precio;
	private double agua;
	private String tipo;

	/**
	 * @param tiempo
	 * @param precio
	 * @param agua
	 * @param tipo
	 */
	public Consumible(int tiempo, double precio, double agua, String tipo) {
		this.tiempo = tiempo;
		this.precio = precio;
		this.agua = agua;
		this.tipo = tipo;
		this.capsulas = 10;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * @return the capsulas
	 */
	public int getCapsulas() {
		return capsulas;
	}

	public void recargarCapsulas() {
		this.capsulas = 10;
	}
	
	public void gastarCapsulas() {
		this.capsulas -= 1;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the agua
	 */
	public double getAgua() {
		return agua;
	}

}
