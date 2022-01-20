package Clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		
		//invocar el procedimiento
		saludar("como estas");
		
		responder("Bien, gracias");
		
		//calcular la suma de las variables
		//asignar el valor de retorno de una funcion a una variable tipo int
		int a = 10;
		int b = 20;
		int c = sumar(a,b);
		
	}
	
	
	static int sumar(int a, int b) {
		
		return a+b;
	}
	
	private static void responder(String saludo) {
		System.out.println(saludo);
	}


	//procedimiento 
	static void saludar(String saludo) {
		System.out.println("Hola " + saludo);
		
	}
}
