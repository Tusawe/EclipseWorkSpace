package ejercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TestStaff {

	private static Scanner sc = new Scanner(System.in);
	private static Staff staff;
	
	public static void main(String[] args) {
		
		int iOption = 0;
		String sOption;
		boolean menu = false;
		Path pathCSV;
		
		do {
			System.out.println("Enter filename:");
			String filename = sc.next();
			pathCSV = Paths.get("Datos", filename);
		} while (!Files.exists(pathCSV));
		
		try {
			List<Person> list = Helper.readCSV(pathCSV);
			staff = new Staff(list);
		} catch (IOException e) {
			System.err.println("ERROR I/O");
			// e.printStackTrace();
		}
		
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
		sc.close();
		System.out.println("Bye bye :)");
		
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
		
		// System.out.println("Te borro la life payaso");
		System.out.println("Enter de name of a person:");
		String name = sc.next();
		System.out.println("Enter the last name of a person");
		String lastName = sc.next();
		Person person = new Person(name, lastName);
		if(staff.removePerson(person)) System.out.println("Person removed.");
		
		
	}
	
	private static void getPeopleByCountry() {
		
		// System.out.println("To' la peña del country pa'");
		System.out.println("Enter the country:");
		String country = sc.next();
		staff.showListByCountry(country);
		
	}

	private static void getPeopleByGender() {
	
		// System.out.println("To' la peña del gender pa'");
		String sGender;
		do {
			System.out.println("Enter the gender (Male,Female or Other  ):");
			sGender = sc.next();
		} while (!sGender.matches("(Male|Female|Other)"));
		
		Gender gender;
		if (sGender.equals("Male"))
			gender = Gender.Male;
		else if (sGender.equals("Female"))
			gender = Gender.Female;
		else
			gender = Gender.Other;
		
		
		staff.showListByGender(gender);
	
	}
	
	private static void removePersonByEmail() {
		
		String email;
		do {
			System.out.println("Enter a email of a person:");
			email = sc.next();
		} while (!email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"));
		if (staff.removePersonByEmail(email)) System.out.println("Person removed by email.");
		else System.out.println("Person not removed.");
		
	}
	
	private static void getNumberOfPeopleByAge() {
		
		String sAge;
		do {
			System.out.println("Enter a age:");
			sAge = sc.next();
		} while (!sAge.matches("[0-9]{2}"));
		int age = Integer.parseInt(sAge);
		
		System.out.println("The number of people older than " + age + " is " + staff.getNumberOfPeopleByAge(age));
		
	}
	
	private static void addPerson() {
		
		// System.out.println("Que bacanería, otro corito sano.");
		
		System.out.println("Enter de name of a person:");
		String name = sc.next();
		System.out.println("Enter the last name of the person:");
		String lastName = sc.next();
		
		String email;
		do {
			System.out.println("Enter the new email of the person:");
			email = sc.nextLine();
		} while (!email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"));
		
		String sGender;
		do {
			System.out.println("Enter the gender (Male,Female or Other  ):");
			sGender = sc.nextLine();
		} while (!sGender.matches("(Male|Female|Other)"));
		
		Gender gender;
		if (sGender.equals("Male"))
			gender = Gender.Male;
		else if (sGender.equals("Female"))
			gender = Gender.Female;
		else
			gender = Gender.Other;
		
		String sBirthday;
		do {
			System.out.println("Enter the birthday:");
			sBirthday = sc.nextLine();
		} while(!sBirthday.matches("\\d{4}/\\d{2}/\\d{2}"));
		LocalDate birthday = LocalDate.parse(sBirthday, Helper.formatter);
		
		System.out.println("Enter the coutnry of the person");
		String country = sc.nextLine();
		
		Person person = new Person(name, lastName, email, gender, birthday, country);
		
		if(staff.addPerson(person)) System.out.println("Person added.");
		else System.out.println("Problem with add a person.");
	}
	
	private static void updatePersonByEmail() {
		
		// System.out.println("Cambia esa berga de email, pelotudo niño pinga.");
		
		System.out.println("Enter de name of a person:");
		String name = sc.next();
		System.out.println("Enter the last name of the person");
		String lastName = sc.next();
		String email;
		do {
			System.out.println("Enter the new email of the person:");
			email = sc.next();
		} while (!email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"));
		Person person = new Person(name, lastName);
		
		if(staff.updatePersonByEmail(person, email)) System.out.println("Email updated");
		
	}
	
}
