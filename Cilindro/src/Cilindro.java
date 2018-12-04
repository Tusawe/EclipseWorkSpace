/**
 * 
 */

/**
 * @author Jose Luis
 * @version 1.0
 */
public class Cilindro {
	
	private double radio;
	private double altura;
	
	/**
	 * @param radio del cilindro
	 * @param altura del cilindro
	 */
	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	/**
	 * @return radio del cilindro
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio del cilindro a modificar
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * @return altura del cilindro
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura del cilindro a modificar.
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 * @return area del cilindro.
	 */
	public double getArea() {
		
		return (2 * Math.PI * radio * radio) + (2 * Math.PI * radio * altura);
		
	}
	
	/**
	 * @return volumen del cilindro.
	 */
	public double getVolumen() {
		
		return Math.PI * radio * radio * altura;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cilindro de radio " + radio + " y altura " + altura;
	}
	
	
	
}
