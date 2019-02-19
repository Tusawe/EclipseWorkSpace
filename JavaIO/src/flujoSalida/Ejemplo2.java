package flujoSalida;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		File inFile = new File("Datos/fundacion.txt");
		File outFile = new File("Datos/fundacion_back.txt");
		
		try (Scanner sc = new Scanner(inFile);
				BufferedOutputStream out = 
						new BufferedOutputStream(new FileOutputStream(outFile));) {
		
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine());
				out.write(sc.nextLine().getBytes());
				out.write("\n".getBytes()); // Añado salto de linea.
				out.flush();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No encuentro fichero/s.");
		} catch (IOException e1) {
			System.out.println("ERROR I/O");
		}
		
		System.out.printf("Tamaño de fichero de entrada %s es %d bytes%n",
				inFile.getName(), inFile.length());
		
		System.out.printf("Tamaño de fichero de salida %s es %d bytes%n",
				outFile.getName(), outFile.length());
		
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion: " + (fin - inicio)); // Hay que meter la operacion entre parentesis.
		
	}

}
