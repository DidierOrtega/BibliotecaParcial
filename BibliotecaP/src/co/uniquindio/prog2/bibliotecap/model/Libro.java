package co.uniquindio.prog2.bibliotecap.model;

/**
 * 
 * @author ediso
 *
 */
public class Libro {

	// ATRIBUTOS CLASE
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String editorial;
	private String estado;
	private String fechaPublicacion;
	private String codigo;
	private int cantidadDisponible;
	private double valorLibro;

	
	public Libro(String isbn, String titulo, String autor, int numeroPaginas, String editorial, String estado,
			String fechaPublicacion, String codigo, int cantidadDisponible, double valorLibro) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editorial = editorial;
		this.estado = estado;
		this.fechaPublicacion = fechaPublicacion;
		this.codigo = codigo;
		this.cantidadDisponible = cantidadDisponible;
		this.valorLibro = valorLibro;
	}

	/**
	 * 
	 * @return
	 */
	public boolean verificarDisponibilidadLibro() {

		boolean bandera = false;
		if (this.getCantidadDisponible() > 0) {
			bandera = true;
		}
		return bandera;
	}

	/**
	 * 
	 * @param libro
	 * @return
	 */
	public boolean verificarIgualdad(Libro libro) {

		boolean bandera = false;
		if (this.equals(libro)) {
			bandera = true;
		}
		return bandera;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the fechaPublicacion
	 */
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	/**
	 * @param fechaPublicacion the fechaPublicacion to set
	 */
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
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
	 * @return the cantidadDisponible
	 */
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	/**
	 * @param cantidadDisponible the cantidadDisponible to set
	 */
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	

	/**
	 * @return the valorLibro
	 */
	public double getValorLibro() {
		return valorLibro;
	}

	/**
	 * @param valorLibro the valorLibro to set
	 */
	public void setValorLibro(double valorLibro) {
		this.valorLibro = valorLibro;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", editorial=" + editorial + ", estado=" + estado + ", fechaPublicacion=" + fechaPublicacion
				+ ", codigo=" + codigo + ", cantidadDisponible=" + cantidadDisponible + ", valorLibro=" + valorLibro
				+ "]";
	}

	

}
