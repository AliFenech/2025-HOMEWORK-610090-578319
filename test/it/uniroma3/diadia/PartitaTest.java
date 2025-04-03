package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

import org.junit.jupiter.api.BeforeEach;

public class PartitaTest {
	Partita p1;
	Partita p2;
	Partita p3;
	Partita p4;
	Stanza corrente;
	Stanza vincente;
	Stanza vincente2;
	Giocatore alessio;
	
	@BeforeEach
	public void setUp() {
		p1=new Partita();
		p2=new Partita();
		p3=new Partita();
		p4=new Partita();
		corrente=new Stanza("corrente");
		alessio=p1.getGiocatore();
		p1.setStanzaCorrente(corrente);
		vincente=p1.getStanzaVincente();
		p2.setFinita();
		p3.setCfu(0);
		vincente2=p4.getStanzaVincente();
		p4.setStanzaCorrente(vincente2);
	}

	@Test
	void testStanzaCorrenteCorretto() {
		assertEquals(corrente, p1.getStanzaCorrente());
	}
	
	@Test
	void testStanzaCorrenteScorretto() {
		assertNotEquals(vincente, p1.getStanzaCorrente());
	}
	
	@Test
	void testStanzaVincenteCorretto() {
		assertEquals(vincente, p1.getStanzaVincente());
	}
	
	@Test
	void testStanzaVincenteScorretto() {
		assertNotEquals(corrente, p1.getStanzaVincente());
	}
	
	@Test
	void testNotFinita() {
		assertFalse(p1.isFinita());
	}
	
	@Test
	void testSetFinita() {
		assertTrue(p2.isFinita());
	}
	
	@Test
	void testFinitaCfuFiniti() {
		assertTrue(p3.isFinita());
	}
	
	@Test
	void testFinitaVinta() {
		assertTrue(p4.isFinita());
	}
	
	@Test
	void testGetGiocatore() {
		assertEquals(alessio, p1.getGiocatore());
	}
	
}
