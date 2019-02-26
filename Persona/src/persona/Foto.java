package persona;

import java.util.Arrays;

public class Foto {

	private String tipoArchivo;
	private int tamanio;
	private int[] res;
	
	/**
	 * @param tipoArchivo
	 * @param tamanio
	 * @param res
	 */
	public Foto(String tipoArchivo, int tamanio, int[] res) {
		this.tipoArchivo = tipoArchivo;
		this.tamanio = tamanio;
		this.res = res;
	}
	
	/**
	 * @param tipoArchivo
	 * @param tamanio
	 */
	public Foto(String tipoArchivo, int tamanio) {
		this.tipoArchivo = tipoArchivo;
		this.tamanio = tamanio;
		this.res = new int[2];
	}
	
	public void ponResolucion(int ancho, int alto) {
		
		res[0] = ancho;
		res[1] = alto;
		
	}

	/**
	 * @return the tipoArchivo
	 */
	public String getTipoArchivo() {
		return tipoArchivo;
	}

	/**
	 * @param tipoArchivo the tipoArchivo to set
	 */
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}

	/**
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * @return the res
	 */
	public int[] getRes() {
		return res;
	}

	/**
	 * @param res the res to set
	 */
	public void setRes(int[] res) {
		this.res = res;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Foto [tipoArchivo=" + tipoArchivo + ", tamanio=" + tamanio + ", res=" + Arrays.toString(res) + "]";
	}
	
	
	
}
