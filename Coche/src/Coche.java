/**
 * 
 */

/**
 * @author Jose Luis
 * @version 1.0
 */
public class Coche {

	private double gasolina = 5;
	private double consumo = 7;
	
	/**
	 * @return gasolina del coche.
	 */
	public double getGasolina() {
		return gasolina;
	}
	
	/**
	 * @param gasolina del coche a modificar
	 */
	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}
	
	/**
	 * @return consumo del coche
	 */
	public double getConsumo() {
		return consumo;
	}
	
	/**
	 * @param consumo del coche a modificar
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	/**
	 * @param gasolina que añades al coche.
	 */
	public void añadirGasolina(double gasolina) {
		this.gasolina = this.gasolina + gasolina;
	}
	
	/**
	 * @return kilometros que puede recorrer con la gasolina que tiene.
	 */
	public double kilometros() {
		return (gasolina / 7) * 100;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return gasolina + " litros de gasolina y tiene un consumo de " + consumo + " litros por cada 100km, por lo cual puede andar hasta " + kilometros() + "km.";
	}
	
	
	
}
