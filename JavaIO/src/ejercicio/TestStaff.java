package ejercicio;

import java.util.Scanner;

public class TestStaff {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			
			showMenu();
			
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 0:
					System.out.println("Hasta luego Mari Carmen");
					return;
					
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				case 7:
					break;
					
				default:
					System.out.println("ERROR: Opción erronea.");
					break;
			}
		
			System.out.println("------------------------------");
			
		} while(opcion != 0);
		
	}
	
	public static void showMenu() {
		
		System.out.println("ELIGE UNA OPCIÓN:");
		System.out.println("(0) Salir de la aplicación.");
		System.out.println("(1) Borrar una persona.");
		System.out.println("(2) Mostrar personas por país.");
		System.out.println("(3) Mostrar personas por genero.");
		System.out.println("(4) Borrar persona por email.");
		System.out.println("(5) Numero de personas mayores de una cierta edad.");
		System.out.println("(6) Añadir una persona");
		System.out.println("(7) Actualizar email de una persona");
		
	}
	
	private static void removePerson() {
		
		System.out.println("Te borro la life payaso");
		
	}
	
	private static void getPeopleByCountry() {
		
		System.out.println("To' la peña del country pa'");
		
	}

	private static void getPeopleByGender() {
	
	System.out.println("To' la peña del gender pa'");
	
	}
	
	private static void removePersonByEmail() {
		
		System.out.println("Te borro la life payaso, que berga de email");
		
	}
	
	private static void getNumberOfPeopleByAge() {
		
		System.out.println("Que lo que, ya tu sabeh, observa la people a full de years.");
		
	}
	
	private static void addPerson() {
		
		System.out.println("Que bacanería, otro corito sano.");
		
	}
	
	private static void updatePersonByEmail() {
		
		System.out.println("Cambia esa berga de email, pelotudo niño pinga.");
		
	}
	
}
