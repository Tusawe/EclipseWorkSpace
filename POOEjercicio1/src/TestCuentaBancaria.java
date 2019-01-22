import java.util.Scanner;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria("Jose Luis", 200.0f);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una de las dos opciones:");
		System.out.println("(1) Ingresar dinero.");
		System.out.println("(2) Retirar dinero.");
		int op = sc.nextInt();
		float cantidad;
		
		switch (op) {
		
			case 1: 
				
				do {
					System.out.println("¿Cuanto dinero desea ingresar?");
					cantidad = sc.nextFloat();
					
					if (cantidad <= 0) {						
						System.out.println("ERROR: Cantidad incorrecta, pruebe otra vez.");						
					}
					
				} while(cantidad <= 0);
				
				cuenta1.ingresarCantidad(cantidad);
					
				break;
				
			case 2: 
				
				do {
					System.out.println("¿Cuanto dinero desea retirar?");
					cantidad = sc.nextFloat();
					
					if (cantidad <= 0 || cantidad > cuenta1.getCantidad()) {						
						System.out.println("ERROR: Cantidad incorrecta, pruebe otra vez.");						
					}
					
				} while(cantidad <= 0  || cantidad > cuenta1.getCantidad());
				
				cuenta1.sacarCantidad(cantidad);
					
				break;
		
		}
		
		sc.close();
		
		System.out.printf("Le queda %.2f € señor %s%n",cuenta1.getCantidad(),cuenta1.getTitular());

	}

}
