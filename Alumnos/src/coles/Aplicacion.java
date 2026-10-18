package coles;

import java.util.Scanner;

public class Aplicacion {
	
	public Aplicacion () {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del alumno");
		String nombre = s.next();
		System.out.println("Introduce la nota del primer módulo");
		Double modulo1 = s.nextDouble();
		System.out.println("Introduce la nota del segundo módulo");
		Double modulo2 = s.nextDouble();
		System.out.println("Introduce la nota del tercer módulo");
		Double modulo3= s.nextDouble();
		
		Alumno al = new Alumno(nombre,modulo1,modulo2,modulo3);
		al.presentarse();
	
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aplicacion api = new Aplicacion();

	}

}
