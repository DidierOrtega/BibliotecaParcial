package co.uniquindio.prog2.bibliotecap.model;

/**
 * 
 * @author ediso
 *
 */
public class Prestamo {

	// ATRIBUTOS CLASE
	private String fechaPrestamo;
	private String fechaDevolucion;
	private String codigo;
	DetallePrestamo detallePrestamo;
	
	/**
	 * METODO CONSTRUCTOR
	 * 
	 * @param fechaPrestamo
	 * @param fechaDevolucion
	 * @param codigo
	 */
	public Prestamo(String fechaPrestamo, String fechaEntrega, String codigo, DetallePrestamo detallePrestamo) {
		super();
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaEntrega;
		this.codigo = codigo;
		this.detallePrestamo = detallePrestamo;
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
	 * @return the fechaEntrega
	 */
	public String getFechaEntrega() {
		return fechaDevolucion;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaDevolucion = fechaEntrega;
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
	 * @return the detallePrestamo
	 */
	public DetallePrestamo getDetallePrestamo() {
		return detallePrestamo;
	}

	/**
	 * @param detallePrestamo the detallePrestamo to set
	 */
	public void setDetallePrestamo(DetallePrestamo detallePrestamo) {
		this.detallePrestamo = detallePrestamo;
	}

	@Override
	public String toString() {
		return "Fecha del prestamo: " + fechaPrestamo + "\nFecha de entrega: " + fechaDevolucion
				+ "\nCodigo: " + codigo + "\nDetalle prestamo: " + detallePrestamo.toString();
	}

}
