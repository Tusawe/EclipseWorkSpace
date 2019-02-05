package Ejercicio2;

/**
 * @author matinal
 *
 */
public class HexadecimalNumber {

	private String hexValue;

	/**
	 * @param hexValue
	 * @throws IlegalFormatForHexadecimalNumber 
	 */
	public HexadecimalNumber(String hexValue) throws IlegalFormatForHexadecimalNumber {
		
		String hex = hexValue.toUpperCase();
		
		if (!hex.matches("^[0-9A-F]+$")) {
			
			throw new IlegalFormatForHexadecimalNumber("Incorrect format binary number");
			
		}
		
		this.hexValue = hex.toUpperCase();
	}

	/**
	 * @return the hexValue
	 */
	public String getHexValue() {
		return hexValue;
	}

	/**
	 * @param hexValue the hexValue to set
	 * @throws IlegalFormatForHexadecimalNumber 
	 */
	public void setHexValue(String hexValue) throws IlegalFormatForHexadecimalNumber {
		
		String hex = hexValue.toUpperCase();
		
		if (!hex.matches("^[0-9A-F]+$")) {
			
			throw new IlegalFormatForHexadecimalNumber("Incorrect format binary number");
			
		}
		
		this.hexValue = hex;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HexadecimalNumber [hexValue=" + hexValue + "]";
	}
	
	public static int convertHexadecimalToDecimal(String hexValue) throws IlegalFormatForHexadecimalNumber {
		
		StringBuilder sBuilder = new StringBuilder(hexValue.toUpperCase());
		String hexReverse = sBuilder.reverse().toString();
		
		String hexadecimal = "0123456789ABCFDF";
		int sum = 0;
		
		if (!hexReverse.matches("^[0-9A-F]+$")) {
			
			throw new IlegalFormatForHexadecimalNumber("Incorrect format binary number");
			
		}
		
		for (int i = 0; i < hexReverse.length() ; i++) {
			
			sum += hexadecimal.indexOf(hexReverse.charAt(i)) * Math.pow(16, i);
			
		}
		
		return sum;
		
		// return Integer.parseInt(hexReverse, 16);
		
	}
	
}
