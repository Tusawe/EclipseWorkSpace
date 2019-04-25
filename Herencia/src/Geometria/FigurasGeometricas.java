package Geometria;

public class FigurasGeometricas {

	private int lado;
	private int nLados;
	private String nombre;
	
	public FigurasGeometricas(int lado, int nLados, String nombre) {
		this.lado = lado;
		this.nLados = nLados;
		this.nombre = nombre;
	}

	public int getLado() {
		return lado;
	}

	@Override
	public String toString() {
		return "Soy " + nombre + ", con lado " + lado + " y perímetro " + calcularPerimetro();
	}
	
	protected int calcularPerimetro() {
		
		int perimetro = 0;
		while(nLados != 0) {
			
			perimetro += lado;
			nLados--;
			
		}
		return perimetro;
		
	}
	
}
