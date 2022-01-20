package clase4;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {
		/*if(dato.substring(0,1)=="e") {
		
		}
		if(dato.charAt(0)=='e') {
			
		}
		
		if(dato.indexOf("e")==0) {
			
		}*/
	String[] nombres= new String[] {"luz"," jose","edwin","carlos","herana","samir","elsa"};	
	String[] nombresConE= new String[nombres.length];
	
	int j=0;
	
	for(int i=0; i<nombres.length;i++) {
		String nombre = nombres[i];
		
		if(nombre.startsWith("e")) {
			nombresConE[j]=nombre;
			j++;
		}
	}
	System.out.println(Arrays.toString(nombresConE));
	
	for(String nombre: nombresConE) {
		if(nombre != null) {
			System.out.println(nombre);
		}
		
		
	}
	
	}

}
