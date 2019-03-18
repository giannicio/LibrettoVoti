package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// richiamo qui i metodi della classe libretto per vedere se funzionano
		
		Libretto libr = new Libretto();
		
		//  reo un oggetto voto e lo aggiungo al libretto
		libr.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21, "Analisi II", LocalDate.of(2018, 2, 25)));
		libr.add(new Voto(25, "Sistemi elettrici", LocalDate.of(2018, 7, 14)));
		libr.add(new Voto(28, "Economia", LocalDate.of(2017, 6, 30)));
		libr.add(new Voto(18, "Fisica II", LocalDate.of(2017, 6, 17)));
		libr.add(new Voto(20, "Basi di dati", LocalDate.of(2017, 1, 3)));
		libr.add(new Voto(25, "Sistemi di produzione", LocalDate.of(2017, 2, 4)));
		libr.add(new Voto(24, "Statistica", LocalDate.of(2017, 7, 8)));
		libr.add(new Voto(25, "Ricerca Operativa", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(27, "Programmazione a oggetti", LocalDate.of(2017, 1, 16)));
		
	}

}
