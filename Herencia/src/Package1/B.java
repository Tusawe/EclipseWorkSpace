package Package1;

public class B {

	private void metodo() {
		
		System.out.println("En la clase B");
		
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.metodo();
		System.out.println(a.valorDefault);
		System.out.println(a.valorProtected);
		System.out.println(a.valorPublico);
		System.out.println("valor privado no accesible.");
		
		B b = new B();
		b.metodo();
		
	}
	
}
