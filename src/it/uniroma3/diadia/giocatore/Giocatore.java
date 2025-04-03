package it.uniroma3.diadia.giocatore;

public class Giocatore {
	static final private int CFU_INIZIALI = 20;
	
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		cfu=CFU_INIZIALI;
		borsa=new Borsa();
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	public Borsa getBorsa() {
		return this.borsa;
	}
	
	public String toString() {
		StringBuilder risultato = new StringBuilder();
		risultato.append("Hai: " + this.cfu + "cfu\n");
		risultato.append("Nella tua borsa ci sono i seguenti attrezzi: " +this.getBorsa());
		return risultato.toString();
	}

}
