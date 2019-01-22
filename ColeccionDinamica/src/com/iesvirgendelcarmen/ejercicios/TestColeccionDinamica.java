package com.iesvirgendelcarmen.ejercicios;

import java.util.Scanner;

public class TestColeccionDinamica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColeccionDinamica c = new ColeccionDinamica();
		System.out.println("Introduce palabras. Para acabar usa FIN.");
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		if (!cadena.equalsIgnoreCase("FIN")) c.addCadena(cadena);
		
		while (!cadena.equalsIgnoreCase("FIN") && sc.hasNext()) {
			
			cadena = sc.next();
			if (!cadena.equalsIgnoreCase("FIN")) c.addCadena(cadena);
			
		}
		
		sc.close();
		System.out.println(c.getListaCadena());
		
	}

}
