package Clase6;

public class ProgramaAuto {

	public static void main(String[] args) {
		
		//instanciar un objeto de la clase Auto
		
		Auto miClio = null;//constructor
		
		miClio = new Auto("Renault", "clio mio", 178);
		miClio.detalleAuto();
		
		miClio.encender();
		miClio.detalleAuto();
		
		miClio.acelerar();
 		miClio.detalleAuto();
 		
 		miClio.apagar();
 		miClio.detalleAuto();
 		
 		miClio = null;
	}

}
