package cafetera;

public class Utiles {

	static int vasos = 10;
	static int palitos = 10;
	static int azucar = 10;
	static double agua = 5.0;
	
	public static void gastarVasos() {
		
		vasos--;
		
	}
	
	public static void gastarPalitos() {
		
		palitos--;
		
	}
	
	public static void gastarAzucar(int numero) {
		
		azucar = azucar - numero;
		
	}
	
	public static void gastarAgua(double cantidad) {
		
		agua = agua - cantidad;
		
	}
	
}
