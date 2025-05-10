package it.univaq.disim.lpo25.goldbach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import it.univaq.disim.lpo25.goldback.Operatore;


public class RunnerTest {

	@Test
	public void testPrime() {
		assertEquals(true, Operatore.isPrime(5));
	}
	@Test
	public void testGooldback() {
		assertTrue(Operatore.goldbach(16));
	}
	
	
}
