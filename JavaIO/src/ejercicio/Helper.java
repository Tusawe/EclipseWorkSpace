package ejercicio;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
// import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Helper {
	
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	public static int getYearsOfPeriod(LocalDate lDate) {
		
		int years = 0;
		Period periodo = Period.between(lDate, LocalDate.now());
		years = periodo.getYears();
		
		return years;
		
	}
	
	public static List<Person> readCSV(Path pathCSV) throws IOException{
		
		List<Person> people = new ArrayList<>();
		List<String> lines = Files.readAllLines(pathCSV);
		
		if (lines.size() != 0) lines.remove(0);
		
		for (String line : lines) {
			String[] person = line.split(";");
			LocalDate birthday = LocalDate.parse(person[4], formatter);
			if (person[3].equals("Male"))
				people.add(new Person(person[0], person[1], person[2], Gender.Male, birthday, person[5])); 
			else if (person[3].equals("Female"))
				people.add(new Person(person[0], person[1], person[2], Gender.Female, birthday, person[5])); 
			else 
				people.add(new Person(person[0], person[1], person[2], Gender.Other, birthday, person[5])); 
				
		}
		
		return people;
		
	}
	
	public static void writeCSV(Staff staff, String file) throws IOException {
		
		// Creamos un nuevo Path con fileName + fecha (LocalDateTime.now8).toString()).
		LocalDateTime fecha = LocalDateTime.now();
		String time = fecha.getYear() + "-" + fecha.getMonthValue() + "-" + fecha.getDayOfMonth() +
				"_" + fecha.getHour() + ":" + fecha.getMinute();
		String nameFile = file + "_" + time + ".csv";
		Path path = Paths.get("Datos", nameFile);
		// Obtener List<Person> del atributo staff, mediante getter.
		List<Person> listOfPeople = staff.getPeople();
		PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW));
		out.print("first_name;last_name;email;gender;birthday;country");
		for (Person person : listOfPeople) {
			out.print(person);
		}
		out.flush();
		
	}
	
//	public static void main(String[] args) throws IOException {
//		
//		System.out.println(getYearsOfPeriod(LocalDate.of(2000, 3, 12)));
//		Path path = Paths.get("Datos", "personal.csv");
//		
//		System.out.println(readCSV(path));
//		
//	}
	
}
