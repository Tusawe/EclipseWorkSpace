package clases;

import java.util.List;

/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Biblioteca {

	private String localidadBiblioteca;
	private String sitioWeb;
	private List<Libro> libros;
	
	/**
	 * @param localidadBiblioteca
	 * @param sitioWeb
	 * @param libros
	 */
	public Biblioteca(String localidadBiblioteca, String sitioWeb, List<Libro> libros) {
		this.localidadBiblioteca = localidadBiblioteca;
		this.sitioWeb = sitioWeb;
		this.libros = libros;
	}

	/**
	 * @return the localidadBiblioteca
	 */
	public String getLocalidadBiblioteca() {
		return localidadBiblioteca;
	}

	/**
	 * @param localidadBiblioteca the localidadBiblioteca to set
	 */
	public void setLocalidadBiblioteca(String localidadBiblioteca) {
		this.localidadBiblioteca = localidadBiblioteca;
	}

	/**
	 * @return the sitioWeb
	 */
	public String getSitioWeb() {
		return sitioWeb;
	}

	/**
	 * @param sitioWeb the sitioWeb to set
	 */
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	/**
	 * @return the libros
	 */
	public List<Libro> getLibros() {
		return libros;
	}

	/**
	 * @param libros the libros to set
	 */
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		int total = 0;
		
		for (Libro libro : libros) {
			total = total + libro.getNumeroEjemplares();
		}
		
		return "Biblioteca: " + localidadBiblioteca + "; Sitio Web: " + sitioWeb + "; Nº total de libros: " + total;
	}
	
}
