package flujoEntrada;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		final String DIRECTORIO = "Datos/";
		final String NOMBRE_FICHERO = "imagen";
		final String COPIA_FICHERO = NOMBRE_FICHERO + "_back";
		final String EXTENSION = ".png";
		
		File inFile = new File(DIRECTORIO + NOMBRE_FICHERO + EXTENSION);
		File outFile = new File(DIRECTORIO + COPIA_FICHERO + EXTENSION);
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream(outFile));) {
			
			int byteLeido;
			while ((byteLeido = in.read()) != -1) {	
				//System.out.println(byteLeido);
				// out.write((byteLeido + 1) % 256); IMAGEN CODIFICADA!
				out.write(byteLeido);
			}
			out.flush();
			System.out.println("FIN DE FICHERO: " + byteLeido);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e1) {
			System.out.println("ERROR I/O");
		}
		
		if (inFile.length() == outFile.length())
			System.out.println("Ficheros de igual capacidad");
		
	}

}
