package cafetera;

public class Gui {

public static void main(String[] args) {
		
		Cafetera maquina = new Cafetera();
		
		System.out.println(maquina.devCafetera());
		System.out.println(maquina);
		
		maquina.setVasos(15);
		
		System.out.println(maquina);

	}

}

