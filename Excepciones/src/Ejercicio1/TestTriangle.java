package Ejercicio1;

import javax.swing.JOptionPane;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sideATriangle = JOptionPane.showInputDialog(null, "Enter the FIRST side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
		
		while (!sideATriangle.matches("^\\d+([\\.,]\\d+)?$")) {
			
			JOptionPane.showMessageDialog(null, "Wrong side", "ERROR", JOptionPane.ERROR_MESSAGE);
			sideATriangle = JOptionPane.showInputDialog(null, "Enter the FIRST side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
			
		}
		
		String sideBTriangle = JOptionPane.showInputDialog(null, "Enter the SECOND side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
		
		while (!sideBTriangle.matches("^\\d+([\\.,]\\d+)?$")) {
			
			JOptionPane.showMessageDialog(null, "Wrong side", "ERROR", JOptionPane.ERROR_MESSAGE);
			sideBTriangle = JOptionPane.showInputDialog(null, "Enter the SECOND side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
			
		}
		
		String sideCTriangle = JOptionPane.showInputDialog(null, "Enter the THIRD side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
		
		while (!sideCTriangle.matches("^\\d+([\\.,]\\d+)?$")) {
			
			JOptionPane.showMessageDialog(null, "Wrong side", "ERROR", JOptionPane.ERROR_MESSAGE);
			sideCTriangle = JOptionPane.showInputDialog(null, "Enter the THIRD side of a triangle", "TRIANGLE", JOptionPane.QUESTION_MESSAGE);
			
		}
		
		float sideA = Float.parseFloat(sideATriangle.replaceAll(",","."));
		float sideB = Float.parseFloat(sideBTriangle.replaceAll(",","."));
		float sideC = Float.parseFloat(sideCTriangle.replaceAll(",","."));
		
		try {
			Triangle triangle = new Triangle(sideA, sideB, sideC);
			System.out.println(triangle);
		} catch (IlegalTriangleException e) {
			// e.printStackTrace();
			
			JOptionPane.showMessageDialog(null, "Triangle not possible", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
