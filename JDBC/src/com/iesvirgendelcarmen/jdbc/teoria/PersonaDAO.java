package com.iesvirgendelcarmen.jdbc.teoria;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		
		List<Persona> lista = new ArrayList<>();
		
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
		
		String sql = "SELECT * FROM persona WHERE email = ?;";
		Persona persona = new Persona();
		try(PreparedStatement preStatement = conexion.prepareStatement(sql);) {
			preStatement.setString(1, email);
			ResultSet rsSet = preStatement.executeQuery();
			while(rsSet.next()) {
				
				persona = new Persona(rsSet.getInt("id"),
						rsSet.getString("first_name"),
						rsSet.getString("last_name"),
						rsSet.getString("email"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return persona;
		
	}
	
	public boolean borrarPersona(String email) {
		
		String sql = "DELETE FROM persona WHERE email = ?;";
		int rsSet = 0;
		try(PreparedStatement preStatement = conexion.prepareStatement(sql);) {
			preStatement.setString(1, email);
			rsSet = preStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsSet != 0;
		
	}
	
}
