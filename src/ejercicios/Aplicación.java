package ejercicios;

public class Aplicación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Bicicleta biciRosa = new Bicicleta();
		biciRosa.mostrarVelocidad();
		biciRosa.acelerar();
		biciRosa.mostrarVelocidad(); 
		biciRosa.frenar();
		biciRosa.mostrarVelocidad();
		
		
		Coche cocheVerde = new Coche();
		cocheVerde.acelerar();
		cocheVerde.mostrarVelocidad();
		cocheVerde.frenar();
		cocheVerde.mostrarVelocidad();
		
		
		
	    CuentaCorriente tania = new CuentaCorriente(1000);
	    tania.consultarSaldo();
	    tania.ingresar(100);
	    tania.consultarSaldo();
	    tania.retirar(600);
	    tania.consultarSaldo();
		
	    
	    Mago mago = new Mago ("Arango");
	    Arquero arquero = new Arquero ("Ivan");
	    arquero.mostrarVidaArquero();
	    mago.mostrarVidaMago();
	    arquero.atacar(mago);
	    mago.mostrarVidaMago();
	    mago.atacar(arquero);
	    arquero.mostrarVidaArquero();
	    
	    
	    
	    Planta planti = new Planta ("lili");
	    planti.fertilizar();
	    planti.mostrarEstado();
	    planti.regar(25);
	    planti.mostrarEstado();
	    planti.tomarSol(10);
	    planti.mostrarEstado();
	    Planta cactus = new Planta ("cactus");
	    
	    
	    Jardinero jardi = new Jardinero ("Danio");
	    jardi.regarPlanta(planti);
	    jardi.regarPlanta(cactus);
	    cactus.mostrarEstado();
	    planti.mostrarEstado();
	    
	    Propietario prop = new Propietario (cactus);
	    prop.podar();
	    
	    cactus.mostrarEstado();
	   
	    
	    MascotaVirtual tamagotchi = new MascotaVirtual ("pikachu");
	    tamagotchi.mostrarEstado();
	    tamagotchi.comer();
	    tamagotchi.jugar(400);
	    tamagotchi.dormir(6);
	    tamagotchi.mostrarEstado();
	    tamagotchi.dormir(100);
	    tamagotchi.mostrarEstado();
	    
	    Cuidador cui = new Cuidador();
	    cui.alimentar(tamagotchi);
	    tamagotchi.mostrarEstado();
	    
	    PropietarioMascota propi = new PropietarioMascota (tamagotchi);
	    propi.jugar();
	    tamagotchi.mostrarEstado();
	    

	    
	    			
	}

}
