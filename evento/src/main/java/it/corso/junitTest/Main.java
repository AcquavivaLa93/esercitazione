package it.corso.junitTest;

import java.util.Scanner;

import org.apache.log4j.Logger;



public class Main {

	final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.info("Applicazione avviata");
		
		Scanner scan = new Scanner(System.in);
		Calendario cal = new Calendario();
		
		
		//inserimento evento
		System.out.println("Numero eventi da inserire: ");
		
		try {
			int n = scan.nextInt();
			for (int i = 0; i<n; i++) {
				Evento e = new Evento();
				System.out.println("Inserisci un evento");
				System.out.println("Inserisci il nome");
				e.setNome(scan.next());
				System.out.println("Inserisci la descrizione");
				e.setDescrizione(scan.next());
				System.out.println("Inserisci il giorno");
				e.setGiorno(scan.nextInt());
				System.out.println("Inserisci il mese");
				e.setMese(scan.next());
				System.out.println("Inserisci l'anno");
				e.setAnno(scan.nextInt());
			
				cal.addEvento(e);
				
			}
		} catch (Exception e) {
			logger.error("Input invalido");
		}
		
		
		cal.visualizzaEventi();
		scan.close();
		
		logger.info("Operazione terminata con successo");
	}

}
