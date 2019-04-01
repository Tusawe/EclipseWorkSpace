package ejercicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {
	
private static Connection conecction = null; // objeto de instancia unica.
	
	private ConnectionDB() {} // Constructor privado.
	
	// Metodo para obtener la instancia
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		
		if (conecction == null) {
			//Creamos conexion
			// String url = "jdbc:sqlite:db/database.db";
			Properties propiedades = new Properties();
			propiedades.load(new FileReader("config.properties"));
			String DRIVER = propiedades.getProperty("DRIVER");
			String URL = propiedades.getProperty("URL");
			conecction = DriverManager.getConnection(DRIVER + URL);
		}
		return conecction;
		
	}
	
	// Metodo para cerrar la conexion.
	public static void closeConnection() throws SQLException {
		
		if (conecction != null) conecction.close();
		
	}
	
	public static void main(String[] args) {
		
		try {
			Connection connection = ConnectionDB.getConnection();
			System.out.println(connection);
			ConnectionDB.closeConnection();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
