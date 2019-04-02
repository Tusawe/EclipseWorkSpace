package ejercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class TestStaffDAO {
	
	private static Scanner sc = new Scanner(System.in);
	private static StaffDAO staffDAO;
	
	public static void main(String[] args) {
		
		int iOption = 0;
		String sOption;
		boolean menu = false;

		staffDAO = new StaffDAO();
		
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
					break;
					
				case 1:
					deletePerson();
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
	
	private static void deletePerson() {
		
		// System.out.println("Te borro la life payaso");
		System.out.println("Enter de name of a person:");
		String name = sc.next();
		System.out.println("Enter the last name of a person");
		String lastName = sc.next();
		Person person = new Person(name, lastName);
		if(staffDAO.deletePerson(person)) System.out.println("Person removed.");
		else System.out.println("Person not removed.");
		
		
	}
	
	private static void getPeopleByCountry() {
		
		// System.out.println("To' la peña del country pa'");
		System.out.println("Enter the country:");
		String country = sc.next();
		System.out.println(staffDAO.showListByCountry(country));
		
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
		
		
		System.out.println(staffDAO.showListByGender(gender));
	
	}
	
	private static void removePersonByEmail() {
		
		String email;
		do {
			System.out.println("Enter a email of a person:");
			email = sc.next();
		} while (!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$"));
		if (staffDAO.deletePersonByEmail(email)) {
			System.out.println("Person removed by email.");
		}
		else System.out.println("Person not removed.");
		
	}
	
	private static void getNumberOfPeopleByAge() {
		
		String sAge;
		do {
			System.out.println("Enter a age:");
			sAge = sc.next();
		} while (!sAge.matches("[0-9]{2}"));
		int age = Integer.parseInt(sAge);
		
		System.out.println("The number of people older than " + age + 
				" is " + staffDAO.getNumberOfPeopleByAge(age));
		
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
			email = sc.next();
		} while (!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$"));
		
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
		
		String sBirthday;
		do {
			System.out.println("Enter the birthday:");
			sBirthday = sc.next();
		} while(!sBirthday.matches("\\d{4}/\\d{2}/\\d{2}"));
		LocalDate birthday = LocalDate.parse(sBirthday, Helper.formatter);
		
		System.out.println("Enter the coutnry of the person");
		String country = sc.next();
		
		Person person = new Person(name, lastName, email, gender, birthday, country);
		
		if(staffDAO.addPerson(person)) {
			System.out.println("Person added.");
		}
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
		} while (!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$"));
		Person person = new Person(name, lastName);
		
		if(staffDAO.updateEmailOfAPerson(person, email)) {
			System.out.println("Email updated");
		}
		
	}
	
}
