package clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

		private static Connection conexion = null;
		
		private Conexion() {}
		
		// Metodo para obtener la instancia
		public static Connection getConexion() throws SQLException, FileNotFoundException, IOException {
			
			if (conexion == null) {
				Properties propiedades = new Properties();
				propiedades.load(new FileReader("config.properties"));
				String DRIVER = propiedades.getProperty("DRIVER");
				String URL = propiedades.getProperty("URL");
				conexion = DriverManager.getConnection(DRIVER + URL);
			}
			return conexion;
			
		}
		
		// Metodo para cerrar la conexion.
		public static void cerrarConexion() throws SQLException {
			
			if (conexion != null) conexion.close();
			
		}
	
}
