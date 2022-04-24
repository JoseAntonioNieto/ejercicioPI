package com.ejercicioPi.ejercicioPI;

/**
 * Calcula el numero PI a partir de un numro de aproximacion
 * 
 * @author Jose Antonio Nieto Buiza
 *
 */
public class Pi {

	/**
	 * Metodo que calcula el numero PI
	 * 
	 * @param n, Este es el numero de aproximacion a numero PI
	 * @return
	 */
	static double calculatePi(double n) {
		Traza traza = new Traza(Pi.class);
		traza.escribirInfo("Entrando a calcular PI");
		double pi = 0;
		for (int i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
			traza.escribirInfo("Para la iteracion " + i + " el valor es " + 4 * pi);
		}
		traza.escribirInfo("Saliendo de calcular PI");
		return 4 * pi;

	}
}
