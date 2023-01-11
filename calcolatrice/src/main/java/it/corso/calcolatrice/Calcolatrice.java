package it.corso.calcolatrice;


public class Calcolatrice {

	public Calcolatrice() {}
	
	public double somma(double a, double b) {
		return a + b;
	}
	
	public double sottrazione(double a, double b) {
		return a - b;
	}
	
	public double divisione(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Il secondo parametro non può essere pari a zero.");
		}
		return a / b;
	}
	
	public double potenza(double a, double b) {
		return Math.pow(a, b);
	}

	public double media(double a, double b) {
		return (a + b)/2;
	}
	
	
	
}
