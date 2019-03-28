package com.iesvirgendelcarmen.jdbc.teoria.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iesvirgendelcarmen.jdbc.teoria.Persona;
import com.iesvirgendelcarmen.jdbc.teoria.PersonaDAO;

public class PersonaDAOTest {

	@Test
	public void testObtenerTodasLasPersonas() {
		PersonaDAO personaDAO = new PersonaDAO();
		assertTrue(personaDAO.obtenerTodasLasPersonas().size() == 1000);
		assertTrue(personaDAO.obtenerTodasLasPersonas().get(999)
				.equals(new Persona("Lishe","Ashe")));
	}

	@Test
	public void testObtenerPersonaPorEmail() {
		PersonaDAO personaDAO = new PersonaDAO();
		assertTrue(personaDAO.obtenerPersonaPorEmail("lasherr@jalbum.net")
				.equals(new Persona("Lishe","Ashe")));
		assertFalse(personaDAO.obtenerPersonaPorEmail("lasherr@jalbum.net")
				.equals(new Persona("Jabez","Virgoe")));
	}

}
