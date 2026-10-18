package ejercicios;

public class CuentaCorriente {
	
	
	private int dinero;
	
	
	public CuentaCorriente (int ingresoInicial) {
		dinero = ingresoInicial;
	}
	
	public int ingresar(int cantidadDinero) {
		dinero = dinero + cantidadDinero;
		return dinero;
	}
	
	public int retirar(int cantidadDinero) {
		dinero = dinero - cantidadDinero;
		return dinero;
	}
	
	public void consultarSaldo() {
		System.out.println ("Saldo total: " + dinero);
	}
	
	
	public int getSaldo() {
		return dinero;
		
	}
	
    
    }
	
	
