/**
 * 
 */
package co.uniquindio.prog2.bibliotecaa.excepciones;

import java.io.IOException;

/**
 * Excepcion creada para controlar cuando un bibliotecario es nulo
 * @author JUAN PABLO
 *
 */
public class BibliotecarioNuloException extends IOException{

	/**
	 * Numero serializacion
	 */
	private static final long serialVersionUID = 1L;

	public BibliotecarioNuloException(String mensaje) {
		super(mensaje);
	}
	
}
