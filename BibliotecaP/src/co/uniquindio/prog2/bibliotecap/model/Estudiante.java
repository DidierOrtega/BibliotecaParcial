package co.uniquindio.prog2.bibliotecap.model;

public class Estudiante {
	
	
	private String nombre;
	private String identificacion;
	private String direccion;
	private String telefono;
	IdentificacionDetalle identificacionDetalle;
	public Estudiante(String nombre, String identificacion, String direccion, String telefono, IdentificacionDetalle identificacionDetalle ) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.identificacionDetalle=identificacionDetalle ;
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", identificacion=" + identificacion + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", identificacionDetalle=" + identificacionDetalle + "]";
	}

	public static boolean validarDatosEstudiante(String nombreE, String idEstudiante,
			String dirEstudiante, String telfEstudiante) {

		boolean valido = true;
		if (nombreE.equalsIgnoreCase("") || idEstudiante.equalsIgnoreCase("")
				|| dirEstudiante.equalsIgnoreCase("") || telfEstudiante.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumero(telfEstudiante)) {
			valido = false;
		}
		return valido;
	}
	
	public static boolean isNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	
	 



	
}
