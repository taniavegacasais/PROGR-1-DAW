package ejercicios;

public class MascotaVirtual {
	private String nombre;
	private int hambre;
	private int felicidad;
	private int energia;
	
	public MascotaVirtual (String nombre) {
		this.nombre=nombre;
		this.hambre=50;
		this.felicidad=50;
		this.energia=100;
		
	}
	
	// EJEMPLO SETTER -  public void setHambre (int hambreMascota) { 
		//hambre=hambreMascota;
	//}
	
	public void comer  ( ) {
		hambre= hambre-5;
		energia=energia+1; //energia+=1
		
		// EJEMPLO SETTER - setHambre (hambre +3); SUSTITUYE EL HAMBRE = HAMBRE +3
	}
	
	public void jugar (int minutos) {
		energia= energia -2*minutos; //MINUTOS VARIABLES
		felicidad= felicidad+3*minutos;
		hambre=hambre+1*minutos;
		if (energia < 0) {   //if para determinar que si la energia llega a 0, no se ponga negativa.
			energia =0;
		}
		
	}

	public void jugar() {
		//energia=energia-2*3; // MINUTOS FIJOS 
		//felicidad=felicidad+3*3;
		//hambre=hambre+1*3;
		
		this.jugar(3); // MAS SIMPLIFICADO QUE LO DE ARRIBA (el this es opcional puede ponere jugar(3);
	}
	
	public void dormir (int horas) {
		energia=energia+horas*2;
		hambre=hambre+horas*1;
	}
	
	public void mostrarEstado () {
		System.out.println ("Esta es la mascota: " + nombre );
		System.out.println ("Sus niveles de hambre son: " + hambre);
		System.out.println ("Su felicidad es: " + felicidad);
		System.out.println ("Su nivel de energia es: " +energia);
	}
	
	
	
	
	

}
