package ejercicio;

import java.util.Scanner;

public class TestStaff {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		int iOption = 0;
		String sOption;
		boolean menu = false;
		
		do {
			
			showMenu(menu);
			menu = true;
			
			sOption = sc.next();
			while(!sOption.matches("[0-7]")) {
				
				System.out.println("ERROR: This option is not posible.");
				showMenu(menu);
				sOption = sc.next();
				
			}
			
			iOption = Integer.parseInt(sOption);
			
			switch (iOption) {
				case 0:
					System.out.println("Hasta luego Mari Carmen");
					return;
					
				case 1:
					removePerson();
					break;
					
				case 2:
					getPeopleByCountry();
					break;
					
				case 3:
					getPeopleByGender();
					break;
					
				case 4:
					removePersonByEmail();
					break;
					
				case 5:
					getNumberOfPeopleByAge();
					break;
					
				case 6:
					addPerson();
					break;
					
				case 7:
					updatePersonByEmail();
					break;
					
			}
			
		} while(iOption != 0);
		
	}
	
	private static void showMenu(boolean menu) {
		
		if (menu) {
			
			System.out.println("------------------------------");
			System.out.println("\n\n------------ MENU ------------");
			System.out.println("(0) Exit.");
			System.out.println("(1) Delete a person.");
			System.out.println("(2) List by country.");
			System.out.println("(3) List by gender.");
			System.out.println("(4) Delete by email.");
			System.out.println("(5) Get number of people by age.");
			System.out.println("(6) Add a person");
			System.out.println("(7) Update the email of person");
			System.out.print("Choose option: ");
		
		} else {
			
			System.out.println("------------ MENU ------------");
			System.out.println("(0) Exit.");
			System.out.println("(1) Delete a person.");
			System.out.println("(2) List by country.");
			System.out.println("(3) List by gender.");
			System.out.println("(4) Delete by email.");
			System.out.println("(5) Get number of people by age.");
			System.out.println("(6) Add a person");
			System.out.println("(7) Update the email of person");
			System.out.print("Choose option: ");
			
		}
		
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
