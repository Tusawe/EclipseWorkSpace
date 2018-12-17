/**
 * @author matinal
 *
 */
public class TrianguloRectangulo {
	
	// Atributos
	private int cateto1;
	private int cateto2;
	
	/**
	 * @param cateto1
	 * @param cateto2
	 */
	public TrianguloRectangulo(int cateto1, int cateto2) {
		
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		
	}

	/**
	 * @return the cateto1
	 */
	public int getCateto1() {
		return cateto1;
	}

	/**
	 * @param cateto1 the cateto1 to set
	 */
	public void setCateto1(int cateto1) {
		this.cateto1 = cateto1;
	}

	/**
	 * @return the cateto2
	 */
	public int getCateto2() {
		return cateto2;
	}

	/**
	 * @param cateto2 the cateto2 to set
	 */
	public void setCateto2(int cateto2) {
		this.cateto2 = cateto2;
	}
	
	// Metodo para clacular la hipotenusa.
	public double calcularHipotenusa() {
		
		return Math.hypot(cateto1, cateto2);
		
	}
	
	// Metodo para calcular el area.
	public double calcularArea() {
		
		return cateto1 * cateto2 / 2.0;
		
	}
	
	// Metodo para calcular el perimetro.
	public double calcularPerimetro() {
		
		return cateto1 + cateto2 + calcularHipotenusa();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "TrianguloRectangulo [cateto1 =" + cateto1 + ", cateto2 =" + cateto2 + ", hipotenusa ="
				+ Math.round(calcularHipotenusa() * 100) / 100.0 + "]";
		
	}
	
	
	
}
