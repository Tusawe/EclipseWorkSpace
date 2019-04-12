package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	private static Connection connection;
	private ConnectionDB() {}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			
			connection = DriverManager.getConnection("jdbc:slite:db/cars.sql");
			
		}
		return connection;
		
	}
	
	public static void closeConnection() throws SQLException {
		
		if (connection != null)	connection.close();
		
	}
	
}
