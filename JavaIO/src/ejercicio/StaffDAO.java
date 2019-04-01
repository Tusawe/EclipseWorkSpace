package ejercicio;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {

	private Connection connection;

	public StaffDAO() {
		try {
			this.connection = ConnectionDB.getConnection();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Person> showAllOfPeople() {
		
		List<Person> lista = new ArrayList<>();
		
		String sql = "SELECT * FROM person";
		try(Statement sentencia = connection.createStatement();
				ResultSet rsSet = sentencia.executeQuery(sql)) {
			while(rsSet.next()) {
				
				Gender gender = Gender.Other;
				if(rsSet.getString("gender").equals("Male")) gender = Gender.Male;
				else if (rsSet.getString("gender").equals("Female")) gender = Gender.Female;
				
				lista.add(new Person(rsSet.getString("first_name"),
						rsSet.getString("last_name"),
						rsSet.getString("email"),
						gender,
						LocalDate.parse(rsSet.getString("birthday"),Helper.formatter),
						rsSet.getString("country")));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lista;
		
	}
	
	public Person showPersonByEmail(String email) {
		
		String sql = "SELECT * FROM person WHERE email = ?;";
		Person persona = new Person();
		try(PreparedStatement preStatement = connection.prepareStatement(sql);) {
			preStatement.setString(1, email);
			ResultSet rsSet = preStatement.executeQuery();
			while(rsSet.next()) {
				
				Gender gender = Gender.Other;
				if(rsSet.getString("gender").equals("Male")) gender = Gender.Male;
				else if (rsSet.getString("gender").equals("Female")) gender = Gender.Female;
				
				persona = new Person(rsSet.getString("first_name"),
						rsSet.getString("last_name"),
						rsSet.getString("email"),
						gender,
						LocalDate.parse(rsSet.getString("birthday"),Helper.formatter),
						rsSet.getString("country"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return persona;
		
	}
	
	public boolean deletePerson(Person person) {
		
		String sql = "DELETE FROM person WHERE email = ?;";
		int rsSet = 0;
		try(PreparedStatement preStatement = connection.prepareStatement(sql);) {
			preStatement.setString(1, person.getEmail());
			rsSet = preStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsSet != 0;
		
	}
	
	public boolean updateEmailOfAPerson(Person person, String newEmail) {
		
		String sql = "UPDATE person SET email = ? WHERE email = ?;";
		int rsSet = 0;
		try(PreparedStatement preStatement = connection.prepareStatement(sql);) {
			preStatement.setString(1, newEmail);
			preStatement.setString(2, person.getEmail());
			rsSet = preStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsSet != 0;
		
	}
	
	public boolean addPerson(Person person) {
		
		String sql = "INSERT INTO person VALUES (?,?,?,?,?,?);";
		int rsSet = 0;
		
		try(PreparedStatement preStatement = connection.prepareStatement(sql);) {
			preStatement.setString(1, person.getFirstName());
			preStatement.setString(2, person.getLastName());
			preStatement.setString(3, person.getEmail());
			preStatement.setString(4, person.getGender().toString());
			preStatement.setString(5, person.getBirthday().format(Helper.formatter));
			preStatement.setString(6, person.getCountry());
			rsSet = preStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rsSet != 0;
		
	}
	
}
