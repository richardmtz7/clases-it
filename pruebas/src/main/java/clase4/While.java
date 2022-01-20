package clase4;

public class While {

	public static void main(String[] args) {
		
		short[] edades=new short[] {10,5,25};
		
		// defino i por fuera
		int i=0;
		
		while(i<edades.length) {
		
			System.out.println("Posicion " + i + "Val " + edades[i]);
			i++;
	
		}
		System.out.println("-----------------------------------");
		i=edades.length-1;
		while(i>=0) {
			System.out.println("Posicion " + i + "Val " + edades[i]);
			i--;
		}
	}

}
