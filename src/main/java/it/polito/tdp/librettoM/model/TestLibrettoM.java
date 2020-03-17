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
		lib.add(v3);
		
		//r1
		System.out.println(this.lib);
		
		//r2
		System.out.println(this.lib.stampaVotiUguali(25)); //qui stampo solo la striga
		
		System.out.println(this.lib.estraiVotiUguali(25)); //qui creo un libretto nuovo e lo stampo
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLibrettoM test=new TestLibrettoM();
		test.run();
	}

}
