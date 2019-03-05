package path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Crear el path sobre el fichero.
		
		Path inPath = Paths.get("Datos", "fundacion.txt");
		
		if (Files.notExists(inPath)) {
			
			System.err.println("No existe el fichero: " + inPath.toString());
			return;
		}
		System.out.println("Fichero encontrado.");
		
		// Usando el metodo readAllLines, leemos todas las lineas.
		
		try {
			List<String> listaLineas = Files.readAllLines(inPath);
			
			// Mostrar cuantas lineas tiene el fichero.
			
			System.out.printf("El fichero %s tiene %d lineas.%n", inPath.toString(), listaLineas.size());
			
			// Mostrar el numero de ocurrencias de una palabra dada (Trántor).
			
			String ocurrencia = "Trántor";
			int contador = 0;
			for (String lineas : listaLineas) {
				
				if(lineas.contains(ocurrencia)) contador++;
				
			}
			
			System.out.printf("Nº ocurrencias de %s son %d%n", ocurrencia, contador);			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
