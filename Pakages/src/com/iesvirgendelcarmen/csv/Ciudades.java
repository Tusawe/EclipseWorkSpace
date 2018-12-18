package com.iesvirgendelcarmen.csv;

/**
 * @author matinal
 *
 */
public class Ciudades {
	
	private String nombre;
	private String nombrePais;
	private float latitud;
	private float longitud;
	
	/**
	 * @param nombre
	 * @param nombrePais
	 * @param latitud
	 * @param longitud
	 */
	public Ciudades(String nombre, String nombrePais, float latitud, float longitud) {
		this.nombre = nombre;
		this.nombrePais = nombrePais;
		this.latitud = latitud;
		this.longitud = longitud;
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
	 * @return the nombrePais
	 */
	public String getNombrePais() {
		return nombrePais;
	}

	/**
	 * @param nombrePais the nombrePais to set
	 */
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	/**
	 * @return the latitud
	 */
	public float getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ciudades [nombre=" + nombre + ", nombrePais=" + nombrePais + ", latitud=" + latitud + ", longitud="
				+ longitud + "]";
	}
	
	
	
}
