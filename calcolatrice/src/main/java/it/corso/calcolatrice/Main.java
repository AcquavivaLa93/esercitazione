package it.corso.calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		
			Calcolatrice calc = new Calcolatrice();
			double a = 10;
			double b = 2;
			
			System.out.println("Numeri selezionati: " + a + " e " + b);
			System.out.println("Somma: " + calc.somma(a, b));
			System.out.println("Sottrazione: " + calc.sottrazione(a, b));
			System.out.println("Potenza: " + calc.potenza(a, b));
			System.out.println("Media: " + calc.media(a, b));
			System.out.println("Divisione: " + calc.divisione(a, b));
		

	}

}
