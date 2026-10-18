package ejercicios;

public class Planta {
	
	private String nombre;
	private int nivelAgua;
	private int altura;
	private int salud;
	
	public Planta (String nombrePlanta) {
		
		nivelAgua =40;
		altura =10;
		salud=100;
		nombre=nombrePlanta;
	}
	
	public void regar (int litrosAgua) {
		
		nivelAgua = 40 + litrosAgua*10;
		
	}
	
	public void tomarSol (int horasSol) {
		
		nivelAgua= 40-horasSol*5;
		altura= 10+horasSol*2;
		salud=100+horasSol*1;

	}
	
	public void fertilizar () {
		altura=altura+3; // también se puede poner altura+=3
		nivelAgua=nivelAgua-5;
				
	}
	
	public void mostrarEstado() {
		System.out.println("Esta es mi planta:" +nombre);
		System.out.println("Su nivel de agua:"+nivelAgua);
		System.out.println("Su altura:" +altura);
		System.out.println("Su salud:" +salud);
	}
	
	public void restarAltura (int cm) {
		altura = altura - cm;
		
	}
    
}
