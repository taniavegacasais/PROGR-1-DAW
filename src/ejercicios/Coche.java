package ejercicios;

public class Coche {
	
	private int velocidad= 2;
	// Se puede añadir el número de velocidad en el constructor 
	
	public Coche() {
		velocidad = 2;
		//Ejemplo de velocidad en el constructor en vez de en el atributo (=2)
	}
	
	public int acelerar() {
		velocidad = velocidad +4;
		return velocidad;
	}
	
	public int frenar () {
		velocidad = velocidad -2;
		return velocidad; 
	}
	
	public int getVelocidad () {
		return velocidad;
	}
	
	public void mostrarVelocidad () {
		System.out.println ("Velocidad coche: " + velocidad);
	}
	
			
			

}
