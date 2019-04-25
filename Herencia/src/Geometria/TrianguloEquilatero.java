package Geometria;

public class TrianguloEquilatero extends FigurasGeometricas{

	public TrianguloEquilatero(int lado) {
		super(lado, 3, "Triangulo Equilatero");
	}

	public float calcularArea() {
		int longitudLado = getLado();
		return (float) ((Math.sqrt(3) * (longitudLado * longitudLado)) / 4);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
