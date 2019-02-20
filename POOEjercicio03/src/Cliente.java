public class Cliente {

	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
		
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param telefono
	 */
	public Cliente(String nombre, String apellidos, String dni, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}



	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}



	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private String generarDNI() {
		
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int numero = (int) (Math.random() * 9); 
		String sDNI = "";
		
		for (int i = 0; i <= 8; i++) {
			
			sDNI += numero; 
			
		}
		
		int iDNI = Integer.parseInt(sDNI);
	    char letra = juegoCaracteres.charAt(iDNI % 23);
	    sDNI += letra;
		
		return sDNI;	
			
	}
	
}
