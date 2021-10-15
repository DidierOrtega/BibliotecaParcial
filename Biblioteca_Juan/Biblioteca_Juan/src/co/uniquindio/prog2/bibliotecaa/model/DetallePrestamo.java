package co.uniquindio.prog2.bibliotecaa.model;

/**
 * Clase detalle prestamo
 * 
 * @author JUAN PABLO
 *
 */
public class DetallePrestamo {

	// **************************
	// ATRIBUTOS
	// **************************
	private int cantidad;
	private Libro libro;
	private double subTotal;

	/**
	 * Metodo Constructor
	 * 
	 * @param cantidad
	 * @param libro
	 */
	public DetallePrestamo(int cantidad, Libro libro, double subTotal) {
		super();
		this.cantidad = cantidad;
		this.libro = libro;
		this.subTotal = subTotal;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/**
	 * @return the subTotal
	 */
	public double getSubTotal() {
		return subTotal;
	}

	/**
	 * @param subTotal the subTotal to set
	 */
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "Detalle Prestamo\nCantidad: " + cantidad + "\nSub total dinero: " + subTotal + "\n" + libro.toString();
	}

	// No aplica para el parcial
	// consultar la cantidad de libros dela editorial uniquindio
	// que han sido prestados en la biblioteca y su titulo empiece por vocal

//	public int obtenerCantidadLibrosEditorialVocal(String editorial) {
//		int cantidad = 0;
//		boolean verificado = false;
//
//		if (libro != null) {
//			verificado = libro.verificarEditorialLetraVocal(editorial);
//			if (verificado == true) {
//				cantidad = this.cantidad;
//			}
//		}
//		return cantidad;
//	}

}
