package dyd;

public class Aplicacion {
	public Aplicacion () {
	
		Caballero c = new Caballero("knight");
		Dragon d = new Dragon ("Dragoncito");
		c.atacar(d, 50);
		d.atacar(c, 80);
		System.out.println (c);
		System.out.println (d.toString());
		c.beberPoti(90);
		d.atacar(c, 60);
		System.out.println (c.toString());
		c.atacar(d, 20);
		d.atacar(c, 50);
		System.out.println (c.toString());
		System.out.println (d.toString());
		c.atacar(d, 15);
		d.atacar(c, 10);
		System.out.println (c.toString());
		System.out.println (d.toString());
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aplicacion api = new Aplicacion ();

	}

}
