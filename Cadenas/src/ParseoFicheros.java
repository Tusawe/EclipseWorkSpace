import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseoFicheros {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("Files/nombres_mujer.txt");
		Scanner sc = new Scanner(inputFile);
		int contador = 0;
		String linea;
		
		// Listas para almacenar datos.
		List<String> empiezanPorA = new ArrayList<>();
		List<String> noAcabanEnVocal = new ArrayList<>();
		
		while (sc.hasNextLine()) {
			
			linea = sc.nextLine();
			contador++;
			System.out.println(linea);
			
			if (linea.matches("^[AaÁá].*")) {
				
				empiezanPorA.add(linea);
				
			}
			
			if (!linea.toLowerCase().matches(".*[aeiouáéíóú]$")) {
				
				noAcabanEnVocal.add(linea);
				
			}
			
		}
		
		System.out.println("Numero de lineas leidas: " + contador + " lineas.");
		System.out.println("Nombres que empiezan por A -> " + empiezanPorA);
		System.out.println("Nombres que no acaban en vocal -> " + noAcabanEnVocal);
		sc.close();
		
	}
	
}
