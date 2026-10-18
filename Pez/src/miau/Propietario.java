package miau;

public class Propietario {
	
	private Pez pez;
	
	
	public Propietario (Pez pece) {
		this.pez=pece;
	}
	
	public void renombrar (String renombre) {
		pez.setNombre(renombre);
		System.out.println("El propietario le ha cambiado el nombre a: " +pez);
	}
	

}
