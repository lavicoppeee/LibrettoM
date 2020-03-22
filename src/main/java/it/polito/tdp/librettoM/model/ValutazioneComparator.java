package it.polito.tdp.librettoM.model;

import java.util.Comparator;

public class ValutazioneComparator implements Comparator<Voto> {

	@Override
	public int compare(Voto o1, Voto o2) {
		// TODO Auto-generated method stub
		return o2.getVotoCorso()-o1.getVotoCorso();
	}

}
