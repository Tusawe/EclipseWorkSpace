package flujoEntradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo1 {

	public static void main(String[] args) {
	
		File file = new File("Datos/fichero1.dat");
		
		try (RandomAccessFile inOut = new RandomAccessFile(file, "rw");) {
			for (int i = 0; i < 100; i++) {
				
				System.out.printf("Ecribiendo el nº %d en la posicion %d%n", i, inOut.getFilePointer());
				inOut.writeInt(i);
				
			}
			System.out.println("Posicion del puntero: " + inOut.getFilePointer());
			int posicion = 0;
			inOut.seek(posicion);
			System.out.printf("Valor de la posicion %d: %d%n", posicion, inOut.readInt());
			inOut.seek(396);
			inOut.writeInt(500);
			System.out.printf("Valor de la posicion %d: %d%n", 396, inOut.readInt());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Tamaño del fichero %s: %d bytes%n", file.getName(), file.length());

	}

}
