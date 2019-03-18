package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	public int getPunti() {
		return punti;
	}
	public void setPunti(int voto) {
		this.punti = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}
	private int punti;
	private String corso;
	private LocalDate data; // da libreria Java.time per lavorare sulle date
	
	@Override
	public String toString() {
		return "Voto [voto=" + punti + ", corso=" + corso + ", data=" + data + "]";
	}
}
