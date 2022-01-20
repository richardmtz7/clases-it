package clase4;

import java.util.Arrays;

public class Vectores2 {

	public static void main(String[] args) {
		String[] nombres= new String[] {"luz"," jose","edwin","carlos","herana","samir","elsa"};
		
		//determinar la cantidad de nombres que inicen con e
		// creamos el vector con dicho tamaño
		int cantidad= 0;
		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				cantidad ++;	
			}
		}
		String [] nombresConE = new String[cantidad];
		
		int pos=0;  
		
		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				nombresConE[pos]=nombre;
				pos ++; 
			}

		}
		System.out.println(Arrays.toString(nombresConE));
	}
}