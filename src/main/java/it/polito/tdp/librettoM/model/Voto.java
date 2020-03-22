package it.polito.tdp.librettoM.model;
import java.time.*;

/**
 * Classe Voto, contiene le informazione sul corso superato
 * @author lavic98
 *
 */
public class Voto {

	private String nomeCorso;
	private int votoCorso;
	private LocalDate data;
	
	/**
	 * Costruisce un nuovo Voto
	 * @param nomeCorso -- > nome del corso superato
	 * @param votoCorso -- > voto del corso superato
	 * @param data -- > data di superamento 
	 *
	 */
	
	public Voto(String nomeCorso, int votoCorso, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.votoCorso = votoCorso;
		this.data = data;
	}

	/**
	 * Copy constructor di {@link Voto}: crea un nuovo voto, copianod i paramentri del voto precedente
	 * @param v il voto da copiare
	 */
	public Voto(Voto v) {
		this.nomeCorso=v.nomeCorso;  
		this.votoCorso=v.votoCorso;
		this.data=v.data;
		
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getVotoCorso() {
		return votoCorso;
	}
	
	public LocalDate getData() {
		return data;
	}

	/**
	 * se vado su source mi delaga da solo la creazione di toString;
	 * 
	 */
	@Override
	public String toString() {
		return nomeCorso+" "+ votoCorso+ " "+data+ "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}

	public void setVotoCorso(int votoCorso) {
		this.votoCorso = votoCorso;
	}
	
	public Voto clone() {
		Voto v=new Voto(this.nomeCorso,this.votoCorso,this.data);
		return v; 
	}
	
	
	
	
}
