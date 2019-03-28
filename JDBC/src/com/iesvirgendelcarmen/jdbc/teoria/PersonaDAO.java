package com.iesvirgendelcarmen.jdbc.teoria;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonaDAO {

	private Connection conexion;

	public PersonaDAO() {
		try {
			this.conexion = Conexion.getConexion();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Persona> obtenerTodasLasPersonas() {
		
		List<Persona> lista = null;
		
		String sql = "SELECT * FROM persona";
		try(Statement sentencia = conexion.createStatement();
				ResultSet resultSet = sentencia.executeQuery(sql)) {
			while(resultSet.next()) {
				
				lista.add(new Persona(resultSet.getInt("id"),
						resultSet.getString("first_name"),
						resultSet.getString("last_name"),
						resultSet.getString("email")));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lista;
		
	}
	
	public Persona obtenerPersonaPorEmail(String email) {
		
		return null;
		
	}
	
}
