package com.iesvirgendelcarmen.jdbc.teoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemeplo1 {

	public static void main(String[] args) {
		// Crear el objeto conexión (Connection), objeto Statement, objeto resultSet
		String sqlConsulta1 = "SELECT * FROM persona;";
		String email = "tchecorn@opensource.org";
		String sqlConsulta2 = "SELECT last_name, first_name FROM persona WHERE email='" + email + "';";
		String sqlConsulta3 = "SELECT last_name, first_name FROM persona WHERE email=?;";

		try (Connection conexion = DriverManager.getConnection("jdbc:sqlite:db/database.db");
				Statement statement = conexion.createStatement();
		//		ResultSet resultSet1 = statement.executeQuery(sqlConsulta1);
				ResultSet resultSet2 = statement.executeQuery(sqlConsulta2);
				PreparedStatement preparedStatement = conexion.prepareStatement(sqlConsulta3);) {
			
		//	int contador = 0;
//			while (resultSet1.next()) {
//		//		contador++;
//				System.out.printf("%d.- %S, %S. Email: %s%n",
//						resultSet1.getInt(1),
//						resultSet1.getString(3),
//						resultSet1.getString(2),
//						resultSet1.getString(4));
//			}
			
		//	while (resultSet2.next()) System.out.printf("%S, %s%n",resultSet2.getString(1),resultSet2.getString(2));
			
			preparedStatement.setString(1,email);
			ResultSet rsSet = preparedStatement.executeQuery();
			while (rsSet.next()) System.out.printf("%S, %s%n",rsSet.getString(1),rsSet.getString(2));
			
		//	System.out.println("Nº registros: " + contador);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
