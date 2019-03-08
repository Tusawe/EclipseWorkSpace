package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clases.Biblioteca;
import clases.Libro;


public class TestBiblioteca {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		mostrarBiblioteca(crearBiblioteca());
		
	}
	
	public static Biblioteca crearBiblioteca() {
		
		System.out.println("Introduzca la localidad de la biblioteca: ");
		String sLocalidad = sc.next();
		while (!sLocalidad.matches("^[A-ZÁÉÍÓÚa-záéíóú]+$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca la localidad de la biblioteca de nuevo: ");
			sLocalidad = sc.next();
			
		}
		
		System.out.println("Introduzca el Sitio Web de la biblioteca: ");
		String sSitioWeb = sc.next();
		while (!sSitioWeb.matches("^www\\.[a-z]+\\.(com|es|org|eu)$")) {
			
			System.out.println("ERROR DE DATOS: Introduzca el Sitio Web de la biblioteca de nuevo: ");
			sSitioWeb = sc.next();
			
		}
		
		List<Libro> libros = pedirLibros();
		
		Biblioteca biblioteca = new Biblioteca(sLocalidad, sSitioWeb, libros);
		
		return biblioteca;
		
	}
	
	public static List<Libro> pedirLibros() {
	
		List<Libro> libros = new ArrayList<Libro>();
		
		for (int i = 0; i <= 2; i++) {
			
			System.out.println("Introduzca el título de un libro: ");
			String sTituloLibro = sc.next();
			while (!sTituloLibro.matches("^[A-ZÁÉÍÓÚa-záéíóú]+$")) {
				
				System.out.println("ERROR DE DATOS: Introduzca el título de un libro de nuevo: ");
				sTituloLibro = sc.next();
				
			}
			
			System.out.println("Introduzca el ISBN del libro: ");
			String sISBN = sc.next();
			while (!sISBN.matches("^[0-9]{13}$")) {
				
				System.out.println("ERROR DE DATOS: Introduzca el ISBN del libro de nuevo: ");
				sISBN = sc.next();
				
			}
			
			System.out.println("Introduzca el número de ejemplares del libro (entre 1 y 9): ");
			String sNumeroEjemplares = sc.next();
			while (!sNumeroEjemplares.matches("^[1-9]$")) {
				
				System.out.println("ERROR DE DATOS: Introduzca el número de ejemplares del libro de nuevo (entre 1 y 9): ");
				sNumeroEjemplares = sc.next();
				
			}
			int iNumeroEjemplares = Integer.parseInt(sNumeroEjemplares);
			
			libros.add(new Libro(sTituloLibro, sISBN, iNumeroEjemplares));
			
		}
		
		return libros;
		
	}
	
	public static void mostrarBiblioteca(Biblioteca biblioteca) {
		
		System.out.println(biblioteca);
		
		for (Libro libro : biblioteca.getLibros()) {
			
			System.out.println(libro);
			
		}
		
	}

}
