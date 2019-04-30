package clases;

public class Demografia {

	private String municipio;
	private int edadMedia, nacimientos, defunciones;
	
	public Demografia(String municipio, int edadMedia, int nacimientos, int defunciones) {
		this.municipio = municipio;
		this.edadMedia = edadMedia;
		this.nacimientos = nacimientos;
		this.defunciones = defunciones;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getEdadMedia() {
		return edadMedia;
	}

	public void setEdadMedia(int edadMedia) {
		this.edadMedia = edadMedia;
	}

	public int getNacimientos() {
		return nacimientos;
	}

	public void setNacimientos(int nacimientos) {
		this.nacimientos = nacimientos;
	}

	public int getDefunciones() {
		return defunciones;
	}

	public void setDefunciones(int defunciones) {
		this.defunciones = defunciones;
	}

	@Override
	public String toString() {
		return String.format("Municipio: %s, edad media: %d, nacimientos: %d, defunciones: %d", municipio,
				edadMedia, nacimientos, defunciones);
	}
	
}
