package ejercicios;

public class Jardinero {
 private int aguaRegadera;
 private String nombre;
 
 public Jardinero (String nombreJardinero) {
	 
   nombre=nombreJardinero;
   aguaRegadera=5;  
 }
   
 public void regarPlanta (Planta planta) {
	 planta.regar(aguaRegadera);
	 
 }
 
 public void fertilizarPlanta (Planta planta) {
	 planta.fertilizar();
 }
 

 
 }
 
 
 

