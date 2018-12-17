import javax.swing.JOptionPane;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		// Solicitamos los dos catetos con joptionpane
		String sCateto1 = JOptionPane.showInputDialog("Introduce el valor de cateto1");
		if (!sCateto1.matches("[0-9]+")) {
			
			JOptionPane.showMessageDialog(null, "Valor no permitido", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
			
		}	
		
		String sCateto2 = JOptionPane.showInputDialog("Introduce el valor de cateto2");
		if (!sCateto2.matches("[0-9]+")) {
			
			JOptionPane.showMessageDialog(null, "Valor no permitido", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		int iCateto1 = Integer.parseInt(sCateto1);
		int iCateto2 = Integer.parseInt(sCateto2);
		
		// Construir un objeto de tippo TrianguloRectangulo.
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(iCateto1, iCateto2);
		
		System.out.printf("%S, de área %.2f y de perímetro %.2f %n", trianguloRectangulo, trianguloRectangulo.calcularArea(), trianguloRectangulo.calcularPerimetro());
		
		String titulo = "Informacion del triangulo rectangulo.";
		String mensaje = trianguloRectangulo + " " 
						+ "\nArea: " + Math.round(trianguloRectangulo.calcularArea() * 100) / 100.0 
						+ "\nPerimetro: " + Math.round(trianguloRectangulo.calcularPerimetro() * 100) / 100.0;
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
		
	}

}
