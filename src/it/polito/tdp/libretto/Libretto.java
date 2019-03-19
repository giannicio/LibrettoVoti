package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
// guardare video lezione o usare git per vedere varie versioni del file
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
	 * @return {@code true}
	 */
	
	public boolean add(Voto v) {
		if (!this.esisteGiaVoto(v) && !this.votoConflitto(v)) {
			voti.add(v);
			return true;
		}
		else {
			return false;
		}
		// voti in ordine di inserimento
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
		Voto voto = new Voto(0, nomeEsame, null);
		int pos = this.voti.indexOf(voto);
			if(pos == -1)
				return null;else
					return this.voti.get(pos);
	}
	/**
	 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true}, se ha trovato un corso e punteggio uguale, 
	 * {@false}, se non ha trovato il corso o lo ha trovato ma on voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
			if (pos == -1)
				return false;
			else {
				return (v.getPunti() == this.voti.get(pos).getPunti());
			}
	}
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	public boolean votoConflitto(Voto v) {
		int pos = this.voti.indexOf(v);
		if (pos == -1)
			return false;
		else {
			return (v.getPunti() != this.voti.get(pos).getPunti());
	}
}
}
