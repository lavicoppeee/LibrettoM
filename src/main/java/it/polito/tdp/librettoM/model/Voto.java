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
	
	


	
	
	
	
}
