package miau;

public class Pez {
	
	private String nombre;
	private int nivelHambre;
	private int nivelEnergia;
	private int peso;
	
	
	
	public Pez (String nombrePez) {
		nivelHambre=30;
		nivelEnergia=80;
		peso=50;
		nombre=nombrePez;
		
	}
	
	
	public void comer (int gramosComida) {
		nivelHambre= nivelHambre - gramosComida*4;
		peso=peso+1;
	}
	
	public void nadar (int minutos) {
		nivelEnergia = nivelEnergia - minutos*3;
		nivelHambre=nivelHambre + minutos*2;
	}
	
	public void descansar (int horas) {
		nivelEnergia = nivelEnergia + horas*10;
		nivelHambre=nivelHambre + horas*1;
	}
 
	
	public void mostrarEstado () {
		System.out.println("Este es el pez: "+nombre);
		System.out.println ("y tiene: " +nivelHambre+" puntos de hambre");
		System.out.println (+nivelEnergia+ " puntos de energía");
		System.out.println ("y pesa: " +peso+ " gramos");
	}
	
	
	public String toString() {
		return nombre;
		
	}
	
	public String getNombre () {
		return nombre;
		
	}
	
	
	public void setNombre (String renombre) {
		nombre = renombre;
		
		
	}
}
