package coles;

public class Alumno {

	private String nombre;
	private double modulo1, modulo2, modulo3;
	private double nota;

	public Alumno(String nombre, double modulo1, double modulo2, double modulo3) {

		this.nombre = nombre;
		this.modulo1 = modulo1;
		this.modulo2 = modulo2;
		this.modulo3 = modulo3;
		calcularMedia();
	}

	public double calcularMedia() {
		nota = (modulo1 + modulo2 + modulo3) / 3;
		return nota;
	}

	public double subirNota(int numero) {
		nota = nota + numero;
		return nota;
	}

	public String toString() {
		String presentacion = "Hola mi nombre es " + nombre + " y mi nota media es " + calcularMedia();
		return presentacion;

	}
	
	public void presentarse () {
		System.out.println(toString()); 
	
	}

}
