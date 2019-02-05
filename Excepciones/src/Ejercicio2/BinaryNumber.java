package Ejercicio2;


/**
 * @author matinal
 *
 */
public class BinaryNumber {

	private String binaryValue;

	/**
	 * @param binaryValue
	 * @throws IlegalFormatForBinaryNumber 
	 */
	public BinaryNumber(String binaryValue) throws IlegalFormatForBinaryNumber {
		if (!binaryValue.matches("^[01]+$")) {
			
			throw new IlegalFormatForBinaryNumber("Incorrect format binary number");
			
		}
		this.binaryValue = binaryValue;
	}

	/**
	 * @return the binaryValue
	 */
	public String getBinaryValue() {
		return binaryValue;
	}

	/**
	 * @param binaryValue the binaryValue to set
	 * @throws IlegalFormatForBinaryNumber 
	 */
	public void setBinaryValue(String binaryValue) throws IlegalFormatForBinaryNumber {
		if (!binaryValue.matches("^[01]+$")) {
			
			throw new IlegalFormatForBinaryNumber("Incorrect format binary number");
			
		}
		this.binaryValue = binaryValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BinaryNumber [binaryValue=" + binaryValue + "]";
	}
	
	public static int convertBinaryToDecimal(String binaryString) throws IlegalFormatForBinaryNumber {
		
		if (!binaryString.matches("^[01]+$")) {
			
			throw new IlegalFormatForBinaryNumber("Incorrect format binary number");
			
		}
		
		/*int sum = 0;
		StringBuilder sBuilder = new StringBuilder(binaryString);
		String binaryStringReverse = sBuilder.reverse().toString();
		
		for (int i = 0; i < binaryStringReverse.length() ; i++) {
			
			if (binaryStringReverse.charAt(i) == '1') {
				
				sum += Math.pow(2, i);
				
			}
			
		}
		
		return sum;*/
		
		return Integer.parseInt(binaryString, 2);
		
	}
	
}
