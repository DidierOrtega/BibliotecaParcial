package co.uniquindio.prog2.bibliotecap.excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Excepcion extends IOException{

	public Excepcion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
