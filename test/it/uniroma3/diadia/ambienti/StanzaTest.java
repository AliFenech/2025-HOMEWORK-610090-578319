package it.uniroma3.diadia.ambienti;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.jupiter.api.BeforeEach;

// TODO cambiare nomi variabili, implementare testArrayAttrezzi.

public class StanzaTest {
	Stanza atrio;
	Stanza corridoio;
	Stanza reception;
	Attrezzo sasso;
	Attrezzo disco;
	Attrezzo mouse;
	
	@BeforeEach
	public void setUp() {
		atrio = new Stanza("Atrio");
		mouse=new Attrezzo("mouse", 2);
		corridoio = new Stanza("Corridoio");
		reception = new Stanza("Reception");
		atrio.addStanzaAdiacente("nord", corridoio);
		sasso = new Attrezzo("sasso", 3);
		disco=new Attrezzo("disco", 4);
		atrio.addAttrezzo(sasso);
		atrio.addAttrezzo(disco);
		atrio.removeAttrezzo(disco);
	}
	
	@Test
	public void testStanzaAdiacenteNuova() {
		assertEquals(corridoio, atrio.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testStanzaAdiacenteAggiornata() {
		atrio.addStanzaAdiacente("nord", reception);
		assertEquals(reception, atrio.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testStanzaAdiacenteNull() {
		assertNull(atrio.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testAggiuntoNuovoAttrezzo() {
		assertTrue(atrio.addAttrezzo(new Attrezzo("penna", 1)));
	}
	
	@Test
	public void testRicercaAttrezzoReturnStringa() {
		assertTrue(atrio.hasAttrezzo("sasso"));
	}
	
	@Test 
	public void testRicercaAttrezzoReturnAttrezzo() {
		assertEquals(sasso, atrio.getAttrezzo("sasso"));
	}
	
	@Test
	public void testAttrezzoNull() {
		assertNull(atrio.getAttrezzo("masso"));
		}
	
	@Test
	public void testGetDirezioni() {
		assertArrayEquals(new String[] {"nord"}, atrio.getDirezioni());
	}
	
	@Test
	public void testRemoveAttrezzoPresente() {
		assertTrue(atrio.removeAttrezzo(sasso));
	}
	
	@Test
	public void testRemoveAttrezzoNonPresente() {
		assertFalse(atrio.removeAttrezzo(mouse));
	}
	
	@Test
	public void testRicercaAttrezzoRimosso() {
		assertFalse(atrio.hasAttrezzo("disco"));
	}
//	@Test
//	public void testArrayAttrezzi() {
//		assertArrayEquals(new Attrezzo[] {sasso, disco}, atrio.getAttrezzi());
//	}

}