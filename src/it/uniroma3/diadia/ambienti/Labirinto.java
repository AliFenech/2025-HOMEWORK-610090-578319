package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Labirinto {
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	public void creaLabirinto() {
		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
    	
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		/* collega le stanze */
		atrio.addStanzaAdiacente("nord", biblioteca);
		atrio.addStanzaAdiacente("est", aulaN11);
		atrio.addStanzaAdiacente("sud", aulaN10);
		atrio.addStanzaAdiacente("ovest", laboratorio);
		aulaN11.addStanzaAdiacente("est", laboratorio);
		aulaN11.addStanzaAdiacente("ovest", atrio);
		aulaN10.addStanzaAdiacente("nord", atrio);
		aulaN10.addStanzaAdiacente("est", aulaN11);
		aulaN10.addStanzaAdiacente("ovest", laboratorio);
		laboratorio.addStanzaAdiacente("est", atrio);
		laboratorio.addStanzaAdiacente("ovest", aulaN11);
		biblioteca.addStanzaAdiacente("sud", atrio);

        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);

		// il gioco comincia nell'atrio
		this.stanzaCorrente = atrio;  
		this.stanzaVincente = biblioteca;

	}
	
	public Stanza getStanzaVincente() {
		return this.stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
}
