package clase4;

public class Array {

	public static void main(String[] args) {
		int[] edades= new int [2];
		
		edades[0]=13;
		edades[1]=17; 
		
		int tamanio=edades.length;
		
		int edad=edades[tamanio-1]; 
		System.out.println(edad);
	}

}
