package Ejercicio1;

/**
 * @author José Luis Gómez
 *
 */
public class Triangle {
	
	private float sideA;
	private float sideB;
	private float sideC;
	
	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 * @throws IlegalTriangleException 
	 */
	public Triangle(float side1, float side2, float side3) throws IlegalTriangleException {
		
		if (checkTriangle(side1, side2, side3)) {
			
			this.sideA = side1;
			this.sideB = side2;
			this.sideC = side3;
			
		} else {
			
			throw new IlegalTriangleException("Bad tirangle");
			
		}

	}

	private boolean checkTriangle(float sideA, float sideB, float sideC) {
		
		return (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB);
		
	}

	/**
	 * @return the side1
	 */
	public float getSideA() {
		return sideA;
	}

	/**
	 * @param side1 the side1 to set
	 */
	public void setSideA(float side1) {
		this.sideA = side1;
	}

	/**
	 * @return the side2
	 */
	public float getSideB() {
		return sideB;
	}

	/**
	 * @param side2 the side2 to set
	 */
	public void setSideB(float side2) {
		this.sideB = side2;
	}

	/**
	 * @return the side3
	 */
	public float getSideC() {
		return sideC;
	}

	/**
	 * @param side3 the side3 to set
	 */
	public void setSideC(float side3) {
		this.sideC = side3;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}
	
}
