package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Staff {

	private List<Person> people;

	public Staff(List<Person> people) {
		this.people = people;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
	public boolean addPerson(Person person) {
		
		return people.add(person);
		
	}
	
	public boolean removePerson(Person person) {
		
		return people.remove(person);
		
	}
	
	public List<Person> showListByCountry(String country) {
		
		List<Person> peopleByCountry = new ArrayList<>();
		
		for (Person person : people) {
			
			if (person.getCountry().equals(country)) {
				
				peopleByCountry.add(person);
				
			}
			
		}
		
		return peopleByCountry;
		
		/*
		 * return peopleByCountry.stream()
		 * 		.filter(p -> p.getCountry().equals(country))
		 * 		.collect(Collectors.toList());
		 **/
		
	}
	
	public List<Person> showListByGender(Gender gender) {
		
		List<Person> peopleByGender = new ArrayList<>();
		
		for (Person person : people) {
			
			if (person.getGender() == gender) {
				
				peopleByGender.add(person);
				
			}
			
		}
		
		return peopleByGender;
		
	}
	
	public boolean removePersonByEmail(String email) {
		
		for (Person person : people) {
			
			if (person.getEmail().equals(email)) {
				
				return people.remove(person);
				
			}
			
		}
		
		return false;
		
	}
	
	public int getNumberOfPeopleByAge(int age) {
		
		int peopleWithAge = 0;
		
		for (Person person : people) {
			
			if (Helper.getYearsOfPeriod(person.getBirthday()) > age) {
				
				peopleWithAge++;
				
			}
			
		}
		
		return peopleWithAge;
		
	}
	
	public boolean updatePersonByEmail(Person newPerson, String email) {
		
		for (Person person : people) {
			
			if(person.equals(newPerson)) {
				
				person.setEmail(email);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
}
