package it.univaq.disim.lpo25.goldback;

import java.time.Duration;
import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleRunner {
	private static final Logger LOGGER = LogManager.getLogger(SimpleRunner.class);

	public static void main(String[] args) {

		int numeroDaVerificare = 100000;
		Instant inizio = Instant.now();
		boolean b = Operatore.goldbach(numeroDaVerificare);
		Duration timeElapsed = Duration.between(inizio, Instant.now());
		LOGGER.info("Input: " + numeroDaVerificare + " Result:" + b + " time: " + timeElapsed.toMillis());

	}
}
