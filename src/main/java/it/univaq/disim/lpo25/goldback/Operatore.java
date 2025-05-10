package it.univaq.disim.lpo25.goldback;

import java.time.Duration;
import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * La prima classe implementata durante il corso di LPO 23-24
 * 
 * @author Juri Di Rocco
 */
public class Operatore {

	public static boolean isPrime(int a) {
		return false;
	}

	/**
	 * Il metodo, dato un numero intero n, verifica che la congettura di Goldbach è
	 * vera per tutti i numeri minori di n. Usare isPrime. Una congettura matematica
	 * ancora aperta è quella di Goldbach: ogni numero pari piú grande di 4 è la
	 * somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 +
	 * 3, .
	 * 
	 * @param n il numero fino al quale verificare la congettura
	 * @return true se la congettura è vera fino a quel numero
	 */
	public static boolean goldbach(int i) {

		// boolean ok = false;
		// int j = 2;
		// // RAGIONIAMO...
		// while (!ok && j <= (i / 2)) {
		// 	if (isPrime(j) && isPrime(i - j))
		// 		ok = true;
		// 	j++;
		// }
		// if (!ok) {
		// 	return false;
		// }
		return false;
	}

}
