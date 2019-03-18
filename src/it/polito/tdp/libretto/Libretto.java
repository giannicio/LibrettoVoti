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
	
	//public void StampaVoti(int voto) {}
	//public String StampaVoti2(int voto) {}
	/**
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi 
	 */
	public List<Voto> cercaVoti(int punti) {
		
		List<Voto> result = new ArrayList<Voto>();
		for(Voto v: this.voti) {
			if(v.getPunti() == punti) {
				result.add(v);
			}
		}
		return result ;
	}
	// metodo migliore perchè non devo Sistem.stampare niente, ma devo gestire l'interfaccia grafica
}
