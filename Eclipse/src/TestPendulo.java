
public class TestPendulo {

	public static void main(String[] args) {
		
		Pendulo pendulo = new Pendulo(25.2f);
		System.out.println(pendulo);
		System.out.printf("El valor del periodo vale %.2f%n", pendulo.calcularPeriodo());

	}

}
