package it.uniroma3.diadia.giocatore;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GiocatoreTest {
	Giocatore alessio;
	Giocatore angelica;
	
	@BeforeEach
	public void SetUp() {
		alessio=new Giocatore();
		angelica=new Giocatore();
		alessio.setCfu(180);
	}
	
	@Test
	void testGetCfu() {
		assertEquals(180, alessio.getCfu());
	}
	
	@Test
	void testGetCfuIniziali() {
		assertEquals(20, angelica.getCfu());
	}
	
	@Test
	void testGetBorsa() {
		assertNotNull(alessio.getBorsa());
	}
	
	@Test
	void testBorsaInizialeVuota() {
		assertTrue(alessio.getBorsa().isEmpty());
	}

}
