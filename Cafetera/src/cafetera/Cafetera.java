package cafetera;

public class Cafetera {

	private int vasos;
	private float nivelAgua;
	
	public Cafetera() {
		
		this.vasos = 0;
		this.nivelAgua = 0;
		
	}
	
	public Cafetera(int v, float nivel) {
		
		this.vasos = v;
		this.nivelAgua = nivel;
		
	}
	
	public String devCafetera() {
		
		String aux = "Numero de vasos = " + this.vasos;
		aux += " Y el nivel de agua = " + this.nivelAgua;
		
		return aux;
		
	}
	
	public String toString() {
		
		String aux = "Numero de vasos = " + this.vasos;
		aux += " Y el nivel de agua = " + this.nivelAgua;
		
		return aux;
		
	}

	public int getVasos() {
		return vasos;
	}

	public void setVasos(int vasos) {
		this.vasos = vasos;
	}

	public float getNivel_agua() {
		return nivelAgua;
	}

	public void setNivel_agua(float nivel_agua) {
		this.nivelAgua = nivel_agua;
	}
	
	

}
