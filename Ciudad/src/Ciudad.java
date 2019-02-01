/**
 * @author matinal
 * @version jose luis
 *
 */
public class Ciudad {

	private String nombreCiudad;
	private double latitud;
	private double longitud;
	
	/**
	 * @param nombreCiudad
	 * @param latitud
	 * @param longitud
	 * @throws CordenadasErroneasExcepcion 
	 */
	public Ciudad(String nombreCiudad, double latitud, double longitud) throws CordenadasErroneasExcepcion {
		if (latitud > 90 || latitud < -90 || longitud > 180 || longitud < -180)
			throw new CordenadasErroneasExcepcion();
		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * @return the nombreCiudad
	 */
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	/**
	 * @param nombreCiudad the nombreCiudad to set
	 */
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 * @throws CordenadasErroneasExcepcion 
	 */
	public void setLatitud(double latitud) throws CordenadasErroneasExcepcion {
		if (latitud > 90 || latitud < -90)
			throw new CordenadasErroneasExcepcion();
		else
			this.latitud = latitud;
	}	

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 * @throws CordenadasErroneasExcepcion 
	 */
	public void setLongitud(double longitud) throws CordenadasErroneasExcepcion {
		if (longitud > 180 || longitud < -180)
			throw new CordenadasErroneasExcepcion();
		else
			this.longitud = longitud;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ciudad [nombreCiudad=" + nombreCiudad + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
	
}
