/**
 * @author José Luis Gómez
 * @version 1.0
 *
 */
public class Cliente {

	private String nombre;
	private boolean sexo; // True es mujer, fasle es hombre.
	private String dni;
	
	public int edad;
	public float peso;
	public float altura;
	
	public Cliente() {
		
		nombre = "";
		sexo = true;
		dni = generarDNI();
		
		edad = 0;
		peso = 0.0f;
		altura = 0.0f;
		
	}

	/**
	 * @param nombre
	 * @param sexo
	 * @param dni
	 */
	public Cliente(String nombre, boolean sexo, String dni) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
		
		edad = 0;
		peso = 0.0f;
		altura = 0.0f;
		
	}

	/**
	 * @param nombre
	 * @param sexo
	 * @param dni
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Cliente(String nombre, boolean sexo, int edad, float peso, float altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = generarDNI();
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
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
	 * @return the sexo
	 */
	public boolean getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", sexo=" + sexo + ", dni=" + dni + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public int calcularIMC() {
		
		float imc = peso / altura * altura;
		
		if (imc < 20) {
			
			return -1;
			
		} else if (imc >= 20 && imc <= 25) {
			
			return 0;
			
		} else {
			
			return 1;
			
		}
		
	}
	
	public boolean esMayorDeEdad() {
		
		return (edad >= 18);
		
	}
	
	private boolean comprobarSexo(boolean sexo) {
		
		return sexo == this.sexo;
		
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
