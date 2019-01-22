/**
 * @author José Luis Gómez López
 * @version 1.0
 *
 */
public class CuentaBancaria {

	private String titular;
	private float cantidad;
	String numeroCuenta;
	
	/**
	 * @param titular
	 * @param cantidad
	 */
	public CuentaBancaria(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the cantidad
	 */
	public float getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * @param cantidad the cantidad to set
	 */
	public void ingresarCantidad(float cantidad) {
		this.cantidad += cantidad;
	}
	
	/**
	 * @param cantidad the cantidad to set
	 */
	public void sacarCantidad(float cantidad) {
		this.cantidad -= cantidad;
	}
	
}
