package com.ejercicioPi.ejercicioPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase que encapsula la clase Log4j para crear trazas
 * 
 * @author Jose Antonio Nieto Buiza
 *
 */
public class Traza {
	private static Logger LOGGER;

	public Traza(Class clase) {
		this.LOGGER = LoggerFactory.getLogger(clase);
	}

	/**
	 * Lanza un logger de tipo INFO
	 * 
	 * @param mensaje, Texto que se mostrara en el log
	 */
	public void escribirInfo(String mensaje) {
		this.LOGGER.info(mensaje);
	}

	/**
	 * Lanza un logger de tipo ERROR
	 * 
	 * @param mensaje, Texto que se mostrara en el log
	 */
	public void escribirError(String mensaje) {
		this.LOGGER.error("ERROR: " + mensaje);
	}
}
