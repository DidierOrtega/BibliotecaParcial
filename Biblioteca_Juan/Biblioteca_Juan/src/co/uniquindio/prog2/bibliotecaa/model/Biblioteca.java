package co.uniquindio.prog2.bibliotecaa.model;

import java.time.LocalDate;

import co.uniquindio.prog2.bibliotecaa.excepciones.BibliotecarioNuloException;

/**
 * Clase biblioteca, contiene los objetos y algunos metodos
 * 
 * @author JUAN PABLO
 *
 */
public class Biblioteca {

	// **************************
	// ATRIBUTOS
	// **************************
	private String nombre;
	private String direccion;

	private Estudiante estudiante1;
	private Estudiante estudiante2;
	private Estudiante estudiante3;
	private Libro libro1;
	private Libro libro2;
	private Libro libro3;
	private Prestamo prestamo1;
	private Prestamo prestamo2;
	private Prestamo prestamo3;
	private Bibliotecaria bibliotecaria;
	private Bibliotecaria bibliotecaria2;

	/**
	 * Metodo constructor
	 * 
	 * @param nombre
	 * @param direccion
	 */
	public Biblioteca(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", estudiante1=" + estudiante1.toString()
				+ ", estudiante2=" + estudiante2.toString() + ", estudiante3=" + estudiante3.toString() + ", libro1="
				+ libro1.toString() + ", libro2=" + libro2.toString() + ", libro3=" + libro3.toString() + ", prestamo1="
				+ prestamo1 + ", prestamo2=" + prestamo2 + ", prestamo3=" + prestamo3 + ", bibliotecaria="
				+ bibliotecaria.toString() + "]";
	}

	// Metodos estudiante

	/**
	 * Crear estudiante
	 * 
	 * @param nombre
	 * @param cedula
	 * @param direccion
	 * @param telefono
	 * @param indentificacion
	 * @return mensaje notificacion
	 */
	public String crearEstudiante(String nombre, String cedula, String direccion, String telefono,
			TipoDocumeno indentificacion) {

		String mensaje = "No es posible crear mas estudiantes";
		if (estudiante1 == null) {
			estudiante1 = new Estudiante(nombre, cedula, direccion, telefono, indentificacion);
			mensaje = "estudiante creado con exito";
		} else if (estudiante2 == null) {
			estudiante2 = new Estudiante(nombre, cedula, direccion, telefono, indentificacion);
			mensaje = "estudiante creado con exito";
		} else {
			if (estudiante3 == null) {
				estudiante3 = new Estudiante(nombre, cedula, direccion, telefono, indentificacion);
				mensaje = "estudiante creado con exito";
			}
		}
		return mensaje;
	}

	/**
	 * Consultar estudiante
	 * 
	 * @param cedula
	 * @return estudiante encontrado
	 */
	public Estudiante consultarEstudiante(String cedula) {
		Estudiante estudianteEncontrado = null;
		if (estudiante1 != null) {
			if (estudiante1.getCedula().equals(cedula)) {
				estudianteEncontrado = estudiante1;
			}
		}
		if (estudianteEncontrado == null && estudiante2 != null) {
			if (estudiante2.getCedula().equals(cedula)) {
				estudianteEncontrado = estudiante2;
			}
		}

		if (estudianteEncontrado == null && estudiante3 != null) {
			if (estudiante3.getCedula().equals(cedula)) {
				estudianteEncontrado = estudiante3;
			}
		}
		return estudianteEncontrado;
	}

	/**
	 * Eliminar estudiante
	 * 
	 * @param identificacionEstudiante
	 * @return mensaje notificacion
	 */
	public String eliminarEstudiante(String identificacionEstudiante) {
		String mensaje = "Estudiante no eliminardo";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if (estudianteEncontrado != null) {
			if (estudiante1.equals(estudianteEncontrado)) {
				estudiante1 = null;
				mensaje = "Estudiante eliminado";
			} else {
				if (estudiante2.equals(estudianteEncontrado)) {
					estudiante2 = null;
					mensaje = "Estudiante eliminado";
				} else {
					if (estudiante3.equals(estudianteEncontrado)) {
						estudiante3 = null;
						mensaje = "Estudiante eliminado";
					}

				}
			}
		}

		return mensaje;
	}

	/**
	 * Actualizar estudiante
	 * 
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @return mensaje notificacion
	 */
	public String actualizarEstudiante(String nombreEstudiante, String identificacionEstudiante,
			String direccionEstudiante, String telefono) {
		String mensaje = "Estudiante no actualizado";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if (estudianteEncontrado != null) {
			estudianteEncontrado.setNombre(nombreEstudiante);
			estudianteEncontrado.setDireccion(direccionEstudiante);
			estudianteEncontrado.setTelefono(telefono);
			mensaje = "Estudiante actualizado";
		}
		return mensaje;
	}

	// Metodos libro

	/**
	 * Creacion libro
	 * 
	 * @param titulo
	 * @param autor
	 * @param editorial
	 * @param estado
	 * @param codigo
	 * @param isbn
	 * @param numerosPaginas
	 * @param publicacion
	 * @param disponibilidad
	 * @param precioP
	 * @return mensaje notificacion
	 */
	public String crearLibro(String titulo, String autor, String editorial, String estado, String codigo, String isbn,
			int numerosPaginas, String publicacion, int disponibilidad, double precioP) {
		String mensaje = "No es posible crear mas libros";
		if (libro1 == null) {
			libro1 = new Libro(titulo, autor, editorial, estado, codigo, isbn, numerosPaginas, publicacion,
					disponibilidad, precioP);
			mensaje = "libro creado con exito";
		} else if (libro2 == null) {
			libro2 = new Libro(titulo, autor, editorial, estado, codigo, isbn, numerosPaginas, publicacion,
					disponibilidad, precioP);
			mensaje = "estudiante creado con exito";
		} else {
			if (libro3 == null) {
				libro3 = new Libro(titulo, autor, editorial, estado, codigo, isbn, numerosPaginas, publicacion,
						disponibilidad, precioP);
				mensaje = "estudiante creado con exito";
			}
		}
		return mensaje;
	}

	/**
	 * Eliminar libro
	 * 
	 * @param codigo
	 * @return mensaje notificacion
	 */
	public String eliminarLibro(String codigo) {
		String mensaje = "libro no eliminado";
		Libro libroEncontrado = null;
		libroEncontrado = consultarLibroDatos(codigo);
		if (libroEncontrado != null) {
			if (libro1.equals(libroEncontrado)) {
				libro1 = null;
				mensaje = "libro eliminado";
			} else {
				if (libro2.equals(libroEncontrado)) {
					libro2 = null;
					mensaje = "libro eliminado";
				} else {
					if (libro3.equals(libroEncontrado)) {
						libro3 = null;
						mensaje = "libro eliminado";
					}
				}
			}
		}

		return mensaje;
	}

	/**
	 * Consulta los datos del libro por el codigo
	 * 
	 * @param codigo
	 * @return libro encontrado
	 */
	public Libro consultarLibroDatos(String codigo) {
		Libro datos = null;
		if (libro1 != null) {
			if (libro1.getCodigo().equals(codigo)) {
				datos = libro1;
			}
		}
		if (datos == null && libro2 != null) {
			if (libro2.getCodigo().equals(codigo)) {
				datos = libro2;
			}
		}

		if (datos == null && libro3 != null) {
			if (libro3.getCodigo().equals(codigo)) {
				datos = libro3;
			}
		}
		return datos;
	}

	/**
	 * Consulta los datos del libro por el isbn
	 * 
	 * @param isbn
	 * @return libro encontrado
	 */
	public Libro consultarLibroPorISBN(String isbn) {
		Libro datos = null;
		if (libro1 != null) {
			if (libro1.getIsbn().equals(isbn)) {
				datos = libro1;
			}
		}
		if (datos == null && libro2 != null) {
			if (libro2.getIsbn().equals(isbn)) {
				datos = libro2;
			}
		}

		if (datos == null && libro3 != null) {
			if (libro3.getIsbn().equals(isbn)) {
				datos = libro3;
			}
		}
		return datos;
	}

	/**
	 * Reeemplaza los libros
	 * 
	 * @param titulo
	 * @param autor
	 * @param editorial
	 * @param estado
	 * @param codigo
	 * @param isbn
	 * @param numerosPaginas
	 * @param publicacion
	 * @param disponibilidad
	 * @param caso
	 * @return mensaje notificacion
	 */
	public String actualizarLibro(String titulo, String autor, String editorial, String estado, String codigo,
			String isbn, int numerosPaginas, String publicacion, int disponibilidad, int caso) {

		String mensaje = "El libro no existe";
		switch (caso) {
		case 1: {

			mensaje = "El libro 1 fue reemplazado";
			libro1.setAutor(autor);
			libro1.setEditorial(editorial);
			libro1.setDisponibilidad(disponibilidad);
			libro1.setCodigo(codigo);
			libro1.setPublicacion(publicacion);
			libro1.setIsbn(isbn);
			libro1.setTitulo(titulo);
			libro1.setEstado(estado);
			libro1.setNumerosPaginas(numerosPaginas);

		}
		case 2: {
			mensaje = "El libro 2 fue reemplazado";
			libro2.setAutor(autor);
			libro2.setEditorial(editorial);
			libro2.setDisponibilidad(disponibilidad);
			libro2.setCodigo(codigo);
			libro2.setPublicacion(publicacion);
			libro2.setIsbn(isbn);
			libro2.setTitulo(titulo);
			libro2.setEstado(estado);
			libro2.setNumerosPaginas(numerosPaginas);

		}
		case 3: {
			mensaje = "El libro 3 fue reemplazado";
			libro3.setAutor(autor);
			libro3.setEditorial(editorial);
			libro3.setDisponibilidad(disponibilidad);
			libro3.setCodigo(codigo);
			libro3.setPublicacion(publicacion);
			libro3.setIsbn(isbn);
			libro3.setTitulo(titulo);
			libro3.setEstado(estado);
			libro3.setNumerosPaginas(numerosPaginas);
		}
		default:
		}
		return mensaje;
	}

	/**
	 * Verifica el estado del libro
	 * 
	 * @param libro
	 * @return
	 */
	public boolean verificaDisponibilidad(Libro libro) {
		boolean bandera = false;
		if (libro.getDisponibilidad() > 0) {
			bandera = true;
		}
		return bandera;
	}

	/**
	 * Asigna un libro y cambia el estado de ser necesario
	 * 
	 * @param codigo
	 * @param cantidad
	 * @return
	 */
	public Libro asignarLibro(String codigo, int cantidad) {
		Libro libroP = null;
		int contadorLibros = 0;

		if (libro1.getCodigo().equals(codigo)) {
			if (libro1.getDisponibilidad() > 0 && libro1.getDisponibilidad() >= cantidad) {
				contadorLibros = libro1.getDisponibilidad();
				contadorLibros = contadorLibros - cantidad;
				libro1.setDisponibilidad(contadorLibros);
				if (!verificaDisponibilidad(libro1)) {
					libro1.setEstado("agotado");
				}
				libroP = libro1;
			}
		} else {
			if (libro2.getCodigo().equals(codigo)) {
				if (libro2.getDisponibilidad() > 0 && libro2.getDisponibilidad() >= cantidad) {
					contadorLibros = libro2.getDisponibilidad();
					contadorLibros = contadorLibros - cantidad;
					libro2.setDisponibilidad(contadorLibros);
					if (!verificaDisponibilidad(libro2)) {
						libro2.setEstado("agotado");
					}
					libroP = libro2;
				}
			} else {
				if (libro3.getCodigo().equals(codigo)) {
					if (libro3.getDisponibilidad() > 0 && libro3.getDisponibilidad() >= cantidad) {
						contadorLibros = libro3.getDisponibilidad();
						contadorLibros = contadorLibros - cantidad;
						libro3.setDisponibilidad(contadorLibros);
						if (!verificaDisponibilidad(libro3)) {
							libro3.setEstado("agotado");
						}
						libroP = libro3;
					}
				}
			}
		}
		return libroP;
	}

	// Metodos prestamo

	/**
	 * Calcula cuantos dias va estar el libro prestado: el ChronoUnit es un enum, un
	 * conjunto estandar para las unidades de las fechas
	 * 
	 * @param fechaD
	 * @param fechaP
	 * @return
	 */
	public long calcularDiasPrestamo(String fechaD, String fechaP) {

		// Posiciones [0]: dia, [1]: mes, [2]: anio
		String[] fechaEntregaSplit = fechaD.split("/");
		String[] fechaPrestamoSplit = fechaP.split("/");

		int fechaEnAnio = Integer.parseInt(fechaEntregaSplit[2]);
		int fechaEnDia = Integer.parseInt(fechaEntregaSplit[0]);
		int fechaEnMes = Integer.parseInt(fechaEntregaSplit[1]);

		int fechaPAnio = Integer.parseInt(fechaPrestamoSplit[2]);
		int fechaPDia = Integer.parseInt(fechaPrestamoSplit[0]);
		int fechaPMes = Integer.parseInt(fechaPrestamoSplit[1]);

		LocalDate fin = LocalDate.of(fechaEnAnio, fechaEnMes, fechaEnDia);
		LocalDate inicio = LocalDate.of(fechaPAnio, fechaPMes, fechaPDia);

		long dias = java.time.temporal.ChronoUnit.DAYS.between(inicio, fin);

		return dias;
	}

	/**
	 * Calcula cuanto es el costo del prestamo
	 * 
	 * @param fechaD
	 * @param fechaP
	 * @param cantidad
	 * @param valorPorDia
	 * @return
	 */
	public double calcularCosto(String fechaD, String fechaP, int cantidad, double valorPorDia) {
		double valorCosto;
		long dias = calcularDiasPrestamo(fechaD, fechaP);
		int diaas = (int) dias;
		valorCosto = cantidad * (diaas * valorPorDia);
		return valorCosto;
	}

	/**
	 * Crear un prestamo
	 * 
	 * @param fechaP
	 * @param codigo
	 * @param cantidad
	 * @param fechaD
	 * @param cedulaEstudiante
	 * @param codigoBibliotecaria
	 * @param libroC
	 * @param valorPrestamoE
	 * @return mensaje notificacion
	 */
	public String crearPrestamo(String fechaP, String codigo, int cantidad, String fechaD, String cedulaEstudiante,
			String codigoBibliotecaria, String libroC, double valorPrestamoPorDia) {

		String mensaje = "No se pueden crear prestamos";
		Estudiante prestamoE = null;
		Libro libroP = null;

		prestamoE = consultarEstudiante(cedulaEstudiante);
		libroP = consultarLibroDatos(libroC);
		double valorC = calcularCosto(fechaD, fechaP, cantidad, valorPrestamoPorDia);

		if (prestamoE != null && libroP != null) {
			libroP = asignarLibro(libroC, cantidad);
			DetallePrestamo detallePrestamo = new DetallePrestamo(cantidad, libroP, valorC);
			valorC += libroP.getPrecio();

			if (prestamo1 == null) {
				prestamo1 = new Prestamo(fechaP, codigo, fechaD, cedulaEstudiante, codigoBibliotecaria, valorC,
						detallePrestamo);
				mensaje = "Prestamo creado\nEstudiante: " + prestamoE.getNombre() + "\nLibro: " + libroP.getTitulo()
						+ "\nValor prestamo: " + valorC;
			} else if (prestamo2 == null) {
				prestamo2 = new Prestamo(fechaP, codigo, fechaD, cedulaEstudiante, codigoBibliotecaria, valorC,
						detallePrestamo);
				mensaje = "Prestamo creado\nEstudiante: " + prestamoE.getNombre() + "\nLibro: " + libroP.getTitulo()
						+ "\nValor prestamo: " + valorC;
			} else if (prestamo3 == null) {
				prestamo3 = new Prestamo(fechaP, codigo, fechaD, cedulaEstudiante, codigoBibliotecaria, valorC,
						detallePrestamo);
				mensaje = "Prestamo creado\nEstudiante: " + prestamoE.getNombre() + "\nLibro: " + libroP.getTitulo()
						+ "\nValor prestamo: " + valorC;
			} else {
				mensaje = "No se pueden crear mas prestamo";
			}
		} else {
			mensaje = "No se pueden crear mas prestamos sin el libro registrago o sin el estudiante";
		}

		return mensaje;
	}

	/**
	 * Consulta un prestamo por codigo
	 * 
	 * @param codigo
	 * @return
	 */
	public Prestamo consultarPrestamo(String codigo) {
		Prestamo prestamoEncontrado = null;
		if (prestamo1.getCodigo().equals(codigo)) {

			prestamoEncontrado = prestamo1;
		}

		if (prestamo1.getCodigo().equals(codigo)) {
			prestamoEncontrado = prestamo2;
		}
		if (prestamo3.getCodigo().equals(codigo)) {
			prestamoEncontrado = prestamo3;
		}
		return prestamoEncontrado;
	}

	// Metodos bibliotecario

	/**
	 * Crear bibliotecario
	 * 
	 * @param nombre
	 * @param codigo
	 * @param anosA
	 * @param direccion
	 * @param telefono
	 * @param tipo
	 * @return
	 */
	public String crearBibliotecario(String nombre, String codigo, int anosA, String direccion, String telefono,
			TipoDocumeno tipo) {
		String mensaje = "No es posible crear mas bibliotecarios";
		if (bibliotecaria == null) {
			bibliotecaria = new Bibliotecaria(nombre, telefono, direccion, codigo, anosA, tipo);
			mensaje = "Bibliotecario creado con exito";
		}

		if (bibliotecaria2 == null) {
			bibliotecaria2 = new Bibliotecaria(nombre, telefono, direccion, codigo, anosA, tipo);
			mensaje = "Bibliotecario creado con exito";
		}

		return mensaje;
	}

	/**
	 * Consultar bibliotecario
	 * 
	 * @param cedula
	 * @return estudiante encontrado
	 */
	public Bibliotecaria consultarBibliotecario(String cedula) {
		Bibliotecaria bibliotecarioEncontrado = null;
		if (bibliotecaria != null) {
			if (bibliotecaria.getCodigo().equals(cedula)) {
				bibliotecarioEncontrado = bibliotecaria;
			}
		} else if (bibliotecaria2 != null) {
			if (bibliotecaria2.getCodigo().equals(cedula)) {
				bibliotecarioEncontrado = bibliotecaria2;
			}
		}

		return bibliotecarioEncontrado;
	}

	// Metodos reportes

	/**
	 * Consulta el bibliotecario de un prestamo a partir del isbn del libro y la
	 * fecha de devolucion
	 * 
	 * @param isbn
	 * @param fechaDevolucion
	 * @return {@link Bibliotecaria}
	 * @throws BibliotecarioNuloException
	 */
	public Bibliotecaria consultarBibliotecarioPrestamoLibro(String isbn, String fechaDevolucion)
			throws BibliotecarioNuloException {

		Bibliotecaria bibliotecariaEncontrado = null;
		DetallePrestamo detallePrestamo = null;

		if (prestamo1 != null) {
			detallePrestamo = prestamo1.getDetallesPrestamo();
			if (detallePrestamo.getLibro().getIsbn().equals(isbn)
					&& prestamo1.getFechaDevolucion().equals(fechaDevolucion)) {
				bibliotecariaEncontrado = consultarBibliotecario(prestamo1.getCodigoBibliotecaria());
			}
		} else if (prestamo2 != null) {
			detallePrestamo = prestamo2.getDetallesPrestamo();
			if (detallePrestamo.getLibro().getIsbn().equals(isbn)
					&& prestamo2.getFechaDevolucion().equals(fechaDevolucion)) {
				bibliotecariaEncontrado = consultarBibliotecario(prestamo2.getCodigoBibliotecaria());
			}
		} else if (prestamo3 != null) {
			detallePrestamo = prestamo3.getDetallesPrestamo();
			if (detallePrestamo.getLibro().getIsbn().equals(isbn)
					&& prestamo3.getFechaDevolucion().equals(fechaDevolucion)) {
				bibliotecariaEncontrado = consultarBibliotecario(prestamo3.getCodigoBibliotecaria());
			}
		}

		if (bibliotecariaEncontrado == null) {
			throw new BibliotecarioNuloException("No se encuentra un bibliotecario");
		}
		return bibliotecariaEncontrado;
	}

	/**
	 * Retorna el tipo de documento correspondiente
	 * 
	 * @param opcion
	 * @return tipo documento
	 */
	public TipoDocumeno devolverTipoDocumento(int opcion) {
		switch (opcion) {
		case 1:
			return TipoDocumeno.TARJETA_IDENTIDAD;
		case 2:
			return TipoDocumeno.CEDULA_CIUDADANIA;
		case 3:
			return TipoDocumeno.PASAPORTE;
		default:
			return TipoDocumeno.TARJETA_IDENTIDAD;
		}
	}

	/**
	 * Calcula cuanto dinero recaudo la biblioteca en total
	 * 
	 * @return total dinero
	 */
	public double calcularDineroTotal() {
		double dineroRecaudado = 0;

		if (prestamo1 != null) {
			dineroRecaudado += prestamo1.getValorPrestamoE();
		}
		if (prestamo2 != null) {
			dineroRecaudado += prestamo2.getValorPrestamoE();
		}

		if (prestamo3 != null) {
			dineroRecaudado += prestamo3.getValorPrestamoE();
		}
		return dineroRecaudado;
	}

	/**
	 * Consulta la cantidad de cedulas a partir de los prestamos hechos
	 * 
	 * @return cantidad cedulas
	 */
	public int cantidadCedulasIngresados() {
		int cantidadCedulas = 0;
		Estudiante estudiante = null;
		if (prestamo1 != null) {
			estudiante = consultarEstudiante(prestamo1.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.CEDULA_CIUDADANIA)) {
				cantidadCedulas++;
			}
		}
		if (prestamo2 != null) {
			estudiante = consultarEstudiante(prestamo2.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.CEDULA_CIUDADANIA)) {
				cantidadCedulas++;
			}
		}
		if (prestamo3 != null) {
			estudiante = consultarEstudiante(prestamo3.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.CEDULA_CIUDADANIA)) {
				cantidadCedulas++;
			}
		}

		return cantidadCedulas;
	}

	/**
	 * Consulta la cantidad de pasaportes a partir de los prestamos hechos
	 * 
	 * @return cantidad pasaportes
	 */
	public int cantidadPasaportesIngresados() {

		int cantidadPasaportes = 0;

		Estudiante estudiante = null;
		if (prestamo1 != null) {
			estudiante = consultarEstudiante(prestamo1.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.PASAPORTE)) {
				cantidadPasaportes++;
			}
		}
		if (prestamo2 != null) {
			estudiante = consultarEstudiante(prestamo2.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.PASAPORTE)) {
				cantidadPasaportes++;
			}
		}
		if (prestamo3 != null) {
			estudiante = consultarEstudiante(prestamo3.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.PASAPORTE)) {
				cantidadPasaportes++;
			}
		}

		return cantidadPasaportes;
	}

	/**
	 * Consulta la cantidad de tarjetas de identidad a partir de los prestamos
	 * hechos
	 * 
	 * @return cantidad tarjetas
	 */
	public int cantidadTarjetasIngresados() {

		int cantidadTarjetas = 0;
		Estudiante estudiante = null;
		if (prestamo1 != null) {
			estudiante = consultarEstudiante(prestamo1.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.TARJETA_IDENTIDAD)) {
				cantidadTarjetas++;
			}
		}
		if (prestamo2 != null) {
			estudiante = consultarEstudiante(prestamo2.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.TARJETA_IDENTIDAD)) {
				cantidadTarjetas++;
			}
		}
		if (prestamo3 != null) {
			estudiante = consultarEstudiante(prestamo3.getCedulaEstudiante());
			if (estudiante.getIndentificacion().equals(TipoDocumeno.TARJETA_IDENTIDAD)) {
				cantidadTarjetas++;
			}
		}

		return cantidadTarjetas;
	}

	/**
	 * Consulta el tipo de documento que mas se repite
	 * 
	 * @return mensaje
	 */
	public String MayorDocumento() {
		String mensaje = "El tipo de documento que aparece mas en los prestamos es: ";
		int cantidadCedulas = cantidadCedulasIngresados();
		int cantidadPasaportes = cantidadPasaportesIngresados();
		int cantidadTarjetas = cantidadTarjetasIngresados();

		if (cantidadCedulas > cantidadPasaportes && cantidadCedulas > cantidadTarjetas) {
			mensaje += TipoDocumeno.CEDULA_CIUDADANIA;
		}
		if (cantidadPasaportes > cantidadCedulas && cantidadPasaportes > cantidadTarjetas) {
			mensaje += TipoDocumeno.PASAPORTE;
		}
		if (cantidadTarjetas > cantidadCedulas && cantidadTarjetas > cantidadPasaportes) {
			mensaje += TipoDocumeno.TARJETA_IDENTIDAD;
		}
		return mensaje;
	}

	// METODOS QUE NO INTERVIENEN EN EL PARCIAL
	/*
	 * /** Consulta un libro por titulo
	 * 
	 * @param titulo
	 * 
	 * @return libro encontrado public Libro consultarLibroTitutlo(String titulo) {
	 * Libro datosT = null; if (libro1 != null) { if
	 * (libro1.getTitulo().equals(titulo)) { datosT = libro1; } } if (datosT == null
	 * && libro2 != null) { if (libro2.getTitulo().equals(titulo)) { datosT =
	 * libro2; } }
	 * 
	 * if (datosT == null && libro3 != null) { if
	 * (libro3.getTitulo().equals(titulo)) { datosT = libro3; } } return datosT; }
	 */

	/*
	 * /** Calcula el salario de los empleados
	 * 
	 * @param cedulaEmple
	 * 
	 * @return public double calcularSalario(String cedulaEmple) { double salario =
	 * 0;
	 * 
	 * if (bibliotecaria.getCodigo().equals(cedulaEmple)) { if (prestamo1 != null &&
	 * prestamo1.getCodigo().equals(bibliotecaria.getCodigo())) { salario +=
	 * (prestamo1.getValorPrestamoE() * (0.2)) + ((prestamo1.getValorPrestamoE() *
	 * (0.02)) * bibliotecaria.getAntiguedad()); } if (prestamo2 != null &&
	 * prestamo2.getCodigoBibliotecaria().equals(bibliotecaria.getCodigo())) {
	 * salario += (prestamo2.getValorPrestamoE() * (0.2)) +
	 * ((prestamo2.getValorPrestamoE() * (0.02)) * bibliotecaria.getAntiguedad()); }
	 * if (prestamo3 != null &&
	 * prestamo3.getCodigoBibliotecaria().equals(bibliotecaria.getCodigo())) {
	 * salario += (prestamo3.getValorPrestamoE() * (0.2)) +
	 * ((prestamo3.getValorPrestamoE() * (0.02)) * bibliotecaria.getAntiguedad()); }
	 * } return salario; }
	 */

	/*
	 * /** Consulta al menos 10 libros por titulo
	 * 
	 * @return public String consutarLibroCantidad() {
	 * 
	 * boolean libroVerificado = false; String librosEncontrados = "";
	 * 
	 * if (libro1 != null) { libroVerificado = libro1.verificarRango(); if
	 * (libroVerificado == true) { librosEncontrados = libro1.toString(); }
	 * 
	 * } if (libro2 != null) { libroVerificado = false; libroVerificado =
	 * libro2.verificarRango(); if (libroVerificado == true) { librosEncontrados =
	 * libro2.toString(); } } if (libro3 != null) { libroVerificado = false;
	 * libroVerificado = libro3.verificarRango(); if (libroVerificado == true) {
	 * librosEncontrados = libro3.toString(); } }
	 * 
	 * return librosEncontrados; }
	 */

	/*
	 * /** Consulta cuantos libros quedan disponibles en la biblioteca
	 * 
	 * @return public String consultarLibrosDisponibles() {
	 * 
	 * int numeroDeLibrosD = 0; String mensaje = "libro no disponible"; if (libro1
	 * != null) { numeroDeLibrosD += libro1.getDisponibilidad(); mensaje = "existen"
	 * + numeroDeLibrosD + "libros disponibles en la biblioteca"; }
	 * 
	 * if (libro2 != null) { numeroDeLibrosD += libro2.getDisponibilidad(); mensaje
	 * = "existen" + numeroDeLibrosD + "libros disponibles en la biblioteca"; } if
	 * (libro3 != null) { numeroDeLibrosD += libro3.getDisponibilidad(); mensaje =
	 * "existen" + numeroDeLibrosD + "libros disponibles en la biblioteca"; } return
	 * mensaje; }
	 */

	/*
	 * /** Consulta los estudiantes con mas prestamos
	 * 
	 * @return estudiante con mas prestamos public Estudiante
	 * consultarEstudianteMay() { int contadoru = 0; int contadord = 0; int
	 * contadort = 0; if (estudiante1 != null) { if
	 * (prestamo1.getCedulaEstudiante().equals(estudiante1.getCedula())) {
	 * contadoru++; }
	 * 
	 * if (prestamo2.getCedulaEstudiante().equals(estudiante1.getCedula())) {
	 * contadoru++; } if
	 * (prestamo3.getCedulaEstudiante().equals(estudiante1.getCedula())) {
	 * contadoru++; } } if (estudiante2 != null) { if
	 * (prestamo1.getCedulaEstudiante().equals(estudiante2.getCedula())) {
	 * contadord++; }
	 * 
	 * if (prestamo2.getCedulaEstudiante().equals(estudiante2.getCedula())) {
	 * contadord++; } if
	 * (prestamo3.getCedulaEstudiante().equals(estudiante2.getCedula())) {
	 * contadord++;
	 * 
	 * } } if (estudiante3 != null) { if
	 * (prestamo1.getCedulaEstudiante().equals(estudiante3.getCedula())) {
	 * contadort++; }
	 * 
	 * if (prestamo2.getCedulaEstudiante().equals(estudiante3.getCedula())) {
	 * contadort++; } if
	 * (prestamo3.getCedulaEstudiante().equals(estudiante3.getCedula())) {
	 * contadort++; } } if ((contadoru > contadord) && (contadoru > contadort)) {
	 * 
	 * return estudiante1; } else if ((contadord > contadoru) && (contadord >
	 * contadort)) { return estudiante2; } else { return estudiante3; } }
	 */

	/*
	 * public int contarPrestamos(String codigoBibliotecario) { int contador = 0; if
	 * (prestamo1.getCodigo().equals(codigoBibliotecario)) { contador++; } if
	 * (prestamo2.getCodigo().equals(codigoBibliotecario)) { contador++; } if
	 * (prestamo3.getCodigo().equals(codigoBibliotecario)) { contador++; } return
	 * contador; }
	 */

	/*
	 * /** Consultar dado el nombre del Libro la cantidad de préstamos en el cual
	 * esta incluido
	 * 
	 * @param titulo
	 * 
	 * @return public int ConsultarPrestamoLIBRO(String titulo) { int cantidadP = 0;
	 * Prestamo prestamoU = prestamo1; Prestamo prestamoD = prestamo2; Prestamo
	 * prestamoT = prestamo3;
	 * 
	 * Libro libroPrestamo = consultarLibroDatos(prestamoU.getCodigo()); if
	 * (libroPrestamo != null) { if (libroPrestamo.getTitulo().equals(titulo)) {
	 * cantidadP++; }
	 * 
	 * } libroPrestamo = consultarLibroDatos(prestamoD.getCodigo()); if
	 * (libroPrestamo != null) { if (libroPrestamo.getTitulo().equals(titulo)) {
	 * cantidadP++;
	 * 
	 * } libroPrestamo = consultarLibroDatos(prestamoT.getCodigo()); if
	 * (libroPrestamo != null) { if (libroPrestamo.getTitulo().equals(titulo)) {
	 * cantidadP++; } } } return cantidadP; }
	 */

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the estudiante1
	 */
	public Estudiante getEstudiante1() {
		return estudiante1;
	}

	/**
	 * @param estudiante1 the estudiante1 to set
	 */
	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}

	/**
	 * @return the estudiante2
	 */
	public Estudiante getEstudiante2() {
		return estudiante2;
	}

	/**
	 * @param estudiante2 the estudiante2 to set
	 */
	public void setEstudiante2(Estudiante estudiante2) {
		this.estudiante2 = estudiante2;
	}

	/**
	 * @return the estudiante3
	 */
	public Estudiante getEstudiante3() {
		return estudiante3;
	}

	/**
	 * @param estudiante3 the estudiante3 to set
	 */
	public void setEstudiante3(Estudiante estudiante3) {
		this.estudiante3 = estudiante3;
	}

	/**
	 * @return the libro1
	 */
	public Libro getLibro1() {
		return libro1;
	}

	/**
	 * @param libro1 the libro1 to set
	 */
	public void setLibro1(Libro libro1) {
		this.libro1 = libro1;
	}

	/**
	 * @return the libro2
	 */
	public Libro getLibro2() {
		return libro2;
	}

	/**
	 * @param libro2 the libro2 to set
	 */
	public void setLibro2(Libro libro2) {
		this.libro2 = libro2;
	}

	/**
	 * @return the libro3
	 */
	public Libro getLibro3() {
		return libro3;
	}

	/**
	 * @param libro3 the libro3 to set
	 */
	public void setLibro3(Libro libro3) {
		this.libro3 = libro3;
	}

	/**
	 * @return the prestamo1
	 */
	public Prestamo getPrestamo1() {
		return prestamo1;
	}

	/**
	 * @param prestamo1 the prestamo1 to set
	 */
	public void setPrestamo1(Prestamo prestamo1) {
		this.prestamo1 = prestamo1;
	}

	/**
	 * @return the prestamo2
	 */
	public Prestamo getPrestamo2() {
		return prestamo2;
	}

	/**
	 * @param prestamo2 the prestamo2 to set
	 */
	public void setPrestamo2(Prestamo prestamo2) {
		this.prestamo2 = prestamo2;
	}

	/**
	 * @return the prestamo3
	 */
	public Prestamo getPrestamo3() {
		return prestamo3;
	}

	/**
	 * @param prestamo3 the prestamo3 to set
	 */
	public void setPrestamo3(Prestamo prestamo3) {
		this.prestamo3 = prestamo3;
	}

	/**
	 * @return the bibliotecaria
	 */
	public Bibliotecaria getBibliotecaria() {
		return bibliotecaria;
	}

	/**
	 * @param bibliotecaria the bibliotecaria to set
	 */
	public void setBibliotecaria(Bibliotecaria bibliotecaria) {
		this.bibliotecaria = bibliotecaria;
	}

	/**
	 * @return the bibliotecaria2
	 */
	public Bibliotecaria getBibliotecaria2() {
		return bibliotecaria2;
	}

	/**
	 * @param bibliotecaria2 the bibliotecaria2 to set
	 */
	public void setBibliotecaria2(Bibliotecaria bibliotecaria2) {
		this.bibliotecaria2 = bibliotecaria2;
	}

}
