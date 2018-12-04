public class TestCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		
	    c1.añadirGasolina(5);
	    c2.añadirGasolina(7);
	    
	    System.out.println("El primer coche " + c1.toString());
	    System.out.println("El segundo coche " + c2.toString());

	}

}
