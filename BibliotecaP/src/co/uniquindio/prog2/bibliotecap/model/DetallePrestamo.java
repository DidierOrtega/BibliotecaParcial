package co.uniquindio.prog2.bibliotecap.model;

public class DetallePrestamo {

	private String codigoEstudiante;
	private String codigoBibliotecario;
	private String codigoLibro;
	private int cantidad;
	private double subTotal;

	public DetallePrestamo() {
		// TODO Auto-generated constructor stub
	}

	/**Metodo constrcutor 
	 * @param codigoEstudiante
	 * @param codigoBibliotecario
	 * @param codigoLibro
	 * @param cantidad
	 * @param subTotal
	 */
	public DetallePrestamo(String codigoEstudiante, String codigoBibliotecario, String codigoLibro, int cantidad,
			double subTotal) {
		super();
		this.codigoEstudiante = codigoEstudiante;
		this.codigoBibliotecario = codigoBibliotecario;
		this.codigoLibro = codigoLibro;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	/**
	 * @return the codigoEstudiante
	 */
	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	/**
	 * @param codigoEstudiante the codigoEstudiante to set
	 */
	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	/**
	 * @return the codigoBibliotecario
	 */
	public String getCodigoBibliotecario() {
		return codigoBibliotecario;
	}

	/**
	 * @param codigoBibliotecario the codigoBibliotecario to set
	 */
	public void setCodigoBibliotecario(String codigoBibliotecario) {
		this.codigoBibliotecario = codigoBibliotecario;
	}

	/**
	 * @return the codigoLibro
	 */
	public String getCodigoLibro() {
		return codigoLibro;
	}

	/**
	 * @param codigoLibro the codigoLibro to set
	 */
	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
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
		return "Cantidad: " + cantidad + "\nCodigo estudiante: " + codigoEstudiante + "\nCodigo libro: " + codigoLibro
				+ "\nCodigo Bibliotecario: " + codigoBibliotecario + "\nCosto: " + subTotal;
	}
}
