import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseoFicheros {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		boolean hayArgumento = args.length !=0;
		String dosCaracteres = "";
		
		if (hayArgumento && args[0].length() >= 2) {
			
			dosCaracteres = args[0].toLowerCase().substring(0, 2);
			
		}
		
		// Listas para almacenar datos.
		List<String> empiezanPorA = new ArrayList<>();
		List<String> noAcabanEnVocal = new ArrayList<>();
		List<String> nombresMasLargos = new ArrayList<>();
		List<String> nombresMasCortos = new ArrayList<>();
		List<String> nombresCoincidentes = new ArrayList<>();
		
		File inputFile = new File("Files/nombres_mujer.txt");
		Scanner sc = new Scanner(inputFile);
		int contador = 0;
		int iPalabraMayor = 0;
		int iPalabraMenor = Integer.MAX_VALUE;
		String linea;
		
		while (sc.hasNextLine()) {
			
			linea = sc.nextLine();
			contador++; // numero de nombres leidos.
			
			if (hayArgumento) {
				
				if (args[0].equalsIgnoreCase(linea)) {
					
					System.out.println("Existe el nombre " + linea);
					return;
					
				}
				
				if (linea.toLowerCase().startsWith(dosCaracteres) && dosCaracteres.length() >= 2) {
					
					nombresCoincidentes.add(linea);
					
				}
				
				continue;
				
			}
			
			// Buscar nombres mas largos.
			if (linea.length() == iPalabraMayor) {
				
				nombresMasLargos.add(linea);
				// iPalabraMayor = linea.length();   NO HACE FALTA.
				
			} else if (linea.length() > iPalabraMayor) {
				
				nombresMasLargos.clear();
				nombresMasLargos.add(linea);
				iPalabraMayor = linea.length();
				
			}
			
			// Buscar nombres mas cortos.
			if (linea.length() == iPalabraMenor) {
				
				nombresMasCortos.add(linea);
				// iPalabraMenor = linea.length();   NO HACE FALTA.
				
			} else if (linea.length() < iPalabraMenor) {
				
				nombresMasCortos.clear();
				nombresMasCortos.add(linea);
				iPalabraMenor = linea.length();
				
			}
			
			// Buscar nombres que empiecen por A.
			if (linea.matches("^[AaÁá].*")) {
				
				empiezanPorA.add(linea);
				
			}
			
			// Buscar nombres que no acaben en vocal.
			if (!linea.toLowerCase().matches(".*[aeiouáéíóú]$")) {
				
				noAcabanEnVocal.add(linea);
				
			}
			
		}
		
		sc.close();
		
		if (!hayArgumento) {
		
			System.out.println("Numero de lineas leidas: " + contador + " lineas.");
			System.out.println("Nombres que empiezan por A -> " + empiezanPorA);
			System.out.println("Nombres que no acaban en vocal -> " + noAcabanEnVocal);
			System.out.println("El/los nombre/s mas largo/s es/son -> " + nombresMasLargos);
			System.out.println("El/los nombre/s mas corto/s es/son -> " + nombresMasCortos);
		
		} else {
			
			System.out.println("No existe el nombre " + args[0]);
			
			if (nombresCoincidentes.size() > 0) {
				
				System.out.println("Nombres coincidentes -> " + nombresCoincidentes);
			
			}
			
		}
	
	}	
		
}
