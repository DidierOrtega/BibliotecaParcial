package co.uniquindio.prog2.bibliotecap.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;



/**
 *  class de funciones 
 * @author ediso
 *
 */
public class Biblioteca {

	// |ATRIBUTOS|
	private String nombre;
	private String direccion;

	private Libro libro1;
	private Libro libro2;

	private Prestamo prestamo1;
	private Prestamo prestamo2;

	private Estudiante estudiante1;
	private Estudiante estudiante2;

	private Bibliotecario bibliotecario1;
	private Bibliotecario bibliotecario2;
	
	private DetallePrestamo detallePrestamo1;
	private DetallePrestamo detallePrestamo2;

	/**
	 * Metodo constructor de la clase Biblioteca
	 * 
	 * @param nombre
	 * @param direccion
	 */
	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/**
	 * Crear un bibliotecario, entre la cantidad disponbile, en este caso son 2 
	 * 
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @param ocupacion
	 * @param antiguedad
	 * @param tipo
	 * @return
	 */
	public String crearBibliotecario(String nombre, String identificacion, String direccion, String telefono,
			int antiguedad, IdentificacionDetalle tipo) {

		String mensaje = "No es posible crear mas bibliotecarios";
		if (bibliotecario1 == null) {
			bibliotecario1 = new Bibliotecario(nombre, identificacion, telefono, direccion, antiguedad, tipo);
			mensaje = "Bibliotecario creado con exito";
		} else if (bibliotecario2 == null) {
			bibliotecario2 = new Bibliotecario(nombre, identificacion, telefono, direccion, antiguedad, tipo);
			mensaje = "Bibliotecario creado con exito";
		}

		return mensaje;
	}

	/**
	 * Crear un estudiante, considerando la cantidad disponible
	 * 
	 * @param nombreEstudiante
	 * @param identificacionEstudiante
	 * @param direccionEstudiante
	 * @param telefonoEstudiante
	 * @return mensaje proceso
	 */
	public String crearEstudiante(String nombreEstudiante, String identificacionEstudiante, String direccionEstudiante,
			String telefonoEstudiante, IdentificacionDetalle tipo) {

		String mensaje = "No es posible crear mas estudiantes";
		if (estudiante1 == null) {
			estudiante1 = new Estudiante(nombreEstudiante, identificacionEstudiante, telefonoEstudiante,
					direccionEstudiante, tipo);
			mensaje = "Estudiante creado con exito";
		} else if (estudiante2 == null) {
			estudiante2 = new Estudiante(nombreEstudiante, identificacionEstudiante, telefonoEstudiante,
					direccionEstudiante,tipo);
			mensaje = "Estudiante creado con exito";
		}

		return mensaje;
	}

	/**
	 * Consultar un estudiante dada su identificacion
	 * 
	 * @param identificacionEstudiante
	 * @return estudiante encontrado
	 */
	public Estudiante consultarEstudiante(String identificacionEstudiante) {

		Estudiante estudianteEncontrado = null;
		if (estudiante1 != null) {
			if (estudiante1.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante1;
			}
		}
		if (estudianteEncontrado == null && estudiante2 != null) {
			if (estudiante2.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante2;
			}
		}
		return estudianteEncontrado;
	}
	
	/**
	 * Consultar Bibliotecario dado su codigo 
	 * 
	 * @param codigo
	 * @return
	 */
	public Bibliotecario consultarBibliotecario(String codigo) {

		Bibliotecario encontrado = null;
		if (bibliotecario1 != null) {
			if (bibliotecario1.getIdB().equals(codigo)) {
				encontrado = bibliotecario1;
			}
		}
		if (encontrado == null && bibliotecario2 != null) {
			if (bibliotecario2.getIdB().equals(codigo)) {
				encontrado = bibliotecario2;
			}
		}
		return encontrado;
	}

	/**
	 * Eliminar estudiante indicando null
	 * 
	 * @param identificacionEstudiante
	 * @return mensaje proceso
	 */
	public String eliminarEstudiante(String identificacionEstudiante) {

		String mensaje = "Estudiante no eliminado";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);

		if (estudianteEncontrado != null) {
			if (estudiante1 == estudianteEncontrado) {
				estudiante1 = null;
				mensaje = "Estudiante eliminado";
			} else {
				if (estudiante2 == estudianteEncontrado) {
					estudiante2 = null;
					mensaje = "Estudiante eliminado";
				}
			}
		}
		return mensaje;
	}

	/**
	 * Actualizar estudiante 
	 * 
	 * @param identificacionEstudiante
	 * @return mensaje proceso
	 */
	public String actualizarEstudiante(String identificacionEstudiante, String nombreEstudiante,
			String direccionEstudiante, String telefonoEstudiante, IdentificacionDetalle tipo) {

		String mensaje = "Estudiante no actualizado, no existe";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);

		if (estudianteEncontrado != null) {
			if (estudiante1 == estudianteEncontrado) {
				estudiante1.setDireccion(direccionEstudiante);
				estudiante1.setIdentificacion(identificacionEstudiante);
				estudiante1.setNombre(nombreEstudiante);
				estudiante1.setTelefono(telefonoEstudiante);
				estudiante1.setIdentificacionDetalle(tipo);
				mensaje = "Estudiante actualizado";
			} else {
				if (estudiante2 == estudianteEncontrado) {
					estudiante2.setDireccion(direccionEstudiante);
					estudiante2.setIdentificacion(identificacionEstudiante);
					estudiante2.setNombre(nombreEstudiante);
					estudiante2.setTelefono(telefonoEstudiante);
					estudiante2.setIdentificacionDetalle(tipo);
					mensaje = "Estudiante actualizado";
				}
			}
		}
		return mensaje;
	}

	/**
	 * Crear un libro, de la capacidad existente
	 * 
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 * @param editorial
	 * @param estado
	 * @param fechaPublicacion
	 * @param codigo
	 * @param cantidadDisponible
	 * @return mensaje proceso
	 */
	public String crearLibro(String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, String codigo, int cantidadDisponible, double costoLibro) {

		String mensaje = "No es posible crear mas estudiantes";

		if (libro1 == null) {
			libro1 = new Libro(isbn, titulo, autor, numeroPaginas, editorial, estado, fechaPublicacion, codigo,
					cantidadDisponible,costoLibro);
			mensaje = "Libro creado con exito";
		} else {
			if (libro2 == null) {
				libro2 = new Libro(isbn, titulo, autor, numeroPaginas, editorial, estado, fechaPublicacion, codigo,
						cantidadDisponible,costoLibro);
				mensaje = "Libro creado con exito";
			}
		}

		return mensaje;
	}

	/**
	 * Consultar un libro por medio de su codigo
	 * 
	 * @param codigoLibro
	 * @return libro encontrado
	 */
	public Libro consultarLibroCodigo(String codigoLibro) {

		Libro libroEncontrado = null;
		if (libro1 != null) {
			if (libro1.getCodigo().equals(codigoLibro)) {
				libroEncontrado = libro1;
			}
		}
		if (libroEncontrado == null && libro2 != null) {
			if (libro2.getCodigo().equals(codigoLibro)) {
				libroEncontrado = libro2;
			}
		}
		return libroEncontrado;
	}

	/**
	 * Consultar un libro por medio de su titulo
	 * 
	 * @param codigoLibro
	 * @return libro encontrado
	 */
	public Libro consultarLibroConIsbn(String isbn) {

		Libro libroEncontrado = null;
		if (libro1 != null) {
			if (libro1.getIsbn().equals(isbn)) {
				libroEncontrado = libro1;
			}
		}
		if (libroEncontrado == null && libro2 != null) {
			if (libro2.getIsbn().equals(isbn)) {
				libroEncontrado = libro2;
			}
		}
		return libroEncontrado;
	}

	/**
	 * Eliminar libro, indicandolo a null
	 * 
	 * @param codigoLibro
	 * @return mensaje proceso
	 */
	public String eliminarLibro(String codigoLibro) {

		String mensaje = "Estudiante no eliminado";
		Libro libroEncontrado = null;
		libroEncontrado = consultarLibroCodigo(codigoLibro);

		if (libroEncontrado != null) {
			if (libro1 == libroEncontrado) {
				libro1 = null;
				mensaje = "Libro eliminado";
			} else {
				if (libro2 == libroEncontrado) {
					libro2 = null;
					mensaje = "Libro eliminado";
				}
			}
		}
		return mensaje;
	}

	/**
	 * Verifica la nularidad de la memoria de libro 1 o 2 
	 * 
	 * @param opcion
	 * @return true si existe, false caso contrario
	 */
	public boolean verificarLibro(int indicador) {
		boolean centinela= false;

		if ((indicador == 1 && libro1 != null) || (indicador == 2 && libro2 != null)) {
			centinela  = true;
		}
		return centinela ;
	}

	/**
	 * Reemplaza o sobreescribe el libro segun la opcion especificada
	 * 
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 * @param editorial
	 * @param estado
	 * @param fechaPublicacion
	 * @param codigo
	 * @param cantidadDisponible
	 * @param opcion
	 * @return menseaje proceso
	 */
	public String reemplazarLibro(String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, String codigo, int cantidadDisponible, int opcion) {

		String mensaje = "La opcion de libro ingresada no existe, por favor intente nuevamente";
		switch (opcion) {
		case 1: {
			libro1.setAutor(autor);
			libro1.setCantidadDisponible(cantidadDisponible);
			libro1.setCodigo(codigo);
			libro1.setEditorial(editorial);
			libro1.setEstado(estado);
			libro1.setFechaPublicacion(fechaPublicacion);
			libro1.setIsbn(isbn);
			libro1.setNumeroPaginas(numeroPaginas);
			libro1.setTitulo(titulo);
			mensaje = "El libro 1 fue reemplazado correctamente";
		}
		case 2: {
			libro2.setAutor(autor);
			libro2.setCantidadDisponible(cantidadDisponible);
			libro2.setCodigo(codigo);
			libro2.setEditorial(editorial);
			libro2.setEstado(estado);
			libro2.setFechaPublicacion(fechaPublicacion);
			libro2.setIsbn(isbn);
			libro2.setNumeroPaginas(numeroPaginas);
			libro2.setTitulo(titulo);
			mensaje = "El libro 2 fue reemplazado correctamente";
		}
		default:
		}
		return mensaje;
	}

	/**
	 * Crea el prestamo con sus debidos atributos
	 * 
	 * @param fechaPrestamo
	 * @param fechaEntrega
	 * @param codigo
	 * @param idEstudiante
	 * @param codigoBibliotecario
	 * @param codigoLibro
	 * @param cantidad
	 * @return mensaje proceso
	 */
	public String crearPrestamo(String fechaPrestamo, String fechaEntrega, String codigo, String idEstudiante,
			String codigoBibliotecario, String codigoLibro, int cantidad) {

		String mensaje = "No se pueden crear mas prestamos";
		Libro libroPrestamo = consultarLibroCodigo(codigoLibro);
		Estudiante estudiantePrestamo = consultarEstudiante(idEstudiante);

		if (libroPrestamo != null && estudiantePrestamo != null) {
			if (libroPrestamo.verificarDisponibilidadLibro()) {
				if (asignarLibroPrestamo(libroPrestamo, cantidad)) {

					long dias = calcularDiferenciaDias(fechaEntrega, fechaPrestamo);
					double costo = ((int) dias * libroPrestamo.getValorLibro()) * cantidad;

					if (prestamo1 == null && detallePrestamo1 == null) {
						detallePrestamo1 = new DetallePrestamo(idEstudiante, codigoBibliotecario, codigoLibro, cantidad, costo);
						prestamo1 = new Prestamo(fechaPrestamo, fechaEntrega, codigo, detallePrestamo1);
						mensaje = "Prestamo creado con exito";

					} else if (prestamo2 == null) {
						detallePrestamo2 = new DetallePrestamo(idEstudiante, codigoBibliotecario, codigoLibro, cantidad, costo);
						prestamo2 = new Prestamo(fechaPrestamo, fechaEntrega, codigo, detallePrestamo2);
						mensaje = "Prestamo creado con exito";
					}
				} else
					mensaje = "No se puede crear prestamo porque la cantidad Disponibles no es suficiente";
			}

		} else {
			mensaje = "Datos erroneos, digite nuevamente";
		}
		return mensaje;
	}

	/**
	 * Consulta prestamo a partir de codigo
	 * 
	 * @param codigo
	 * @return prestamo encontrado
	 */
	public Prestamo consultarPrestamo(String codigo) {

		Prestamo prestamo = null;
		if (prestamo1 != null) {
			if (prestamo1.getCodigo().equals(codigo)) {
				prestamo = prestamo1;
			}
		} else if (prestamo == null && prestamo2 != null) {
			if (prestamo2.getCodigo().equals(codigo)) {
				prestamo = prestamo2;
			}
		}
		return prestamo;
	}

	/**
	 * Asigna el libro al prestamo realizando los cambios necesarios al libro
	 * 
	 * @param libro
	 * @param cantidad
	 * @return notificacion proceso realizado
	 */
	public boolean asignarLibroPrestamo(Libro libro, int cantidad) {

		int cantidadDisponibleNueva = 0;
		boolean respuesta = false;

		if (libro1 != null && libro.verificarIgualdad(libro1)) {
			if (libro1.getCantidadDisponible() >= cantidad) {
				cantidadDisponibleNueva = libro1.getCantidadDisponible() - cantidad;
				if (cantidadDisponibleNueva <= 0) {
					libro1.setEstado("AGOTADO");
				}
				libro1.setCantidadDisponible(cantidadDisponibleNueva);
				respuesta = true;
			}
		} else if (libro2 != null && libro.verificarIgualdad(libro2)) {
			if (libro2.getCantidadDisponible() >= cantidad) {
				cantidadDisponibleNueva = libro2.getCantidadDisponible() - cantidad;
				if (cantidadDisponibleNueva <= 0) {
					libro2.setEstado("AGOTADO");
				}
				libro2.setCantidadDisponible(cantidadDisponibleNueva);
				respuesta = true;
			}
		}
		return respuesta;
	}

	

	/**
	 * Verifica de los estudiantes quien tiene mayor numero de prestamos
	 * 
	 * @return estudiante encontrado
	 */
	public Estudiante calcularEstudianteMayorPrestamos() {
		int contador1 = 0;
		int contador2 = 0;
		Estudiante estudiante = null;

		if (estudiante1 != null) {
			if (prestamo1 != null && estudiante1.getIdentificacion().equals(prestamo1.getDetallePrestamo().getCodigoEstudiante())) {
				contador1++;
			}
			if (prestamo2 != null && estudiante1.getIdentificacion().equals(prestamo2.getDetallePrestamo().getCodigoEstudiante())) {
				contador1++;
			}
		}
		if (estudiante2 != null) {

			if (prestamo1 != null && estudiante2.getIdentificacion().equals(prestamo1.getDetallePrestamo().getCodigoEstudiante())) {
				contador2++;
			}
			if (prestamo2 != null && estudiante2.getIdentificacion().equals(prestamo2.getDetallePrestamo().getCodigoEstudiante())) {
				contador2++;
			}
		}

		if (contador1 > contador2)
			estudiante = estudiante1;
		else
			estudiante = estudiante2;

		return estudiante;
	}

	/**
	 * Calcula el dinero total recaudado por los prestamos
	 * 
	 * @return resultado dinero
	 */
	public double calcularDineroTotal() {
		double dineroTotal = 0;

		if (prestamo1 != null) {
			dineroTotal += prestamo1.getDetallePrestamo().getSubTotal();
		}
		if (prestamo2 != null) {
			dineroTotal += prestamo2.getDetallePrestamo().getSubTotal();
		}

		return dineroTotal;
	}

	/**
	 * Consulta por el titulo del libro y la fecha de entrega en cuantos prestamos se encuentra 
	 * el registro del bibliotecario
	 * 
	 * @param titulo
	 * @return cantidad prestamos
	 */
	public Bibliotecario consultarBibliotecarioCondicionesPrestamo(String isbn, String fechaEntrega) {
		Libro libroEncontrado = consultarLibroConIsbn(isbn);
		Bibliotecario bibliotecario = null;
		
		if (prestamo1 != null && libroEncontrado.getCodigo().equals(prestamo1.getDetallePrestamo().getCodigoLibro()) && (prestamo1.getFechaEntrega().equals(fechaEntrega))) {
			bibliotecario = consultarBibliotecario(prestamo1.getDetallePrestamo().getCodigoBibliotecario());
		}
		if (prestamo2 != null && libroEncontrado.getCodigo().equals(prestamo2.getDetallePrestamo().getCodigoLibro()) && (prestamo1.getFechaEntrega().equals(fechaEntrega))) {
			bibliotecario = consultarBibliotecario(prestamo1.getDetallePrestamo().getCodigoBibliotecario());
		}

		return bibliotecario;
	}

	/**
	 * Calcula los dias en los que el prestamo estara activo 
	 * 
	 * @param fechaEntrega
	 * @param fechaPrestamo
	 * @return entero dias del prestamo
	 */
	public long calcularDiferenciaDias(String fechaEntrega, String fechaPrestamo) {

		// Posiciones [0]: dia, [1]: mes, [2]: anio
		String[] fechaEntregaSplit = fechaEntrega.split("/");
		String[] fechaPrestamoSplit = fechaPrestamo.split("/");

		int fechaEntregaDia = Integer.parseInt(fechaEntregaSplit[0]);
		int fechaEntregaMes = Integer.parseInt(fechaEntregaSplit[1]);
		int fechaEntregaAnio = Integer.parseInt(fechaEntregaSplit[2]);

		int fechaPrestamoDia = Integer.parseInt(fechaPrestamoSplit[0]);
		int fechaPrestamoMes = Integer.parseInt(fechaPrestamoSplit[1]);
		int fechaPrestamoAnio = Integer.parseInt(fechaPrestamoSplit[2]);

		LocalDate inicio = LocalDate.of(fechaPrestamoAnio, fechaPrestamoMes, fechaPrestamoDia);
		LocalDate fin = LocalDate.of(fechaEntregaAnio, fechaEntregaMes, fechaEntregaDia);

		// Usando ChronoUnit, se calcula el numero de dias
		long dias = java.time.temporal.ChronoUnit.DAYS.between(inicio, fin);

		return dias;
	}

	/**
	 * Metodo para saber cual es el tipo de identificacion correspondiente;
	 * 
	 * @param opcion
	 * @return
	 */
	public IdentificacionDetalle  encontrarTipoIdenficacionCliente(int tipoN) {

		IdentificacionDetalle  tipo = null;

		if(tipoN==1) {
			tipo = IdentificacionDetalle .TARJETA_IDENTIDAD;
		}else {
			if(tipoN==2) {			
				
				tipo = IdentificacionDetalle.CEDULA_CIUDADANIA;
			}else {
				if(tipoN==3) {
					
					tipo = IdentificacionDetalle .PASAPORTE;
				}else {
					JOptionPane.showMessageDialog(null, "Tipo de documento invalido");
				}	
			}
		}

		return tipo;
	}
/**
 * esta funcion cuenta las cedulas registradas en la biblioteca para la realizacion de prestamos
 * @return
 */
	public int contarCedulas () {

		int contadorCedulas=0;


		if (estudiante1 != null && (estudiante1.getIdentificacion().equals(IdentificacionDetalle .CEDULA_CIUDADANIA))) {

			contadorCedulas ++;

		}
		if (estudiante2 != null && (estudiante2.getIdentificacion().equals(IdentificacionDetalle .CEDULA_CIUDADANIA)))
		{

			contadorCedulas ++;
		}
		return contadorCedulas ;
	}	
/**
 * esta funcion cuenta los pasaportes registradas en la biblioteca para la realizacion de prestamos
 * @return
 */
	public int contarPasaportes () {

		int contadorPasaporte=0;


		if (estudiante1 != null && (estudiante1.getIdentificacion().equals(IdentificacionDetalle .PASAPORTE))) {

			contadorPasaporte ++;

		}
		if (estudiante2 != null && (estudiante2.getIdentificacion().equals(IdentificacionDetalle .PASAPORTE)))
		{

			contadorPasaporte ++;
		}
		return contadorPasaporte ;
	}	
/**
 * esta funcion cuenta las tarjetas de identidad registradas en la biblioteca para la realizacion de prestamos
 * @return
 */
	public int contarTarjetasIdentidad () {

		int contadorTarjetaIdentidad=0;


		if (estudiante1 != null && (estudiante1.getIdentificacion().equals(IdentificacionDetalle .TARJETA_IDENTIDAD ))) {

			contadorTarjetaIdentidad  ++;

		}
		if (estudiante2 != null && (estudiante2.getIdentificacion().equals(IdentificacionDetalle .TARJETA_IDENTIDAD)))
		{

			contadorTarjetaIdentidad ++;
		}
		return contadorTarjetaIdentidad ;
	}	
	/**
	 * identifica cual de las cantidas de los tipos de documentos consultados es mayor
	 * @return
	 */
	public String  identificarMayorTipoIdentificacion () {

		int cedulasTotal,tarjetasIdTotal,pasaporteTotal;
		IdentificacionDetalle tipoMayor=null;
		String mss= "";

		cedulasTotal=contarCedulas();
		tarjetasIdTotal =contarPasaportes();
		pasaporteTotal = contarPasaportes();

		if(cedulasTotal >tarjetasIdTotal && cedulasTotal>pasaporteTotal ) {

			tipoMayor = IdentificacionDetalle.CEDULA_CIUDADANIA;
			mss="el tipo de identificacion es:"+tipoMayor;
		}

		if(tarjetasIdTotal  >cedulasTotal  && tarjetasIdTotal >pasaporteTotal) {

			tipoMayor = IdentificacionDetalle.TARJETA_IDENTIDAD ;
			mss="el tipo de identificacion es:"+tipoMayor;
		}
		if(pasaporteTotal > cedulasTotal && pasaporteTotal > tarjetasIdTotal ) {
			tipoMayor = IdentificacionDetalle.PASAPORTE ;
			mss="el tipo de identificacion es:"+tipoMayor;

		}
		return mss;
	}	
	@Override
	public String toString() {
		return "Biblioteca [Nombre =" + nombre + ", Direccion =" + direccion + ", Libro 1 =" + libro1.toString()
				+ ", Libro 2 =" + libro2.toString() + ", Prestamo 1 =" + prestamo1 + ", Prestamo 2 =" + prestamo2
				+ ", Estudiante 1 =" + estudiante1.toString() + ", Estudiante 2=" + estudiante2.toString()
				+ ", Bibliotecario=" + bibliotecario1.toString() + "]";
	}

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
	 * @return the bibliotecario1
	 */
	public Bibliotecario getBibliotecario1() {
		return bibliotecario1;
	}

	/**
	 * @param bibliotecario1 the bibliotecario1 to set
	 */
	public void setBibliotecario1(Bibliotecario bibliotecario1) {
		this.bibliotecario1 = bibliotecario1;
	}

	/**
	 * @return the bibliotecario2
	 */
	public Bibliotecario getBibliotecario2() {
		return bibliotecario2;
	}

	/**
	 * @param bibliotecario2 the bibliotecario2 to set
	 */
	public void setBibliotecario2(Bibliotecario bibliotecario2) {
		this.bibliotecario2 = bibliotecario2;
	}

}
