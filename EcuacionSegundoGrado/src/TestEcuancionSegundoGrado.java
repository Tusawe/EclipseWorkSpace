import javax.swing.JOptionPane;

public class TestEcuancionSegundoGrado {

	public static void main(String[] args) {
		// Pedimos variables
		String sA = JOptionPane.showInputDialog("Introduce el valor de A");
		float iA = Integer.parseInt(sA);	
		
		String sB = JOptionPane.showInputDialog("Introduce el valor de B");
		float iB = Integer.parseInt(sB);
		
		String sC = JOptionPane.showInputDialog("Introduce el valor de C");
		int iC = Integer.parseInt(sC);
		
		EcuacionSegundoGrado ecuacionSegundoGrado = new EcuacionSegundoGrado(iA, iB, iC);
		
		if (!ecuacionSegundoGrado.esResoluble()) {
			
			JOptionPane.showMessageDialog(null, "Ecuacion de segundo grado sin solucion", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		if (iB*iB - 4*iA*iC == 0) {
			
			// Solo tiene una solucion
			System.out.println(ecuacionSegundoGrado);
			System.out.printf("La solucion es X1 = %.2f",ecuacionSegundoGrado.calcularX1());
			
		} else {
			
			// Tiene dos soluciones
			System.out.println(ecuacionSegundoGrado);
			System.out.printf("La solucion es X1 = %.2f",ecuacionSegundoGrado.calcularX1());
			System.out.printf("La solucion es X2 = %.2f",ecuacionSegundoGrado.calcularX2());
			
		}
		
	}

}
