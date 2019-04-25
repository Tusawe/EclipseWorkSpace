package Geometria;

public class Cuadrado extends FigurasGeometricas{

	public Cuadrado(int lado) {
		super(lado, 4, "Cuadrado");
	}

	public int calcularArea() {
		int longitudLado = getLado();
		return longitudLado * longitudLado;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
