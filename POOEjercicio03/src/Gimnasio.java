public class Gimnasio {
	
	private String nombre;
	private String nif;
	private float precioDiaLibre;
	private float precioPorMes;
	private float dineroAcumuladoMes;
	
	/**
	 * @param nombre
	 * @param nif
	 * @param precioDiaLibre
	 * @param precioPorMes
	 * @param dineroAcumuladoMes
	 */
	public Gimnasio(String nombre, String nif, float precioDiaLibre, float precioPorMes, float dineroAcumuladoMes) {
		this.nombre = nombre;
		this.nif = nif;
		this.precioDiaLibre = precioDiaLibre;
		this.precioPorMes = precioPorMes;
		this.dineroAcumuladoMes = dineroAcumuladoMes;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the precioDiaLibre
	 */
	public float getPrecioDiaLibre() {
		return precioDiaLibre;
	}

	/**
	 * @param precioDiaLibre the precioDiaLibre to set
	 */
	public void setPrecioDiaLibre(float precioDiaLibre) {
		this.precioDiaLibre = precioDiaLibre;
	}

	/**
	 * @return the precioPorMes
	 */
	public float getPrecioPorMes() {
		return precioPorMes;
	}

	/**
	 * @param precioPorMes the precioPorMes to set
	 */
	public void setPrecioPorMes(float precioPorMes) {
		this.precioPorMes = precioPorMes;
	}

	/**
	 * @return the dineroAcumuladoMes
	 */
	public float getDineroAcumuladoMes() {
		return dineroAcumuladoMes;
	}

	/**
	 * @param dineroAcumuladoMes the dineroAcumuladoMes to set
	 */
	public void setDineroAcumuladoMes(float dineroAcumuladoMes) {
		this.dineroAcumuladoMes = dineroAcumuladoMes;
	}
	
}
