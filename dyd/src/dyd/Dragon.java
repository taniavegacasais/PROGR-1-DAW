package dyd;

public class Dragon {
	
	private String nombre;
	private int puntosVida;
	
	
	
	public Dragon (String nombre) {
		this.nombre=nombre;
		puntosVida=200;
		
		System.out.println ("Se crea el dragon: "+nombre);
	}
	
	public void atacar (Caballero c, int puntosAtaque) { 
		c.setpuntosVida(c.getVida()-puntosAtaque + c.getnivelArmadura());
	    System.out.println("El dragon : "+nombre+  " ataca a " +c.getNombre()+  " con "  +puntosAtaque+ " de ataque");
	   
	    
	 }
	
	public String getNombre () {
		return nombre;
	}

	public int getVida () {
		return puntosVida;
	}
	
	public void setPuntosVida (int puntosVida) {
		this.puntosVida = puntosVida;
		System.out.println("Estos son los puntos de vida del dragon: "+this.puntosVida);
		}
	
	
	public String toString ( ) {
		String presentacion = "Este es el dragon " +nombre+ " y tiene " +puntosVida;
		return presentacion;
	}
	
}


