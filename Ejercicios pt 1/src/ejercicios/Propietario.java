package ejercicios;

public class Propietario {
 
	private Planta planta;

	
	public Propietario (Planta planta) {
		this.planta = planta; // Tambien puedo cambiar el nombre de la planta del constructor.
	}
	
	public void podar () {
		planta.restarAltura(5);
		
	}
	
}
