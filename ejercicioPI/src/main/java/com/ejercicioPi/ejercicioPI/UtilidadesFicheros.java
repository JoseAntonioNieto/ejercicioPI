package com.ejercicioPi.ejercicioPI;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase que crea un fichero y escribe en el
 * 
 * @author Jose Antonio Nieto Buiza
 *
 */
public class UtilidadesFicheros {

	private Traza traza = new Traza(UtilidadesFicheros.class);

	/**
	 * Metodo que escribe en un fichero
	 * 
	 * @param texto,         Es el valor que queremos escribir
	 * @param ruta,          Es el lugar donde se ubicara nuestro fichero
	 * @param nombreFichero, Es el nombre del fichero
	 */
	public void escribirEnFichero(String texto, String ruta, String nombreFichero) {
		traza.escribirInfo("Crea el directorio si no existe");
		PrintWriter fichero = null;
		File directorio = null;
		directorio = new File(ruta);
		if (!directorio.exists()) {
			directorio.mkdirs();
		}

		try {
			traza.escribirInfo("Se escribe en el fichero");
			String direccion = ruta + nombreFichero;
			fichero = new PrintWriter(direccion);
			fichero.write(texto);
			fichero.close();
			traza.escribirInfo("Se ha escrito en el fichero el valor " + texto);
		} catch (IOException e) {
			traza.escribirError(e.toString());
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				fichero.close();
			}
		}
		traza.escribirInfo("Saliendo de escribirEnFichero");
	}
}
