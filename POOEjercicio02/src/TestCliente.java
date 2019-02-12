import java.util.Scanner;

public class TestCliente {
	
	static Scanner sc = new Scanner(System.in);
	static String nombre;
	static boolean sexo;
	static String dni;
	static int edad;
	static float peso;
	static float altura;
	
	public static void main(String[] args) {
		
		pedirDatos();
		Cliente cliente1 = new Cliente(nombre, sexo, edad, peso, altura);
		
		System.out.println("Introduzca su nombre: ");
		String sNombre = sc.next();
		while (!sNombre.matches("^[A-Za-z]+$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su nombre de nuevo: ");
			sNombre = sc.next();
			
		}
		nombre = sNombre;
		
		System.out.println("Introduzca su sexo (hombre o mujer): ");
		String sSexo = sc.next();
		while (!sSexo.matches("^[(hombre)(mujer)]$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su sexo de nuevo: ");
			sSexo = sc.next();
			
		}
		if(sSexo.equals("mujer")) sexo = true;
		else sexo = false;
		
		System.out.println("Introduzca su DNI: ");
		String sDNI = sc.next();
		while (!sDNI.matches("^[0-9]{8}[A-Za-z]$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca su DNI de nuevo: ");
			sDNI = sc.next();
			
		}
		dni = sDNI.toUpperCase();
		
		Cliente cliente2 = new Cliente(nombre, sexo, dni);
		Cliente cliente3 = new Cliente();
		
		switch (cliente1.calcularIMC()) {
		
			case -1: 
				System.out.println("El cliente 1 tiene infrapeso.");
				break;
			
			case 0: 
				System.out.println("El cliente 1 tiene un peso ideal.");
				break;
			
			case 1: 
				System.out.println("El cliente 1 tiene sobrepeso.");
				break;
		
		}
		
		if (cliente1.esMayorDeEdad()) {
			
			System.out.println("El ciente 1 es mayor de edad.");
			
		} else {
			
			System.out.println("El ciente 1 es menor de edad.");
			
		}
		
		switch (cliente2.calcularIMC()) {
		
		case -1: 
			System.out.println("El cliente 2 tiene infrapeso.");
			break;
		
		case 0: 
			System.out.println("El cliente 2 tiene un peso ideal.");
			break;
		
		case 1: 
			System.out.println("El cliente 2 tiene sobrepeso.");
			break;
	
		}
		
		if (cliente2.esMayorDeEdad()) {
			
			System.out.println("El ciente 2 es mayor de edad.");
			
		} else {
			
			System.out.println("El ciente 2 es menor de edad.");
			
		}
		
		switch (cliente3.calcularIMC()) {
		
		case -1: 
			System.out.println("El cliente 3 tiene infrapeso.");
			break;
		
		case 0: 
			System.out.println("El cliente 3 tiene un peso ideal.");
			break;
		
		case 1: 
			System.out.println("El cliente 3 tiene sobrepeso.");
			break;
	
		}
		
		if (cliente3.esMayorDeEdad()) {
			
			System.out.println("El ciente 3 es mayor de edad.");
			
		} else {
			
			System.out.println("El ciente 3 es menor de edad.");
			
		}
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);

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
		while (!sSexo.matches("^(hombre)|(mujer)$")) {
			
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
