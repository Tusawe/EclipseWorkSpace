package serializacion;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EscribePersona {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("09/01/1997", formatter);
		Persona persona = new Persona("José Luis", "Gómez López", date);
		
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						new File("Datos/persona.dat"))));) {
			out.writeObject(persona);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
