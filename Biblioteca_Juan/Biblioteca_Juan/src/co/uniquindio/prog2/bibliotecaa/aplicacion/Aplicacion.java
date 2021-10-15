package co.uniquindio.prog2.bibliotecaa.aplicacion;

import co.uniquindio.prog2.bibliotecaa.model.Libro;
import co.uniquindio.prog2.bibliotecaa.model.Prestamo;
import co.uniquindio.prog2.bibliotecaa.model.TipoDocumeno;
import co.uniquindio.prog2.bibliotecaa.excepciones.BibliotecarioNuloException;
import co.uniquindio.prog2.bibliotecaa.model.Biblioteca;
import co.uniquindio.prog2.bibliotecaa.model.Bibliotecaria;
import co.uniquindio.prog2.bibliotecaa.model.Estudiante;
import javax.swing.JOptionPane;


/**
 * Clase aplicacion
 * 
 * @author JUAN PABLO
 *
 */
public class Aplicacion {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Biblioteca biblioteca = null;
		String nombreB;
		String cedulaB;
		String telefonoB;
		String direccionB;
		TipoDocumeno tipoDocumenoB;
		int antiguedad;
		String nombreE;
		String cedulaE;
		String direccionE;
		String celularE;
		String libroC;
		String isbn;
		String titulo;
		String autor;
		int numeroPaginas;
		String editorial;
		String estado;
		String publicacion;
		int disponibilidad;
		String mensaje = "";
		int caso = 0;
		boolean resultado = false;
		TipoDocumeno indentificacion;
		String bibliotecaa;
		String direccion;
		imprimirMensajes("este es la aplicacion biblioteca", "info");

		bibliotecaa = leerStringVentana("Ingrese el nombre de la biblioteca");
		direccion = leerStringVentana("Ingrese la direccion de la biblioteca");
		biblioteca = new Biblioteca(bibliotecaa, direccion);

		do {
			caso = mostrarMenu();

			switch (caso) {
			case 1:
			// Crear bibliotecario
			{
				nombreB = leerStringVentana("Ingrese el nombre del bibliotecario");
				int opcion = Integer.parseInt(leerStringVentana(
						"Ingrese el numero del tipo de documento\n 1 Tarjeta identidad \n 2 Cedula ciudadania \n 3 Pasaporte"));
				tipoDocumenoB = biblioteca.devolverTipoDocumento(opcion);
				cedulaB = leerStringVentana("Ingrese la identificacion del bibliotecario");
				telefonoB = leerStringVentana("Ingrese el telefono del bibliotecario");
				direccionB = leerStringVentana("Ingrese la direccion del bibliotecario");
				antiguedad = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese la antiguedad del bibliotecario " + nombreB));

				mensaje = biblioteca.crearBibliotecario(nombreB, cedulaB, antiguedad, direccionB, telefonoB,
						tipoDocumenoB);
				imprimirMensajes(mensaje, "info");
			}
				break;
			case 2:
			// Crear estudiante
			{
				nombreE = leerStringVentana("Ingrese el nombre del estudiante");
				int opcion = Integer.parseInt(leerStringVentana(
						"Ingrese el numero del tipo de documento\n 1 Tarjeta identidad \n 2 Cedula ciudadania \n 3 Pasaporte"));
				indentificacion = biblioteca.devolverTipoDocumento(opcion);
				cedulaE = leerStringVentana("Ingrese la identificacion del estudiante");
				direccionE = leerStringVentana("Ingrese la direccion del estudiante");
				celularE = leerStringVentana("Ingrese el telefono del estudiante");
				resultado = validarInformacionEstudiante(nombreE, cedulaE, direccionE, celularE);

				if (resultado) {
					mensaje = biblioteca.crearEstudiante(nombreE, cedulaE, direccionE, celularE, indentificacion);
					imprimirMensajes(mensaje, "info");
				} else {
					imprimirMensajes("Por favor ingrese correctamente los datos del estudiante", "fallo");
				}
			}
				break;
			case 3:
			// Consulta el estudiante
			{
				String identificacionABuscar = leerStringVentana(
						"Ingrese la identificacion del estudiante \nque desea consultar");
				Estudiante estudianteEncontrado = biblioteca.consultarEstudiante(identificacionABuscar);
				if (estudianteEncontrado != null) {
					mensaje = "El estudiante encontrado es:\n" + estudianteEncontrado.toString();
					imprimirMensajes(mensaje, "datos actualizados");
				} else {
					mensaje = "El estudiante no existe";
					imprimirMensajes(mensaje, "info");
				}
			}
				break;
			case 4:
			// Elimina estudiante
			{
				String identificacionAEliminar = leerStringVentana(
						"Ingrese la identificacion del estudiante \nque desea eliminar");
				String mensajeEliminacion = biblioteca.eliminarEstudiante(identificacionAEliminar);
				imprimirMensajes(mensajeEliminacion, "info");
			}
				break;
			case 5:
			// Actualiza los estudiante
			{
				imprimirMensajes("Ingrese los datos del estudiante que desea actualizar", "info");
				cedulaE = leerStringVentana("Ingrese la identificacion del estudiante");
				nombreE = leerStringVentana("Ingrese el nombre del estudiante");
				direccionE = leerStringVentana("Ingrese la direccion del estudiante");
				celularE = leerStringVentana("Ingrese el telefono del estudiante");
				String mensajeActualizacion = biblioteca.actualizarEstudiante(nombreE, cedulaE, direccionE, celularE);
				imprimirMensajes(mensajeActualizacion, "info");
			}
				break;
			case 6:
			// Crear un libro
			{
				titulo = leerStringVentana("Digite el titulo del libro");
				autor = leerStringVentana("Digite el nombre del autor del libro");
				editorial = leerStringVentana("Digite  la editorial del libro");
				libroC = leerStringVentana("Digite  el codigo del libro");
				isbn = leerStringVentana("Digite  el ISBN del libro");
				numeroPaginas = Integer.parseInt(leerStringVentana("Digite  cuantas paginas tien el libro"));
				publicacion = leerStringVentana("Digite  la fecha de publicacion del libro");
				disponibilidad = Integer.parseInt(leerStringVentana("Digite  la cantidad disponible del libro"));
				double precioP = Double.parseDouble(leerStringVentana("Digite el precio del libro"));

				if (disponibilidad > 0)
					estado = "disponible";
				else
					estado = "agotado";

				mensaje = biblioteca.crearLibro(titulo, autor, editorial, estado, libroC, isbn, numeroPaginas,
						publicacion, disponibilidad, precioP);
				imprimirMensajes(mensaje, "info");
			}
				break;
			case 7:
			// Consulta el libro por su codigo
			{
				String codigoBuscarLibro = leerStringVentana("Ingrese el codigo del libro ");
				Libro libro = biblioteca.consultarLibroDatos(codigoBuscarLibro);
				if (libro != null) {
					mensaje = libro.toString();
					imprimirMensajes(mensaje, "info");
				} else {
					mensaje = "El libro no existe";
					imprimirMensajes(mensaje, "fallo");
				}
			}
				break;
			case 8:
			// Eliminar libro
			{
				String codigoEliminado = leerStringVentana("digite el codigo del libro que va a eliminar ");
				mensaje = biblioteca.eliminarLibro(codigoEliminado);
				imprimirMensajes(mensaje, "info");
			}
				break;
			case 9:
			// Crear prestamo
			{
				String codigoPrestamo = leerStringVentana("Digite el codigo del prestamo");
				String cedulaEs = leerStringVentana("Digite la cedula del estudiante");
				String fechaP = leerStringVentana("Fecha en la que se hizo el prestamo\n(Formato fecha: dd/mm/AAAA)");
				String fechaD = leerStringVentana("Fecha en la que se hace la entrega\n(Formato fecha: dd/mm/AAAA)");
				int cantidad = Integer.parseInt(leerStringVentana("Ingrese la cantidad de libros"));
				String cedulaBibliotecario = leerStringVentana("Digite el codigo del bibliotecario");
				;
				String codigoLibroP = leerStringVentana("Digite el codigo del libro");
				double valorPrestamoPorDia = Double
						.parseDouble(leerStringVentana("Ingrese el valor del prestamo por dia"));

				mensaje = biblioteca.crearPrestamo(fechaP, codigoPrestamo, cantidad, fechaD, cedulaEs,
						cedulaBibliotecario, codigoLibroP, valorPrestamoPorDia);
				imprimirMensajes(mensaje, "info");
			}
				break;
			case 10:
			// Consultar prestamo por codigo
			{
				String codigoPrestamo = leerStringVentana("Ingrese el codigo del prestamo \nque desea consultar");
				Prestamo prestamo = biblioteca.consultarPrestamo(codigoPrestamo);
				if (prestamo != null) {
					mensaje = prestamo.toString();
					imprimirMensajes(mensaje, "info");
				} else {
					mensaje = "El prestamo no existe";
					imprimirMensajes(mensaje, "fallo");
				}
			}
				break;
			case 11:
			// Consulta informacion bibliotecario por prestamo con isbn y fecha
			{
				String isbnConsulta = leerStringVentana("Ingrese el isbn del libro para consultar");
				String fechaDevolucionConsulta = leerStringVentana("Ingrese la fecha devolucion del prestamo");
				Bibliotecaria bibliotecariaEncontrado;
				try {
					bibliotecariaEncontrado = biblioteca.consultarBibliotecarioPrestamoLibro(isbnConsulta, fechaDevolucionConsulta);
					mensaje = "El bibliotecario que realizo el prestamo\n" + bibliotecariaEncontrado.toString();
					imprimirMensajes(mensaje, "info");
				} catch (BibliotecarioNuloException e) {
					mensaje = e.getMessage() + "\n" + e.getCause();
					imprimirMensajes(mensaje, "fallo");
				}
				
			}
				break;
			case 12:
			// Verifica tipo de documento es el que mas se repite
			{
				mensaje = biblioteca.MayorDocumento();
				imprimirMensajes(mensaje, "info");
			}
				break;
			default:
				System.exit(0);
			}
		} while (caso != 13);

	}

	/**
	 * Valida informacion de estudiante
	 * 
	 * @param nombreE
	 * @param cedulaE
	 * @param direccionEstudiante
	 * @param celularE
	 * @return
	 */
	private static boolean validarInformacionEstudiante(String nombreE, String cedulaE, String direccionEstudiante,
			String celularE) {

		boolean valido = true;
		if (nombreE.equalsIgnoreCase("") || cedulaE.equalsIgnoreCase("") || direccionEstudiante.equalsIgnoreCase("")
				|| celularE.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumeric(celularE)) {
			valido = false;
		}
		return valido;
	}

	/**
	 * Metodo compactado para mostrar mensajes
	 * 
	 * @param mensaje
	 * @param tipo
	 */
	private static void imprimirMensajes(String mensaje, String tipo) {

		switch (tipo.toUpperCase()) {
		case "fallo": {
			JOptionPane.showMessageDialog(null, mensaje, "Algo fallo", JOptionPane.ERROR_MESSAGE);
		}

			break;
		case "info": {
			JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
		}
			break;
		default:
			JOptionPane.showMessageDialog(null, mensaje);
			break;
		}
	}

	/**
	 * Crea el menu principal
	 * 
	 * @return
	 */
	private static int mostrarMenu() {

		int opcion = 0;
		String menu = "Seleccione la opcion que desea realizar :\n\n" + " Opciones Bibliotecarios\n "
				+ "1 Crear bibliotecario\n\n" + " Opciones Estudiantes\n" + "2 Crear un Estudiante\n"
				+ "3 Consultar un Estudiante\n" + "4 Eliminar un Estudiante\n" + "5 Actualizar un Estudiante\n\n"
				+ " Opciones Libros\n" + "6 Crear un libro\n" + "7 Consultar un libro\n" + "8 Eliminar un libro\n\n"
				+ " Opciones Prestamos\n" + "9 Crear un prestamo\n" + "10 Consultar un prestamo\n\n"
				+ " Reportes parcial\n" + "11 Informacion bibliotecario por prestamo (ingreso ISBN y fecha)\n"
				+ "12 Consulta de tipo documento que ha realizado mas prestamos";

		String opcionString = JOptionPane.showInputDialog(menu);
		if (!opcionString.equals("")) {
			opcion = Integer.parseInt(opcionString);
		}

		return opcion;
	}

	/**
	 * Lectura de una cadena de texto
	 * 
	 * @param mensaje
	 * @return
	 */
	public static String leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta = JOptionPane.showInputDialog(mensaje);
		return respuesta;
	}

	/**
	 * Verifica una cadena de texto numerica
	 * @param cadena
	 * @return
	 */
	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	/**
	 *  Lectura de un double por cadena de texto
	 * @param mensaje
	 * @return
	 */
	public static double leerDouble(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

}
