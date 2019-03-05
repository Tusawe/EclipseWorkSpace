package path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Clase que copia un fichero usando las nuevas
// utiidades que aport el paquete nio de java
// en este caso con la clase Files.

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Definir los path de entrada y salida.
		
		Path inPath = Paths.get("Datos", "fundacion.txt");
		Path outPath = Paths.get("Datos", "fundacion_back_2.txt");
		
		// Comprobar que el path de entrada existe (mejor si no existe, salimos de programa)
		
		if (Files.notExists(inPath)) {
			
			System.err.println("No existe el fichero: " + inPath.toString());
			return;
		}
		System.out.println("Fichero encontrado.");
		
		// Usando el metodo copy de la clase Files copiamos inPath a outPath.
		
		try {
			Files.copy(inPath, outPath,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Se ha copiado correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Mostramos el tamaño del fichero de salida y entrada
		
		try {
			System.out.printf("El tamaño del fichero %s es %d%n", inPath.toString(), Files.size(inPath));
			System.out.printf("El tamaño del fichero %s es %d%n", outPath.toString(), Files.size(outPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
