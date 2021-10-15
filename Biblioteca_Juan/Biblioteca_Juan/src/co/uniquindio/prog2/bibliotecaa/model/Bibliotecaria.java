package co.uniquindio.prog2.bibliotecaa.model;

/**
 * Clase bibliotecario 
 * 
 * @author JUAN PABLO
 *
 */
public class Bibliotecaria {
	
	//**************************
	// ATRIBUTOS
	//**************************
	private String nombre;
	private String telefono;
	private String direccion;
	private String codigo;
	private int antiguedad;
	private TipoDocumeno tipoDocumento;
	
	/**
	 * Metodo Constructor
	 * 
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @param codigo
	 * @param antiguedad
	 * @param tipoDocumento
	 */
	public Bibliotecaria(String nombre, String telefono, String direccion, String codigo, int antiguedad,
			TipoDocumeno tipoDocumento) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigo = codigo;
		this.antiguedad = antiguedad;
		this.tipoDocumento = tipoDocumento;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	 * @return the antiguedad
	 */
	public int getAntiguedad() {
		return antiguedad;
	}
	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumeno getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumeno tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Override
	public String toString() {
		return "Bibliotecario\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\nCodigo: "
				+ codigo + "\nAntiguedad: " + antiguedad + "\nTipo Documento: " + tipoDocumento;
	}
}
