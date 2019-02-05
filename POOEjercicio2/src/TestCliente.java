import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestCliente {
	
	static Scanner sc = new Scanner(System.in);
	static String nombre;
	static boolean sexo;
	static int edad;
	static float peso;
	static float altura;
	
	public static void main(String[] args) {
		
		pedirDatos();
		Cliente cliente1 = new Cliente(nombre, sexo, edad, peso, altura);

	}
	
	public static void pedirDatos() {
		
		System.out.println("Introduzca su nombre: ");
		String sNombre = sc.next();
		while (!sNombre.matches("^[A-Za-z]+$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su nombre de nuevo: ");
			sNombre = sc.next();
			
		}
		nombre = sNombre;
		
		System.out.println("Introduzca su sexo (hombre o mujer): ");
		String sSexo = sc.next();
		while (!sSexo.matches("^[(hombre)(mujer)]{1}$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su sexo de nuevo: ");
			sSexo = sc.next();
			
		}
		if(sSexo.equals("mujer")) sexo = true;
		else sexo = false;
		
		System.out.println("Introduzca su edad: ");
		String sEdad = sc.next();
		while (!sEdad.matches("^[0-9]{0,3}$") || (Integer.parseInt(sSexo) >= 16 && Integer.parseInt(sSexo) <= 100)) {
			
			System.out.println("ERROR DE DATOS: Introduzca su edad de nuevo: ");
			sEdad = sc.next();
			
		}
		edad = Integer.parseInt(sSexo);
		
		System.out.println("Introduzca su peso: ");
		String sPeso = sc.next();
		while (!sPeso.matches("^\\d+([\\.,]\\d+)?$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su peso de nuevo: ");
			sPeso = sc.next();
			
		}
		peso = Float.parseFloat(sPeso);
		
		System.out.println("Introduzca su altura: ");
		String sAltura = sc.next();
		while (!sAltura.matches("^\\d+([\\.,]\\d+)?$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su altura: ");
			sAltura = sc.next();
			
		}
		altura = Float.parseFloat(sAltura);
		
		
	}

}
