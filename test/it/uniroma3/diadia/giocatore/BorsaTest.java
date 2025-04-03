package it.uniroma3.diadia.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class BorsaTest {
	Borsa borsa;
	Borsa borsa2;
	Attrezzo sasso;
	Attrezzo sassone;
	Attrezzo masso;
	Attrezzo sassolino;
	Attrezzo pietra;
	
	@BeforeEach
	public void setUp() {
		borsa=new Borsa();
		sasso=new Attrezzo("sasso", 4);
		sassone=new Attrezzo("sassone", 7);
		masso=new Attrezzo("masso", 12);
		sassolino=new Attrezzo("sassolino", 2);
		pietra=new Attrezzo("pietra", 3);
		borsa2=new Borsa();
		borsa2.addAttrezzo(sasso);
		borsa2.addAttrezzo(pietra);
		borsa2.addAttrezzo(sassolino);
		
	}

	@Test
	void testAddAttrezzo() {
		assertTrue(borsa.addAttrezzo(sasso));
	}
	
	@Test
	void testAddAttrezzoPesoMaggiore10() {
		assertFalse(borsa.addAttrezzo(masso));
	}
	
	@Test
	void testAddAttrezzoSommaMaggiore10() {
		assertFalse(borsa2.addAttrezzo(sassone));
	}
	
	@Test
	void TestGetAttrezzo() {
		assertEquals(sasso, borsa2.getAttrezzo("sasso"));
	}
	
	@Test
	void testGetAttrezzoNonPresente() {
		assertNull(borsa2.getAttrezzo("masso"));
	}
	
//	@Test
//	void testGetAttrezzo?() {
//	}
	
	@Test
	void testRemoveAttrezzoPrimo() {
		assertTrue(borsa2.removeAttrezzo(sasso));
	}
	
	@Test
	void testRemoveAttrezzoInCoda() {
		assertTrue(borsa2.removeAttrezzo(sassolino));
	}
	
	@Test
	void testRemoveAttrezzoInMezzo() {
		assertTrue(borsa2.removeAttrezzo(pietra));
	}
	
	@Test	
	void testRemoveAttrezzoNonPresente() {
		assertFalse(borsa.removeAttrezzo(masso));
	}
	
}
