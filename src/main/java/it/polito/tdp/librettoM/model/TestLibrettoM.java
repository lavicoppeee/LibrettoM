package it.polito.tdp.librettoM.model;

import java.time.LocalDate;

public class TestLibrettoM {

	Libretto lib;
	
	private void run() {
		lib=new Libretto(); //crealibretto vuoto
		
		Voto v1=new Voto("TDP",30, LocalDate.of(2020, 9, 03));
		Voto v2=new Voto("Analisi II",25, LocalDate.of(2020, 12, 03));
		Voto v3=new Voto("Fisica I",29, LocalDate.of(2020, 6, 14));
		lib.add(v1);
		lib.add(v2);
		
		//r1, r6
		System.out.println(this.lib);
		
		if(lib.add(v3)==false)
			System.out.println("Errore inserimento");
	
		
		//r2
		System.out.println(this.lib.stampaVotiUguali(25)); //qui stampo solo la striga
		
		System.out.println(this.lib.estraiVotiUguali(25));//qui creo un libretto nuovo e lo stampo
		
		//r3 
		String nomeC="Analisi II";
		Voto voto=lib.cercaNomeCorso(nomeC);
		
		System.out.println("il voto di"+nomeC+"è "+voto.getVotoCorso());
		
		//r4, r5 
		
		Voto economia2=new Voto("Economia", 24, LocalDate.now());
		Voto economia3=new Voto("Economia", 22, LocalDate.now());
		
		System.out.println("Economia con 24 è conflitto: "+lib.isConflitto(economia2)+" / duplicato: "+ 
		lib.isDuplicato(economia2));
		
		//r7 miglior libretto
		
		Libretto migl=lib.creaLibrettoMigliorato();
		System.out.println("Miglioramento del libretto");
		System.out.println(lib);
		System.out.println(migl);
		
		
		//r8 stampe con ordine 
		
		Libretto alfa=new Libretto(lib);
		alfa.ordinaPerNomeCorso();
		
		System.out.println("Ordinato per nome dei corsi: \n"+ alfa+"\n");
		
		Libretto decre=new Libretto(lib);
		decre.ordinaPerVotoCorso();
		
		System.out.println("Ordinato per voto dei corsi: \n"+ decre +"\n");
		
		//r9 elimina voti bassi
		
		lib.add(new Voto("Chimica", 19, LocalDate.now()));
		
		lib.ordinaPerNomeCorso();
		System.out.println("Nuovo libretto: \n"+lib);
		
		lib.cancellaVoti();
		System.out.println("Nuovo libretto senza voti <24: \n"+lib);
	
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLibrettoM test=new TestLibrettoM();
		test.run();
	}

}
