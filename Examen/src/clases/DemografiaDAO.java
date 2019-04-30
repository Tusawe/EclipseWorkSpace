package clases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemografiaDAO {
	
	private Connection conexion;

	public DemografiaDAO() {
		try {
			this.conexion = Conexion.getConexion();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	

	public Map<String,Demografia> obtenerTodosLosDatos() {
		
		Map<String, Demografia> demografias = new HashMap<>();
		
		String sql = "SELECT * FROM demografia;";
		try(Statement sentencia = conexion.createStatement();
				ResultSet resultSet = sentencia.executeQuery(sql)) {
			while(resultSet.next()) {
				
				demografias.put(resultSet.getString("codigo"), (new Demografia(resultSet.getString("municipio"),
						resultSet.getInt("edadMedia"),
						resultSet.getInt("nacimientos"),
						resultSet.getInt("defunciones"))));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return demografias;
		
	}
	
	public List<Demografia> devolverNacimientos(int valor1, int valor2) {
		
		List<Demografia> nacimientos = new ArrayList<>();
		
		String sql = "SELECT * FROM demografia WHERE nacimientos BETWEEN " + valor1 + " and " + valor2 + ";";
		try(Statement sentencia = conexion.createStatement();
				ResultSet resultSet = sentencia.executeQuery(sql)) {
			while(resultSet.next()) {
				
				nacimientos.add(new Demografia(resultSet.getString("municipio"),
						resultSet.getInt("edadMedia"),
						resultSet.getInt("nacimientos"),
						resultSet.getInt("defunciones")));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return nacimientos;
		
	}
	
	public boolean borrarDato(String codigo) {
		
		String sql = "DELETE FROM demografia WHERE codigo = " + codigo + ";";
		
		try (Statement sentencia = conexion.createStatement();) {
			if (sentencia.executeUpdate(sql) != 0) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
}
