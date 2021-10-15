package co.uniquindio.prog2.agenda.model;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Agenda {
	
	 Contacto contacto []= new  Contacto[10];
	 
	 
	 
	 public String crearContacto(Contacto contacto []) {
		 
		 
		 String mss="";
		 for(int i=0;i<contacto.length;i++) {
			 
			 String name=leerString("ingrese nombre contacto");
			 int numero=leerEntero("ingrese numero telefonico del contacto"+name);
			 contacto[i]=new Contacto(name, numero);
			 mss="contactoCreado";
			 
		 }
		 
		 
		 
		 
		 return mss;
	 }

	public Agenda(Contacto[] contacto) {
		super();
		this.contacto = contacto;
	}

	/**
	 * @return the contacto
	 */
	public Contacto[] getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(Contacto[] contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Agenda [contacto=" + Arrays.toString(contacto) + "]";
	}
	
	public static String leerString (String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	public static int leerEntero(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

}
