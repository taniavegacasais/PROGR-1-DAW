package ejercicios;

public class PropietarioMascota {
	
	private MascotaVirtual mascotita;
	 
	public PropietarioMascota (MascotaVirtual mascota){
		
		 mascotita= mascota;
		
		
	}
	
	public void jugar () {
		mascotita.jugar(20);
	}
	

}
