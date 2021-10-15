package co.uniquindio.prog2.bibliotecaa.model;

/**
 * Clase prestamo
 * 
 * @author JUAN PABLO
 *
 */
public class Prestamo {

	// **************************
	// ATRIBUTOS
	// **************************
	private String fechaPrestamo;
	private String codigo;
	private String fechaDevolucion;
	private String cedulaEstudiante;
	private String codigoBibliotecaria;
	private double valorPrestamoE;
	DetallePrestamo detallesPrestamo;

	/**
	 * Metodo Constructor
	 * 
	 * @param fechaPrestamo
	 * @param codigo
	 * @param fechaDevolucion
	 * @param cedulaEstudiante
	 * @param codigoBibliotecaria
	 * @param valorPrestamoE
	 */
	public Prestamo(String fechaPrestamo, String codigo, String fechaDevolucion, String cedulaEstudiante,
			String codigoBibliotecaria, double valorPrestamoE, DetallePrestamo detallesPrestamo) {
		super();
		this.fechaPrestamo = fechaPrestamo;
		this.codigo = codigo;
		this.fechaDevolucion = fechaDevolucion;
		this.cedulaEstudiante = cedulaEstudiante;
		this.codigoBibliotecaria = codigoBibliotecaria;
		this.valorPrestamoE = valorPrestamoE;
		this.detallesPrestamo = detallesPrestamo;
	}

	/**
	 * @return the fechaPrestamo
	 */
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	/**
	 * @param fechaPrestamo the fechaPrestamo to set
	 */
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the fechaDevolucion
	 */
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * @param fechaDevolucion the fechaDevolucion to set
	 */
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	/**
	 * @return the cedulaEstudiante
	 */
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	/**
	 * @param cedulaEstudiante the cedulaEstudiante to set
	 */
	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	/**
	 * @return the codigoBibliotecaria
	 */
	public String getCodigoBibliotecaria() {
		return codigoBibliotecaria;
	}

	/**
	 * @param codigoBibliotecaria the codigoBibliotecaria to set
	 */
	public void setCodigoBibliotecaria(String codigoBibliotecaria) {
		this.codigoBibliotecaria = codigoBibliotecaria;
	}

	/**
	 * @return the valorPrestamoE
	 */
	public double getValorPrestamoE() {
		return valorPrestamoE;
	}

	/**
	 * @param valorPrestamoE the valorPrestamoE to set
	 */
	public void setValorPrestamoE(double valorPrestamoE) {
		this.valorPrestamoE = valorPrestamoE;
	}

	/**
	 * @return the detallesPrestamo
	 */
	public DetallePrestamo getDetallesPrestamo() {
		return detallesPrestamo;
	}

	/**
	 * @param detallesPrestamo the detallesPrestamo to set
	 */
	public void setDetallesPrestamo(DetallePrestamo detallesPrestamo) {
		this.detallesPrestamo = detallesPrestamo;
	}

	@Override
	public String toString() {
		return "Prestamo\nFecha Prestamo: " + fechaPrestamo + "\nCodigo: " + codigo + "\nFecha Devolucion: "
				+ fechaDevolucion + "\nTotal dinero: " + valorPrestamoE + "\n" + detallesPrestamo.toString();
	}
}