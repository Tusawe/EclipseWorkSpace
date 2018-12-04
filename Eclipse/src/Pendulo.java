public class Pendulo {
	
	//atributos
	private float longitud;
	
	//constructor
	public Pendulo(float longitud) {
		this.longitud = longitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float calcularPeriodo() {
		
		float periodo = (float) (2 * Math.PI * Math.sqrt(longitud) / 9.8);
		return periodo;
		
	}
	
	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + "]";
	}
	
}
