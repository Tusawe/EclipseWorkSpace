package persona;

public class Perfil {

	private String tipoPerfil;
	private String descripcion;
	
	/**
	 * @param tipoPerfil
	 * @param descripcion
	 */
	public Perfil(String tipoPerfil, String descripcion) {
		this.tipoPerfil = tipoPerfil;
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the tipoPerfil
	 */
	public String getTipoPerfil() {
		return tipoPerfil;
	}
	/**
	 * @param tipoPerfil the tipoPerfil to set
	 */
	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Perfil [tipoPerfil=" + tipoPerfil + ", descripcion=" + descripcion + "]";
	}
	
}
