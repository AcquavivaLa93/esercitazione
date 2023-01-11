package it.corso.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.corso.calcolatrice.Calcolatrice;

public class testEccezione {
	
	@Test
	void createTest() {
		
		Calcolatrice cal = new Calcolatrice();
		
		double a = 10;
		double b = 0;
		
		IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class,
                        () -> cal.divisione(a,b));
		
		assertEquals("Il secondo parametro non può essere pari a zero.",
				illegalArgumentException.getMessage());
	}
}
