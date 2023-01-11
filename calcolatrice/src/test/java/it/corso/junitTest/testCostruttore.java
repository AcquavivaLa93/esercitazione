package it.corso.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.corso.calcolatrice.Calcolatrice;

public class testCostruttore {

	@Test
	void createTest() {
		Calcolatrice cal = new Calcolatrice();
		assertEquals(Calcolatrice.class,cal.getClass());
	}
}
