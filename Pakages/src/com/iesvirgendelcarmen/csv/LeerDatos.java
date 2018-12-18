package com.iesvirgendelcarmen.csv;

import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;


public class LeerDatos {

	public static void main(String[] args) throws IOException  {
		
		String archCSV = "csv/ciudades.csv";
		CSVReader csvReader = new CSVReader(new FileReader(archCSV));
		
		String[] fila = null;
		int contador = 0;
		while((fila = csvReader.readNext()) != null) {
			
			if (contador == 0) contador++;
			else {
				
				/*System.out.print("Ciudad : " + fila[0]);
				System.out.print(" - País : " + fila[1]);
				System.out.print(" - Longitud : " + fila[2]);
				System.out.print(" - Latitud : " + fila[3] + "\n");
				System.out.println("--------------------------------------------------");*/
				
				Ciudades ciudad = new Ciudades(fila[0], fila[1],Float.parseFloat(fila[3]), Float.parseFloat(fila[2]));
				
				System.out.println(ciudad);
			
			}
			
		}

		csvReader.close();
		
	}
	
}
