package Geometria;

public class Hexagono extends FigurasGeometricas{

	public Hexagono(int lado) {
		super(lado, 6, "Hexagono");
	}
	
	public float calcularArea() {
		int longitudLado = getLado();
		float apotema = (float) Math.sqrt((longitudLado * longitudLado) - (longitudLado/2 * longitudLado/2));
		return (calcularPerimetro() * apotema) / 2;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
