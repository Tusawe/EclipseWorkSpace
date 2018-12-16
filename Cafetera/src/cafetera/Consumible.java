package cafetera;

public class Consumible{
	
	private int tiempo;
	private double precio;
	private double agua;
	private int capsulas;

	/**
	 * @param tiempo
	 * @param precio
	 * @param agua
	 * @param capsulas
	 */
	public Consumible(int tiempo, double precio, double agua, int capsulas) {
		this.tiempo = tiempo;
		this.precio = precio;
		this.agua = agua;
		this.capsulas = capsulas;
	}

	/**
	 * @return the capsulas
	 */
	public int getCapsulas() {
		return capsulas;
	}

	/**
	 * @param capsulas the capsulas to set
	 */
	public void setCapsulas(int capsulas) {
		this.capsulas = capsulas;
	}

	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
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
