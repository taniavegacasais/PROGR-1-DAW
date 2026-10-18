package ejercicios;

public class Mago {
	
	private int puntosVida;
	
	private int puntosAtaque;
	
	private String nombre;
	

	public Mago (String nombreMago) {
		
		puntosVida = 115;
		
		puntosAtaque= 96;
		
		nombre= nombreMago;
	}
		
	public void restarVida(int danio) {
		puntosVida = puntosVida - danio;
		
	}
	
	public void atacar (Arquero arquero) {
		arquero.restarVida(puntosAtaque);
		
	}
	
	public void mostrarVidaMago() {
		System.out.println ("Vida del mago: " + puntosVida);
	}

	public String getNombre() {
		return nombre;
	}
}
