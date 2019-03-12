package ejercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;
	private String email;
	private LocalDate birthday;
	private String country;
	
	public Person(String firstName, String lastName, Gender gender, String email, LocalDate birthday, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.birthday = birthday;
		this.country = country;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		if (birthday != null) {
		return String.format("%s,%s,%s,%s,%s,%s", firstName, lastName, gender, email, 
				birthday.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")), country);
		}
		return String.format("%s,%s,%s,%s,%s,%s", firstName, lastName, gender, email, birthday, country);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
//	public static void main(String[] args) {
//		
//		Person p1 = new Person("fisrtName","lastName",Gender.Female,"email",LocalDate.now(),"country");
//		System.out.println("p1 -> " + p1);
//		
//		Person p2 = new Person("fisrtName","lastName",Gender.Male,"email123",LocalDate.now(),"country");
//		System.out.println("p2 -> " + p2);
//		System.out.println("¿Es igual p1 a p2? " + p1.equals(p2));
//		
//		Person p3 = new Person("fisrtName","lastName");
//		System.out.println("p3 -> " + p3);
//		System.out.println("¿Es igual p1 a p3? " + p1.equals(p3));
//		
//		Person p4 = new Person("fisrtName2","lastName2",Gender.Other,"email",LocalDate.now(),"country");
//		System.out.println("p4 -> " + p4);
//		System.out.println("¿Es igual p1 a p4? " + p1.equals(p4));
//		
//	}
	
}
