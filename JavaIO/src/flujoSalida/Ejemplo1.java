package flujoSalida;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		File file = new File("Datos/fichero1.txt");
		String cadenaAGuardar = " \nÑ ejemplo.";
		
		if (file.exists()) 
			System.out.printf("El fichero %s existe.%n",file.getName());
		else {
			System.out.println("No existe el fichero, creando fichero...");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/* FORMA CLASICA
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		try (FileOutputStream out = new FileOutputStream(file, true);) {
			out.write(cadenaAGuardar.getBytes());
			out.write(15);
			out.flush();
			System.out.printf("Escrito fichero %s, con un tamaño %d",file.getName(), file.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
