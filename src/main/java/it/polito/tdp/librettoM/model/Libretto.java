package it.polito.tdp.librettoM.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Memorizza e gestisce un insieme di voti superati
 * 
 * @author lavic98
 *
 */
public class Libretto {

	private List<Voto> voti = new ArrayList<>();

	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v --> voto aggiunto
	 * 
	 */
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	/** r2.a
	 * Dato un libretto rida solo i valori dei voti passati come paramtri
	 * @param voto --> passato come parametro
	 * @return stringa formatta per creare il nuovo libretto
	 */
	public String stampaVotiUguali(int voto) {
		String s=" ";
		for(Voto v:this.voti) {
			if(v.getVotoCorso()== voto)
				s+=v;
			}
		return s;
	}
	/** r2.b --> lavoro con oggetti
	 * Genera un nuovo libretto, a partire da quello esistente che contiene esclusivamente
	 * i voti con votazione pari a quella passata come parametro
	 * 
	 * @param voto--> votazione specificata
	 * @return un nuovo libretto "ridotto"
	 */
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo=new Libretto();
		for(Voto v : this.voti) {
			if(v.getVotoCorso()== voto)
				nuovo.add(v);
		}
		return nuovo;
	}
	
	
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s+=v;
		}
		return s;
		//return voti.toString(); //stampati da solo shit 
	}
	

	
	
	
	
	
}
