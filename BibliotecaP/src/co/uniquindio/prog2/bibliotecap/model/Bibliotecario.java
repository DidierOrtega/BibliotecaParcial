package co.uniquindio.prog2.bibliotecap.model;

public class Bibliotecario {

	private String nombre;
	private String idB;
	private String direccion;
	private String genero;
	private int yearsEstancia;
	IdentificacionDetalle identificacionDetalle;
	
	/**
	 * @param nombre
	 * @param idB
	 * @param direccion
	 * @param genero
	 * @param yearsEstancia
	 */
	public Bibliotecario(String nombre,String idB, String direccion, String genero, int yearsEstancia, IdentificacionDetalle identificacionDetalle ) {
		super();
		this.nombre = nombre;
		this.idB=idB;
		this.direccion = direccion;
		this.genero = genero;
		this.yearsEstancia= yearsEstancia;
		this.identificacionDetalle= identificacionDetalle;
	}


	/**
	 * @return the identificacionDetalle
	 */
	public IdentificacionDetalle getIdentificacionDetalle() {
		return identificacionDetalle;
	}


	/**
	 * @param identificacionDetalle the identificacionDetalle to set
	 */
	public void setIdentificacionDetalle(IdentificacionDetalle identificacionDetalle) {
		this.identificacionDetalle = identificacionDetalle;
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
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * @return the yearsEstancia
	 */
	public int getYearsEstancia() {
		return yearsEstancia;
	}


	/**
	 * @param yearsEstancia the yearsEstancia to set
	 */
	public void setYearsEstancia(int yearsEstancia) {
		this.yearsEstancia = yearsEstancia;
	}

	/**
	 * @return the idB
	 */
	public String getIdB() {
		return idB;
	}

	/**
	 * @param idB the idB to set
	 */
	public void setIdB(String idB) {
		this.idB = idB;
	}


	@Override
	public String toString() {
		return "Bibliotecario [nombre=" + nombre + ", idB=" + idB + ", direccion=" + direccion + ", genero=" + genero
				+ ", yearsEstancia=" + yearsEstancia + ", identificacionDetalle=" + identificacionDetalle + "]";
	}


	
	
}
