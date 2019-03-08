package clases;

/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Libro {

	private String titutloEjemplar;
	private String isbn;
	private int numeroEjemplares;
	
	/**
	 * @param titutloEjemplar
	 * @param isbn
	 * @param numeroEjemplares
	 */
	public Libro(String titutloEjemplar, String isbn, int numeroEjemplares) {
		this.titutloEjemplar = titutloEjemplar;
		this.isbn = isbn;
		this.numeroEjemplares = numeroEjemplares;
	}

	/**
	 * @return the titutloEjemplar
	 */
	public String getTitutloEjemplar() {
		return titutloEjemplar;
	}

	/**
	 * @param titutloEjemplar the titutloEjemplar to set
	 */
	public void setTitutloEjemplar(String titutloEjemplar) {
		this.titutloEjemplar = titutloEjemplar;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the numeroEjemplares
	 */
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	/**
	 * @param numeroEjemplares the numeroEjemplares to set
	 */
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LIBRO: " +titutloEjemplar + "; ISBN: " + isbn + "; Nº EJEMPLARES: " + numeroEjemplares;
	}
	
}
