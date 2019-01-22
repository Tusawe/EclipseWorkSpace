package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class ColeccionDinamica {

	private List<String> listaCadena = new ArrayList<>();

	public void addCadena(String cadena) {
		
		listaCadena.add(cadena);
		
	}
	
	public List<String> getCadenaMayorLongitud() {
		
		List<String> nuevaListaCadena = new ArrayList<>();
		int longitud = 0;
		
		for(String cadena: listaCadena) {
			
			if (cadena.length() == longitud) {
				
				nuevaListaCadena.add(cadena);
				
			} else if (cadena.length() > longitud) {
				
				longitud = cadena.length();
				nuevaListaCadena.clear();
				nuevaListaCadena.add(cadena);
				
			}
			
		}
		
		return nuevaListaCadena;
		
	}
	
	public boolean existeCadena(String cadena) {
		
		return listaCadena.contains(cadena);
		
	}
	
	public void eliminarCadena(String cadena) {
		
		listaCadena.remove(cadena);
		
	}

	/**
	 * @return the listaCadena
	 */
	public List<String> getListaCadena() {
		return listaCadena;
	}
	
	
	
}
