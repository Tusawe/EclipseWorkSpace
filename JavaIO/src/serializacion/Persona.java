package serializacion;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@SuppressWarnings("serial")
public class Persona implements Serializable {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 */
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
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
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NOMBRE: " + nombre + "\nAPELLIDOS: " + apellidos + "\nEDAD: " + calcularEdad () + " años";
	}
	
	public int calcularEdad() {

		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		return periodo.getYears();
		
	}
	
	/* public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("09/01/1997", formatter);
		Persona persona = new Persona("José Luis", "Gómez López", date);
		
		System.out.println(persona);
		
	} */
	
}
