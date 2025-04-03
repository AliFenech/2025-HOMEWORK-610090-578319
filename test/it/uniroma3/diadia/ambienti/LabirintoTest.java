package it.uniroma3.diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class LabirintoTest {

	Labirinto labirinto;
	Labirinto labirinto2;
	Stanza vincente;
	Stanza corrente;
	Stanza nuova;
	
	@BeforeEach
	public void setUp() {
		labirinto=new Labirinto();
		labirinto2=new Labirinto();
		labirinto.creaLabirinto();
		labirinto2.creaLabirinto();
		corrente=labirinto2.getStanzaCorrente();
		vincente=labirinto.getStanzaVincente();
		labirinto.setStanzaCorrente(nuova);
	}
	
	@Test
	void testGetStanzaVincente() {
		assertEquals(vincente, labirinto.getStanzaVincente());
	}
	
	@Test
	void testGetStanzaCorrente() {
		assertEquals(corrente, labirinto2.getStanzaCorrente());
	}
	
	@Test
	void testSetStanzaCorrente() {
		assertEquals(nuova, labirinto.getStanzaCorrente());
	}

}
