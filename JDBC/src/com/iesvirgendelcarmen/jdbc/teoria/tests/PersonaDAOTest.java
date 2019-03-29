package com.iesvirgendelcarmen.jdbc.teoria.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iesvirgendelcarmen.jdbc.teoria.Persona;
import com.iesvirgendelcarmen.jdbc.teoria.PersonaDAO;

public class PersonaDAOTest {

//	@Test
//	public void testObtenerTodasLasPersonas() {
//		PersonaDAO personaDAO = new PersonaDAO();
//		assertTrue(personaDAO.obtenerTodasLasPersonas().size() == 1000);
//		assertTrue(personaDAO.obtenerTodasLasPersonas().get(999)
//				.equals(new Persona("Lishe","Ashe")));
//	}

//	@Test
//	public void testObtenerPersonaPorEmail() {
//		PersonaDAO personaDAO = new PersonaDAO();
//		assertTrue(personaDAO.obtenerPersonaPorEmail("lasherr@jalbum.net")
//				.equals(new Persona("Lishe","Ashe")));
//		assertFalse(personaDAO.obtenerPersonaPorEmail("lasherr@jalbum.net")
//				.equals(new Persona("Jabez","Virgoe")));
//	}
	
//	@Test
//	public void testBorrarPersona() {
//		
//		PersonaDAO personaDAO = new PersonaDAO();
//		assertTrue(personaDAO.obtenerPersonaPorEmail("jvirgoerq@woothemes.com")
//				.equals(new Persona("Jabez","Virgoe")));
//		assertTrue(personaDAO.borrarPersona("jvirgoerq@woothemes.com"));
//		
//	}
	
//	@Test
//	public void testActualizarEmail() {
//		
//		PersonaDAO personaDAO = new PersonaDAO();
//		assertTrue(personaDAO.obtenerPersonaPorEmail("hola@gmail.com")
//				.equals(new Persona("Nonah","Kondratovich")));
//		assertTrue(personaDAO.actualizarEmail(998,"nkondratovichrp@cnbc.com"));
//		
//	}
	
	@Test
	public void testInsertarPersona() {
			
			PersonaDAO personaDAO = new PersonaDAO();
			assertTrue(personaDAO.insertarPersona(999,"Jose","Gomez","wllingtonquiw@quebacaneria.com"));
			
	}

}
