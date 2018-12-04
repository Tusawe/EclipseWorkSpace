/**
 * 
 */

/**
 * @author Jose Luis
 * @version 1.0
 */
public class Rectangulo {

	//atributos
	private int base;
	private int altura;
	
	//constructor
	/**
	 * Constructor unico para generar objetos de tipo Rectangulo.
	 * @param base int relacionado con la base del rectangulo.
	 * @param altura int relacionado con la altura del rectangulo.
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return la base del rectangulo.
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param la base del rectangulo a modificar.
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return la altura del rectangulo.
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param la altura del rectangulo a modificar.
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo de base " + base + " y altura " + altura;
	}
	
	
}
