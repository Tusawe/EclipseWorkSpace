package cafetera;

public class Cafetera {
	
	private int vasos;
	private int palitos;
	private int azucar;
	private double agua;
	private Consumible consumibles[];
	
	/**
	 * @param vasos
	 * @param palitos
	 * @param azucar
	 * @param agua
	 * @param consumibles
	 */
	public Cafetera(int vasos, int palitos, int azucar, double agua) {
		this.vasos = vasos;
		this.palitos = palitos;
		this.azucar = azucar;
		this.agua = agua;
		this.consumibles = new Consumible[5];
	}

	/**
	 * @return the vasos
	 */
	public int getVasos() {
		return vasos;
	}

	/**
	 * @param vasos the vasos to set
	 */
	public void setVasos(int vasos) {
		this.vasos = vasos;
	}

	/**
	 * @return the palitos
	 */
	public int getPalitos() {
		return palitos;
	}

	/**
	 * @param palitos the palitos to set
	 */
	public void setPalitos(int palitos) {
		this.palitos = palitos;
	}

	/**
	 * @return the azucar
	 */
	public int getAzucar() {
		return azucar;
	}

	/**
	 * @param azucar the azucar to set
	 */
	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}

	/**
	 * @return the agua
	 */
	public double getAgua() {
		return agua;
	}

	/**
	 * @param agua the agua to set
	 */
	public void setAgua(double agua) {
		this.agua = agua;
	}

	/**
	 * @return the consumibles
	 */
	public Consumible[] getConsumibles() {
		return consumibles;
	}
	
	public void insertarConsumible(int i, int tiempo, double precio, double agua, int capsulas) {
		
		this.consumibles[i] = new Consumible(tiempo, precio, agua, capsulas);
		
	}
	
}
