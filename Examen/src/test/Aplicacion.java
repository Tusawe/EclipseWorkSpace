package test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import clases.Auxiliar;
import clases.Conexion;
import clases.Demografia;
import clases.DemografiaDAO;

public class Aplicacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DemografiaDAO demografiaDAO = new DemografiaDAO();
		
		String codigo;
		
		do {
			System.out.println("Introduce el cogido de un municipio:");
			codigo = sc.next();
		} while (!Auxiliar.comprobarCodigo(codigo));
		
		if (demografiaDAO.borrarDato(codigo)) System.out.println("Municipio borrado.");
		else System.out.println("Municipio no borrado.");
		
		System.out.println("Introduzca un rango de numero de nacimientos.");
		System.out.println("Primer numero: ");
		int valor1 = sc.nextInt();
		System.out.println("Segundo numero: ");
		int valor2 = sc.nextInt();
		
		List<Demografia> nacimientos = demografiaDAO.devolverNacimientos(valor1, valor2);
		for (Demografia demografia : nacimientos) {
			System.out.println(demografia);
		}
		
		if(Auxiliar.exportarBaseDeDatos(demografiaDAO.obtenerTodosLosDatos())) System.out.println("Base de datos exportada.");
		else System.out.println("Error al exportar la base de datos.");
		
		try {
			Conexion.cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
