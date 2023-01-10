package it.corso.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.corso.calcolatrice.Calcolatrice;

public class testCalcolatrice {

	@Test
	void createTest() {
		Calcolatrice calc = new Calcolatrice();
		double a = 10;
		double b = 5;
		
		assertEquals(calc.somma(a, b), a+b);
		//assertEquals(calc.sottrazione(a, b), a-b);
		//assertEquals(calc.divisione(a, b), a/b);
		//assertEquals(calc.potenza(a, b), Math.pow(a, b));
		//assertEquals(calc.media(a, b), (a+b)/2);
	}
}
