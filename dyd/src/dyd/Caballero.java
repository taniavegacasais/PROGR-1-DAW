package dyd;

public class Caballero {
	
	private String nombre;
	private int puntosVida;
	private int nivelArmadura;
	
	
	public Caballero (String nombre) {
		this.nombre=nombre;
		puntosVida=120;
		nivelArmadura= 20;
		
	System.out.println("Se crea el caballero: " + nombre);
	}
	
	public void setpuntosVida (int puntosVida ) {
		this.puntosVida=puntosVida;
		System.out.println("Estos son los puntos de vida del caballero: "+this.puntosVida);
	}
	
	public int getVida () {
		return puntosVida;

		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getnivelArmadura () {
		return nivelArmadura;
	}
	
	
	public void atacar (Dragon d, int puntosAtaque) {
		d.setPuntosVida(d.getVida()- puntosAtaque);
		System.out.println("El caballero " + nombre + " ataca al dragon "+ d.getNombre()+ " con un ataque de: " + puntosAtaque);
		
	}
	
	
	public void beberPoti () {
		//puntosVida = puntosVida +20;
		setpuntosVida(getVida()+20);
	}
	
	public void beberPoti (int curacion) {
		//puntosVida = puntosVida + curacion;
		setpuntosVida(getVida()+curacion);
		
	}
	
	public String toString () {
		String presentacion = " el caballero " + nombre + " tiene " +puntosVida+ " y su armadura es " +nivelArmadura;
		return presentacion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
