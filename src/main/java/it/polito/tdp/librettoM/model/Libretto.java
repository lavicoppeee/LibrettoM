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
	 * e valuta i conflitti o dublicati
	 * @param v --> voto aggiunto in caso positivo(true) se no no(false);
	 * 
	 */
	public boolean add(Voto v) {
		//faccio qui i controlli
		if(this.isConflitto(v) || this.isDuplicato(v)) {
			return false; //Segnalo che non ha avuto successo 
		}else {
		this.voti.add(v);
		return true;
		}
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
/**
 * Dato il nome del corso, ricerca se esiste quel voto, 
 * in caso affermativo rida il voto, se non esiste null
 * @param nomeC nome esame da cercare
 * @return {@link Voto}il voto se esiste se no null
 */
	public Voto cercaNomeCorso(String nomeC) {
		// TODO Auto-generated method stub
		int pos=this.voti.indexOf(new Voto(nomeC, 0, null));
		if(pos!= -1) {
			return this.voti.get(pos);
		}else{
			return null;
		}
	}
	
	/**
	 * ritorna vero se il corso specificato da v 
	 * esiste nel libretto con la stessa valutazione 
	 * Se non esiste o è diversa ritorna false;
	 * @param v voto da cercare
	 * @return esistenza duplicato
	 */
	public boolean isDuplicato(Voto v) {
		Voto esiste= this.cercaNomeCorso(v.getNomeCorso());
		if(esiste ==null) {
			return false;
		}
		if(esiste.getVotoCorso()==v.getVotoCorso())
			return true;
		else 
			return false; 
	}
	/**
	 * Determina se esiste un voto dello stesso corso ma con valutazione diversa
	 * @param v voto da cercare
	 * @return esistenza del conflitto
	 * 
	 */
	public boolean isConflitto(Voto v) {
		Voto esiste=this.cercaNomeCorso(v.getNomeCorso());
		if(esiste==null)
			return false;
		return ( esiste.getVotoCorso() != v.getVotoCorso());
	}
}
