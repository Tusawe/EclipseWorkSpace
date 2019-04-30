package clases;

import java.util.Map;

public class Auxiliar {

	public static boolean comprobarCodigo(String codigo) {
		
		if(codigo.matches("^23[0-9]{3}$")) return true;
		
		return false;
		
	}
	
	public static boolean exportarBaseDeDatos(Map<String,Demografia> demografias) {
		
		return false;
		
	}
	
}
