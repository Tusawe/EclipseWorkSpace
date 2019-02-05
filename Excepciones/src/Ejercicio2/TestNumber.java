package Ejercicio2;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter binary number:");
		Scanner sc = new Scanner(System.in);
		String binaryNumber = sc.next();
		try {
			BinaryNumber bNumber = new BinaryNumber(binaryNumber);
			System.out.printf("Number value: %s%n",bNumber.getBinaryValue());
			bNumber.setBinaryValue("1010");
			System.out.printf("Number value: %s%n",bNumber.getBinaryValue());
			System.out.printf("Decimal value of %s is %d%n", bNumber.getBinaryValue(),BinaryNumber.convertBinaryToDecimal(bNumber.getBinaryValue()));
		} catch (IlegalFormatForBinaryNumber e) {
			// e.printStackTrace();
			System.out.println("Bad number.");
		}*/
		
		System.out.println("Enter hexadecimal number:");
		String hexNumber = sc.next();
		
		try {
			HexadecimalNumber hNumber = new HexadecimalNumber(hexNumber);
			System.out.printf("Number value: %s%n",hNumber.getHexValue());
			System.out.printf("Decimal value of %s is %d%n", hNumber.getHexValue(),HexadecimalNumber.convertHexadecimalToDecimal(hNumber.getHexValue()));
		} catch (IlegalFormatForHexadecimalNumber e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Bad number.");
		}
		
		
		sc.close();
		
		System.out.println("That's all my friend!");
		
	}

}
