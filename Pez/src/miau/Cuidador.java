package miau;

public class Cuidador {
	private int gramosComida;


	public Cuidador () {
	gramosComida = 3;
		
	}
	
	public Cuidador (int gramos) {
		gramosComida = gramos;
		
		
	}
	
	
	public void alimentarPez (Pez pez, int gramos) {
		pez.comer(gramos);
	}
	 
	public void alimentarPez (Pez pez) {
		pez.comer(gramosComida);
		
	}
	
	
	public String toString () {
		String comidita = "El cuidador tiene " +gramosComida+ " gramos de comida";
				return comidita;
	}
 }


