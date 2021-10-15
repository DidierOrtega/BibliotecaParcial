package co.uniquindio.prog2.bibliotecaa.model;

/**
 * Clase estudiante
 * 
 * @author JUAN PABLO
 *
 */
public class Estudiante {

	// **************************
	// ATRIBUTOS
	// **************************
	private String nombre;
	private String cedula;
	private String direccion;
	private String telefono;
	private TipoDocumeno indentificacion;

	/**
	 * Metodo Constructor
	 * 
	 * @param nombre
	 * @param cedula
	 * @param direccion
	 * @param telefono
	 * @param indentificacion
	 */
	public Estudiante(String nombre, String cedula, String direccion, String telefono, TipoDocumeno indentificacion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
		this.indentificacion = indentificacion;
	}

	/**
	 * Verifica el nombre del objeto
	 * 
	 * @param nombreBuscar
	 * @return true si coincide, false caso contrario
	 */
	public boolean verificarNombre(String nombreBuscar) {
		if (this.nombre.equals(nombreBuscar)) {
			return true;
		}
		return false;
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
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	 * @return the indentificacion
	 */
	public TipoDocumeno getIndentificacion() {
		return indentificacion;
	}

	/**
	 * @param indentificacion the indentificacion to set
	 */
	public void setIndentificacion(TipoDocumeno indentificacion) {
		this.indentificacion = indentificacion;
	}

	@Override
	public String toString() {
		return "Estudiante\nNombre: " + nombre + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: "
				+ telefono + "\nIndentificacion: " + indentificacion;
	}

}
