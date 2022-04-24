package com.ejercicioPi.ejercicioPI;

import java.util.Scanner;

/**
 * Clase principal donde se ejecuta el programa
 * 
 * @author Jose Antonio Nieto Buiza
 *
 */
public class Main {

	public static void main(String[] args) {
		Traza traza = new Traza(Main.class);
		try {
			traza.escribirInfo("Entrando en Main");
			Scanner s = new Scanner(System.in);
			int cantidad;

			traza.escribirInfo("Se pide un numero por teclado");
			System.out.print("Introduce un numero de aproximacion a PI: ");

			cantidad = Integer.parseInt(s.nextLine());
			traza.escribirInfo("Se calcula el numero PI con " + cantidad + " aproximaciones.");
			double pi = Pi.calculatePi(cantidad);

			System.out.println("El valor de PI es " + pi);

			traza.escribirInfo("Se llama a la clase UtilidadesFicheros");
			UtilidadesFicheros escribirPi = new UtilidadesFicheros();

			traza.escribirInfo("Se llama a escribir en fichero, que escribe el numero pi en un fichero");
			escribirPi.escribirEnFichero(String.valueOf(pi), "files/", "calculo.txt");
		} catch (NumberFormatException nfe) {
			traza.escribirError(nfe.getMessage());
			nfe.printStackTrace();
		}

		traza.escribirInfo("Saliendo de Main");
	}

}
