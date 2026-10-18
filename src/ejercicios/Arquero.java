package ejercicios;

public class Arquero {
	
	private int puntosVida;
	
	private int puntosAtaque;
	
	private String nombre;
	
	

	public Arquero (String nombreArquero) {
		
		puntosVida = 100;
		
		puntosAtaque = 30;
		
		nombre = nombreArquero;
	}
	
	public void restarVida (int danio) {
		
		puntosVida = puntosVida - danio;
	
	}
	
	public void atacar (Mago mago) {
		
		mago.restarVida(puntosAtaque);
	}


	public String getNombre() {
		return nombre;
	}

	public void mostrarVidaArquero () {
		System.out.println ("Vida del arquero: " + puntosVida);
	}
	

}
