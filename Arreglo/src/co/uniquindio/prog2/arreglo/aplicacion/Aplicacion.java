package co.uniquindio.prog2.arreglo.aplicacion;

import java.util.Scanner;

public class Aplicacion {
	public static void main(String[] args) {
		
		
		Scanner teclado;
		int n = teclado.nextInt();
		int [] listaNumeros = new int[n];
		inicializararrglo(listaNumeros );
	}
	
	
	public static void inicializararrglo(int [] listaNumeros) {Scanner teclado= new Scanner(System.in);
	
	
			for(int i=0;i<listaNumeros.length;i++) {
			System.out.print("por favor ingrese los valores");
			listaNumeros [i]=teclado.nextInt();
			}
	}
	public static void recorrerArreglo(int [] listaNumeros) {
		
		for(int i=0;i<listaNumeros.length;i++) {
			
			System.out.print(listaNumeros[i]);
		}
		
	}

public static void recorrerArregloInverso(int [] listaNumeros) {
		
		for(int i=listaNumeros.length ;i<=listaNumeros.length && i>=0;i--) {
			
			System.out.print8(listaNumeros[i]);
		}
}	
}
