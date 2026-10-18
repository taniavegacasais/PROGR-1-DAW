package miau;

public class Aplicacion {
	
	public Aplicacion () {
		Pez pececito = new Pez ("Nemo");
		pececito.comer(58);
		pececito.descansar(3);
		pececito.mostrarEstado();
		System.out.println(pececito.toString());
		Cuidador cui = new Cuidador (58);
		cui.alimentarPez(pececito, 58);
		System.out.println(cui.toString());
		Propietario prop = new Propietario (pececito);
		prop.renombrar("miau");
		
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Aplicacion api = new Aplicacion();

	}

}
