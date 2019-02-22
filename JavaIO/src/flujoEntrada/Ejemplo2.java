package flujoEntrada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		final String DIRECTORIO = "Datos/";
		final String NOMBRE_FICHERO = "fundacion";
		final String EXTENSION = ".txt";
		
		File inFile = new File(DIRECTORIO + NOMBRE_FICHERO + EXTENSION);
		
		 /* try (BufferedReader in = new BufferedReader(new FileReader(inFile));) {
			String lineaLeida;
			int lineas = 0;
			int contador = 0;
			while ((lineaLeida = in.readLine()) != null) {
				
				System.out.println(lineaLeida);
				lineas++;
				if (lineaLeida.contains("Mallow")) contador++;
				
			} 
			System.out.println("Numero de líneas: " + lineas);
			System.out.println("Numero de lineas en las que apacere la palabra Mallow: " + contador);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e1) {
			System.out.println("ERROR I/O");
		} */
		
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));) {
			int caracterLeido;
			while ((caracterLeido = in.read()) != -1) {
				
				System.out.print((char)caracterLeido);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e1) {
			System.out.println("ERROR I/O");
		}
		
	}

}
