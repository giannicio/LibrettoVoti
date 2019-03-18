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
	 * Seleziona il sottoinsieme di voti che hanno il voto indicato
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	// metodo migliore perchè non devo Sistem.stampare niente, ma devo gestire l'interfaccia grafica
	public List<Voto> cercaVoti(int punti) {
		
		List<Voto> result = new ArrayList<Voto>();
		for(Voto v: this.voti) {
			if(v.getPunti() == punti) {
				result.add(v);
			}
		}
		return result ;
	}
	
	// l'== è sbagliato perche implicherebbe che due stringhe stanno nella stessa allocazione di memoria
	// si può usare soltanto per gli int e i chart perchè non sono oggetti
	// neanche compareTo andrebbe bene 1h
	/**
	 * Ricerca un {@Voto} relativo al corso di cui è specificato il nome
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null}
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v: this.voti ) {
//			if(v.getCorso() == nomeEsame) {
//				return v;
//			}
			if(v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;
	}

	
	
}
