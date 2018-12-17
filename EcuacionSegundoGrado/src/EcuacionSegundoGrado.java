/**
 * @author matinal
 *
 */
public class EcuacionSegundoGrado {
	
	private float a;
	private float b;
	private float c;
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public EcuacionSegundoGrado(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @return the a
	 */
	public float getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(float a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public float getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(float b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public float getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(float c) {
		this.c = c;
	}
	
	// Metodo para saber si es resoluble.
	public boolean esResoluble() {
		
		return b*b - 4*a*c >= 0;
		
	}
	
	// Metodo para calcula X1.
	public float calcularX1() {
		
		return (-b) + (float)Math.sqrt(b*b - 4*a*c) / 2*a;
		
	}
	
	// Metodo para calcula X2.
	public float calcularX2() {
			
		return (-b) - (float)Math.sqrt(b*b - 4*a*c) / 2*a;
			
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "EcuacionSegundoGrado [a =" + a + ", b =" + b + ", c =" + c + ", resoluble =" + esResoluble() + "]";
	
	}
	
	
	
}
