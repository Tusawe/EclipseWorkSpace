package flujoSalida;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		File inFile = new File("Datos/numeros_originales.txt");
		File outFile = new File("Datos/numeros_procesados.txt");
		List<Double> numeros = new ArrayList<>();
		double suma = 0.0;
		
		try (Scanner sc = new Scanner(inFile);) {
			double numero = 0.0;
			while (sc.hasNextDouble()) {
				numero = sc.nextDouble();
				System.out.println(numero);
				numeros.add(numero);
				suma += numero;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No encuentro fichero/s.");
		}
		
		Collections.sort(numeros); // Ordenar de menor a mayor.
		System.out.println("\n" + numeros);
		Collections.sort(numeros, new Comparator<Double>() {

			@Override
			public int compare(Double arg0, Double arg1) {
				
				return - (int) (arg0*100 - arg1*100);
			}	
			
		}); // Ordenar de mayor a menor.
		System.out.println("\n" + numeros);
		
		System.out.printf("El valor medio es %.2f", suma/numeros.size());
		
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(outFile)));) {
			for (Double double1 : numeros) {
				out.writeBytes("" + double1 + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
