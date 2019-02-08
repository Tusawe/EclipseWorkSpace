
public class TestClasesAnidadas {

	public static void main(String[] args) {
		
		ClaseExterna cE = new ClaseExterna(5);
		System.out.println("Atributo de la clase externa: " + cE.getValorExterno());
		
		ClaseExterna.ClaseInterna cI = cE.new ClaseInterna("Hola de nuevo chavules!");
		System.out.println("Atributo de la clase interna: " + cI.getValorInterno());
		System.out.println("Atributo externo desde interno: " + cI.doblarValorExterno());
		System.out.println(cE.devolverValorInterno());
		
		ClaseExterna.ClaseInterna cII = new ClaseExterna(10).new ClaseInterna("Hello <3");
		
	}

}
