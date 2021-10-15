package co.uniquindio.prog2.agenda.model;

public class Contacto {


	private String nameContact;
	private int numero;
	
	public Contacto(String nameContact, int numero) {
		super();
		this.nameContact = nameContact;
		this.numero = numero;
	}

	/**
	 * @return the nameContact
	 */
	public String getNameContact() {
		return nameContact;
	}

	/**
	 * @param nameContact the nameContact to set
	 */
	public void setNameContact(String nameContact) {
		this.nameContact = nameContact;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contacto [nameContact=" + nameContact + ", numero=" + numero + "]";
	}
	
	
	
	
	
	
}
