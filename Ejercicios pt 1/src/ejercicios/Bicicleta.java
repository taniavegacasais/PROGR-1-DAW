package ejercicios;

public class Bicicleta {
	
	private int velocidad= 0;
	
	public Bicicleta() {}
	
	public int acelerar() {
		 velocidad = velocidad +1;
		 return velocidad;
	}
	
	public int frenar () {
		velocidad = velocidad-1;
		return velocidad;
	}
	
	public int getVelocidad() {
		return velocidad; 
		// Método para que alguien pueda ver (NO MODIFICAR) la velocidad pese a que es privada 
	}
	
	public void mostrarVelocidad () {
		System.out.println("Velocidad bicicleta: "+velocidad);
		// Entre comillas para generar el texto, fuera de comillas valor de la variable 
	}

}
