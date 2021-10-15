package co.uniquindio.prog2.bibliotecaa.model;

/**
 * Clase libro
 * 
 * @author JUAN PABLO
 *
 */
public class Libro {

	// **************************
	// ATRIBUTOS
	// **************************
	private String titulo;
	private String autor;
	private String editorial;
	private String estado;
	private String codigo;
	private String isbn;
	private int numerosPaginas;
	private String publicacion;
	private int disponibilidad;
	private double precio;

	/**
	 * Metodo Constructor
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
	 * @param precio
	 */
	public Libro(String titulo, String autor, String editorial, String estado, String codigo, String isbn,
			int numerosPaginas, String publicacion, int disponibilidad, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.estado = estado;
		this.codigo = codigo;
		this.isbn = isbn;
		this.numerosPaginas = numerosPaginas;
		this.publicacion = publicacion;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
	}

	public boolean verificarRango() {
		if (getDisponibilidad() > 10 && getDisponibilidad() <= 20) {
			return true;
		}
		return false;
	}

	// 1.0 consultar la cantidad de libros de la editorial uniquindio
	// que han sido presentados en la biblioteca y su tituloo empiece por vocal
	public boolean verificarEditorialLetraVocal(String editorial) {
		char letra = titulo.charAt(0);
		boolean iniciaVocal = false;
		iniciaVocal = esVocal(letra);
		if (iniciaVocal == true && this.editorial.equalsIgnoreCase(editorial)) {
			return true;
		}
		return false;
	}

	private boolean esVocal(char letra) {
		letra = Character.toLowerCase(letra);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			return true;
		}
		return false;
	}

	// esta funcion me consulta el titulo del del libro de programcion que fue
	// prestado
	public boolean consultarPrestamoLibroP() {
		boolean prestado = false;
		String libroProgamacion2 = null;
		if (getTitulo().equals(libroProgamacion2)) {
			prestado = true;
		}
		return prestado;
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
	 * @return the numerosPaginas
	 */
	public int getNumerosPaginas() {
		return numerosPaginas;
	}

	/**
	 * @param numerosPaginas the numerosPaginas to set
	 */
	public void setNumerosPaginas(int numerosPaginas) {
		this.numerosPaginas = numerosPaginas;
	}

	/**
	 * @return the publicacion
	 */
	public String getPublicacion() {
		return publicacion;
	}

	/**
	 * @param publicacion the publicacion to set
	 */
	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}

	/**
	 * @return the disponibilidad
	 */
	public int getDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * @param disponibilidad the disponibilidad to set
	 */
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	/**
	 * @return the precioP
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precioP the precioP to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro\nTitulo: " + titulo + "\nAutor: " + autor + "\nEditorial: " + editorial + "\nEstado: " + estado
				+ "\nCodigo: " + codigo + "\nISBN: " + isbn + "\nNumeros Paginas: " + numerosPaginas
				+ "\nFecha Publicacion: " + publicacion + "\nDisponibilidad: " + disponibilidad;
	}
}
