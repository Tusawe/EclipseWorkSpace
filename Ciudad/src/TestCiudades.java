import javax.swing.JOptionPane;

public class TestCiudades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreCiudad = JOptionPane.showInputDialog(null, "Introduce el nombre de la ciudad", "CIUDAD", JOptionPane.QUESTION_MESSAGE);
		
		String latitudCiudad = JOptionPane.showInputDialog(null, "Introduce la latitud de la ciudad", "LATITUD", JOptionPane.QUESTION_MESSAGE);
		if (!latitudCiudad.matches("^-?[\\d]+([\\.,]\\d+)?")) {
			
			JOptionPane.showMessageDialog(null, "Latitud erronea", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		String longitudCiudad = JOptionPane.showInputDialog(null, "Introduce la longitud de la ciudad", "LONGITUD", JOptionPane.QUESTION_MESSAGE);
		if (!longitudCiudad.matches("^-?[\\d]+([\\.,]\\d+)?")) {
			
			JOptionPane.showMessageDialog(null, "Longitud erronea", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		float latitud = Float.parseFloat(latitudCiudad.replaceAll(",","."));
		float longitud = Float.parseFloat(longitudCiudad.replaceAll(",","."));
		
		try {
			Ciudad ciudad = new Ciudad(nombreCiudad,latitud, longitud);
			System.out.println(ciudad);
		} catch (CordenadasErroneasExcepcion e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Coordenadas erroneas", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
