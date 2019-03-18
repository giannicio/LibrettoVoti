package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	// ci metto una lista di oggetti voto
	
	private List<Voto> voti; 
	// arrayList o linkedList?
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge yn nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	
	public void add(Voto v) {
		// voti in ordine di inserimento
		voti.add(v);
	}
}
