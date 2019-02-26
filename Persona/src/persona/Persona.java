package persona;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellidos;
	private Foto miFoto; // asociacion.
	private ArrayList<Perfil> misPerfiles; // composicion.
	private ArrayList<Lugar> misLugares; // agregacion.
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param miFoto
	 * @param misPerfiles
	 * @param misLugares
	 */
	public Persona(String nombre, String apellidos, Foto miFoto, ArrayList<Perfil> misPerfiles,
			ArrayList<Lugar> misLugares) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.miFoto = miFoto;
		this.misPerfiles = misPerfiles;
		this.misLugares = misLugares;
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
	 * @return the miFoto
	 */
	public Foto getMiFoto() {
		return miFoto;
	}

	/**
	 * @param miFoto the miFoto to set
	 */
	public void setMiFoto(Foto miFoto) {
		this.miFoto = miFoto;
	}

	/**
	 * @return the misPerfiles
	 */
	public ArrayList<Perfil> getMisPerfiles() {
		return misPerfiles;
	}

	/**
	 * @param misPerfiles the misPerfiles to set
	 */
	public void setMisPerfiles(ArrayList<Perfil> misPerfiles) {
		this.misPerfiles = misPerfiles;
	}

	/**
	 * @return the misLugares
	 */
	public ArrayList<Lugar> getMisLugares() {
		return misLugares;
	}

	/**
	 * @param misLugares the misLugares to set
	 */
	public void setMisLugares(ArrayList<Lugar> misLugares) {
		this.misLugares = misLugares;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", miFoto=" + miFoto + ", misPerfiles="
				+ misPerfiles + ", misLugares=" + misLugares + "]";
	}
	
	public void ponLugar(Lugar l) {	
		misLugares.add(l);
	}
	
	public void ponPerfil(String t_perfil, String des) {
		if (this.misPerfiles == null) misPerfiles = new ArrayList<Perfil>();
		this.misPerfiles.add(new Perfil(t_perfil, des));
	}
	
}
