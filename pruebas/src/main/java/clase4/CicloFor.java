package clase4;

public class CicloFor {

	public static void main(String[] args) {
		
		float[] alturas= new float[] {1,2};
		float aux=alturas[0];
		
		aux=alturas[1];
		
		//ciclo for
		/* primer bloque (inicio del ciclo), 
		segundo bloque (final del ciclo)
		tercer bloque(incremento)
		*/
		for(int i=0	;i<alturas.length;i++) {
			aux=alturas[i]; 
			System.out.println("Posición " + i +", val " + aux);
			
		}
		System.out.println("---------------------------------");
		for (int i=alturas.length-1;i>=0;i--) {
			aux=alturas[i];
			System.out.println("Posición " + i +", val " + aux);
		}
		
		System.out.println("FOR EACH");
		// CUANDO NO NECESITO EL INDICE (LA POSICIÓN) LA MEJOR OPCION ES EL FOR EACH
		
		for(float dato:alturas) {
			System.out.println("Valor " + dato);
		}
		
		
	}
}
