package co.uniquindio.prog2.biblioteca.aplicacion;

import javax.swing.JOptionPane;

import co.uniquindio.prog2.bibliotecap.model.Biblioteca;
import co.uniquindio.prog2.bibliotecap.model.Bibliotecario;
import co.uniquindio.prog2.bibliotecap.model.Estudiante;
import co.uniquindio.prog2.bibliotecap.model.Libro;
import co.uniquindio.prog2.bibliotecap.excepciones.Excepcion;
import co.uniquindio.prog2.bibliotecap.model.Prestamo;
import co.uniquindio.prog2.bibliotecap.model.IdentificacionDetalle;

/**
 * 
 * @author ediso
 *
 */
public class Aplicacion {

	public static void main(String[] args) {

		int Indicador = 0;
		String nombreBiblioteca = "";
		String direccionBiblioteca = "";
		Biblioteca biblioteca = null;
		Estudiante estudiante=null;

		// variable de manejo de datos de el/los bibliotecario/s
		String nombreBibliotecario,idBibliotecario, dirBibliotecario, telfBibliotecario;
		int yearsAntiguedad;

		// variables  de manejo de datos de el/los Estudiante/s
		String nombreEstudiante,idEstudiante, dirEstudiante,telfEstudiante;
		int tipoIdentificacion;

		// variables de manejo de datos de el/los libro/s
		String codigoLibro,isbnLibro,tituloLibro,autor,editorialLibro,estado,fechaPublicacion;
		int numeroPaginas,cantidadDisponible;
		double valorLibro;

		String mss = "";
		boolean resultado = false;

		imprimir("Bienvenidos a la aplicacion Biblioteca"+ "INFORMACION");

		nombreBiblioteca = leerString("Ingrese el nombre de la biblioteca");
		direccionBiblioteca = leerString("Ingrese la direccion de la biblioteca");
		biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca);

		do {
			Indicador = mostrarMenu();

			switch (Indicador) {
			
			case 1:
				// Creacion del bibliotecario
				nombreBibliotecario = leerString("Ingrese el nombre del bibliotecario");
				idBibliotecario = leerString("Ingrese la identificacion del bibliotecario");
				telfBibliotecario = leerString("Ingrese el telefono del bibliotecario");
				dirBibliotecario = leerString("Ingrese la direccion del bibliotecario");
				yearsAntiguedad = leerEntero("Ingrese la antiguedad del bibliotecario en la biblioteca " + nombreBiblioteca);

				tipoIdentificacion = leerEntero(
						"Ingrese la opcion del documento de identidad\n 1.Tarjeta de identidad\n 2.Cedula de ciudadania\n 3.Pasaporte");
				IdentificacionDetalle tipoDocumetacion = biblioteca.encontrarTipoIdenficacionCliente(tipoIdentificacion);

				mss = biblioteca.crearBibliotecario(nombreBibliotecario, idBibliotecario,
						dirBibliotecario, telfBibliotecario, yearsAntiguedad, tipoDocumetacion );
				imprimir(mss+"INFORMACION");
				 break;
			case 2:
			// Crear estudiante
			{
				nombreEstudiante = leerString("Ingrese el nombre del estudiante");
				idEstudiante = leerString("Ingrese la identificacion del estudiante");
				dirEstudiante = leerString("Ingrese la direccion del estudiante");
				telfEstudiante = leerString("Ingrese el telefono del estudiante");
				tipoIdentificacion = leerEntero(
						"Ingrese la opcion del documento de identidad\n 1.Tarjeta de identidad\n 2.Cedula de ciudadania\n 3.Pasaporte");
				IdentificacionDetalle tipo = biblioteca.encontrarTipoIdenficacionCliente(tipoIdentificacion);
				resultado =estudiante.validarDatosEstudiante(nombreEstudiante, idEstudiante, dirEstudiante, telfEstudiante);
				if(resultado==true) {
					mss = biblioteca.crearEstudiante(nombreEstudiante, idEstudiante,
							dirEstudiante, telfEstudiante, tipo);
					imprimir(mss );
			}else {
				imprimir("ingrese informacion del estudiante de forma valida");
			
			}
			}
				break;
			case 3:
			// Consultar estudiante
			{
				String identificacionABuscar = leerString(
						"Ingrese la identificacion del estudiante \nque desea consultar");
				Estudiante estudianteEncontrado = biblioteca.consultarEstudiante(identificacionABuscar);
				if (estudianteEncontrado != null) {
					mss = "El estudiante encontrado es:\n" + estudianteEncontrado.toString();
					imprimir(mss+ "INFORMACION");
				} else {
					mss = "El estudiante no existe";
					imprimir(mss+ "ERROR");
				}

			}
				break;
			case 4:
			// Eliminar estudiante
			{
				String identificacionAEliminar = leerString(
						"Ingrese la identificacion del estudiante \nque desea eliminar");
				String mensajeEliminacion = biblioteca.eliminarEstudiante(identificacionAEliminar);
				imprimir(mensajeEliminacion+ "INFORMACION");
			}
				break;
			case 5:
			// Actualizar estudiante
			{
				imprimir("Ingrese los datos del estudiante que desea actualizar"+ "INFORMACION");
				idEstudiante = leerString("Ingrese la identificacion del estudiante");
				nombreEstudiante = leerString("Ingrese el nombre del estudiante");
				dirEstudiante = leerString("Ingrese la direccion del estudiante");
				telfEstudiante = leerString("Ingrese el telefono del estudiante");
				tipoIdentificacion = leerEntero("Ingrese la opcion del documento de identidad\n 1.Tarjeta de identidad\n 2.Cedula de ciudadania\n 3.Pasaporte");
				IdentificacionDetalle tipoI = biblioteca.encontrarTipoIdenficacionCliente(tipoIdentificacion);

				String mensaje = biblioteca.actualizarEstudiante(idEstudiante,
						nombreEstudiante, dirEstudiante, telfEstudiante, tipoI);
				imprimir(mensaje+ "  INFORMACION");
			}
				break;
			case 6:
			// Crear libro
			{
				codigoLibro = leerString("Ingrese el codigo del libro");
				isbnLibro = leerString("Ingrese el ISBN del libro");
				tituloLibro = leerString("Ingrese el titulo del libro");
				autor = leerString("Ingrese el nombre del autor del libro");
				numeroPaginas = Integer.parseInt(leerString("Ingrese el numero de paginas del libro"));
				editorialLibro = leerString("Ingrese la editorial del libro");
				fechaPublicacion = leerString("Ingrese la fecha de publicacion del libro");
				cantidadDisponible = Integer.parseInt(leerString("Ingrese la cantidad disponible del libro"));
				valorLibro = leerDouble("Ingrese el costo del libro");
				if (cantidadDisponible > 0)
					estado = "DISPONIBLE";
				else
					estado = "AGOTADO";

				mss = biblioteca.crearLibro(isbnLibro, tituloLibro, autor, numeroPaginas, editorialLibro,
						estado, fechaPublicacion, codigoLibro, cantidadDisponible, valorLibro);
				imprimir(mss+ "INFORMACION");
			}
				break;
			case 7:
			// Consultar libro por codigo
			{
				String codigoLibroABuscar = leerString("Ingrese el codigo del libro \nque desea consultar");
				Libro libroEncontrado = biblioteca.consultarLibroCodigo(codigoLibroABuscar);
				if (libroEncontrado != null) {
					mss = "El libro encontrado es:\n" + libroEncontrado.toString();
					imprimir(mss+ "INFO");
				} else {
					mss = "El libro no existe";
					imprimir(mss+ "ERROR");
				}
			}
				break;
			case 8:
			// Reemplazar libro
			{
				int opcionLibro = 0;
				String menu = "Seleccione el libro que desea reemplazar\n1 Libro 1\n2 Libro 2\n";
				opcionLibro = leerEntero(menu);

				boolean bandera = biblioteca.verificarLibro(opcionLibro);

				if (bandera) {
					codigoLibro = leerString("Ingrese el codigo del libro");
					isbnLibro = leerString("Ingrese el ISBN del libro");
					tituloLibro = leerString("Ingrese el titulo del libro");
					autor = leerString("Ingrese el nombre del autor del libro");
					numeroPaginas = leerEntero("Ingrese el numero de paginas del libro");
					editorialLibro = leerString("Ingrese la editorial del libro");
					fechaPublicacion = leerString("Ingrese la fecha de publicacion del libro");
					cantidadDisponible = leerEntero("Ingrese la cantidad disponible del libro");

					if (cantidadDisponible > 0) {
						estado = "DISPONIBLE";}
					else {
						estado = "AGOTADO";}

					mss = biblioteca.reemplazarLibro(isbnLibro, tituloLibro, autor, numeroPaginas,
							editorialLibro, estado, fechaPublicacion, codigoLibro, cantidadDisponible,
							opcionLibro);
					imprimir(mss+ "INFORMACION");
				} else {
					mss = " libro ingresado no existe, intente nuevamnete ";
					imprimir(mss+ "ERROR");
				}
			}
				break;
			case 9:
			// Eliminar libro
			{
				String codigoLibroEliminar = leerString("Ingrese el codigo del libro \nque desea eliminar");
				mss = biblioteca.eliminarLibro(codigoLibroEliminar);
				imprimir(mss+ "INFORMACION");
			}
				break;
			case 10:
			// Crear prestamo
			{
				String codigo = leerString("Porfavor.Ingrese el codigo del prestamo");
				String codigoEstudiante = leerString("Por favor.Ingrese el codigo del estudiante");
				String fechaPrestamo = leerString("Ingrese la fecha del prestamo \n (Formato fecha: dd/mm/AAAA)");
				String fechaEntrega = leerString("Ingrese la fecha de la entrega \n (Formato fecha: dd/mm/AAAA)");
				int cantidad = leerEntero("Ingrese la cantidad de libros que necesita");
				String codigoBibliotecario = leerString("Ingrese el codigo del bibliotecario");
				;
				String codigoLibroInteres = leerString("Ingrese el codigo del libro");

				mss = biblioteca.crearPrestamo(fechaPrestamo, fechaEntrega, codigo, codigoEstudiante,
						codigoBibliotecario, codigoLibroInteres, cantidad);
				imprimir(mss+ "INFORMACION");
			}
				break;
			case 11:
			// Consultar prestamo por codigo
			{
				String codigoPrestamo = leerString("Ingrese el codigo del prestamo que desea consultar");
				Prestamo prestamo = biblioteca.consultarPrestamo(codigoPrestamo);
				if (prestamo != null) {
					mss = "El prestamo es:" + prestamo.toString();
					imprimir(mss+ "   INFO");
				} else {
					mss = "El prestamo no existe";
					imprimir(mss+"   ERROR");
				}
			}
				break;
			case 12:
			// Calcular total dinero recaudado
			{
				double dineroRecaudado = biblioteca.calcularDineroTotal();
				mss = "El dinero recaudado en total es " + dineroRecaudado + " pesos.";
				imprimir(mss+ "INFORMACION");
			}
			case 13: {
				// consultar bibliotecario, por prestamo usando isbn(Libro) y Fecha de entrega
				String isbnConsulta = leerString("Ingrese el isbn del libro");
				String fecha = leerString("Ingrese la fecha de entrega (Formato dd/mm/AAAA");
				
				Bibliotecario bibliotecario = biblioteca.consultarBibliotecarioCondicionesPrestamo(isbnConsulta , fecha);
				
				if (bibliotecario != null) {
					mss = bibliotecario.toString();
					imprimir(mss+ "INFORMACION");
				}else {
					String men="No existe un prestamo y bibliotecario con estos datos";
					Exception exception = new Exception (men);
				}
			}
			break;
			case 14: 
			{ // Consultar cual es el tipo de documento que ha realizado más préstamos en la biblioteca
				
				mss = biblioteca.identificarMayorTipoIdentificacion();
				imprimir(mss +  "info");
				
			}
				break;
			case 15: 
			{   // estudiante con mas prestamoss realizados
				estudiante = biblioteca.calcularEstudianteMayorPrestamos(); 
				mss = estudiante.toString();
				imprimir(mss+"IFORMACION");
			}
				break;
			default:
				System.exit(0);
			}
		} while (Indicador != 16);

	}

	
	public static void imprimir (String mensaje)
	{
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
	private static int mostrarMenu() {
		// CRUD create, Read, update,delete
		int opcion = 0;
		String menu = "Seleccione la opción que desea realizar :\n" + " Opcion Bibliotecario\n"
				+ "1 Crear un Biliotecario\n" +" Opciones Estudiante \n"+ "2 Crear un Estudiante \n"
				+"3 Consultar un Estudiante\n" + "4 Eliminar un Estudiante\n"
				+ "5 Actualizar un Estudiante\n\n" + " Opciones Libros\n" + "6 Crear un libro\n"
				+ "7 Consultar un libro por codigo\n" + "8 Reemplazar un libro por otro\n" + "9 Eliminar un libro\n\n"
				+ " Opciones Prestamos\n" + "10 Crear un prestamo\n" + "11 Consultar un prestamo por codigo\n" + " Informes \n"
				+ "12 Total dinero recaudado\n" +  "13 Consultar bibliotecario por prestamo por isbn y fecha\n"
				+ "14 Consultar tipo de  docuemnto con mas prestmaos \n"+"15 consultar estudiante con mas prestamos\n";

		String opcionString = JOptionPane.showInputDialog(menu);
		if (!opcionString.equals("")) {
			opcion = Integer.parseInt(opcionString);
		}

		return opcion;
	}

	/**
	 * Permite leer un tipo de dato double
	 * 
	 * @param mensaje El mensaje que verá el usuario
	 * @return el numero ingresado por el usuario
	 */
	public static double leerDouble(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Permite leer un tipo de dato entero
	 * 
	 * @param mensaje El mensaje que verá el usuario
	 * @return el numero ingresado por el usuario
	 */
	public static int leerEntero(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

/**permite leer un tipo de dato String 
 * 
 * @param mensaje
 * @return
 */
	
	public static String leerString (String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	

}
