package Clase6;

public class CalculadoraMain {

	public static void main(String[] args) {
		
		//como uso la calculadora
		//crear una calculadora
		//usar sus funciones
		
		//variables primitivas
		int a=10;
		int b= 30;
		boolean flag = true;
		float altura=185;
		
		//creando un objeto de la clase calculadora
		Calculadora miCalculadora = new Calculadora();
		
		//ejecutar las funciones de la calculadora
		double suma=miCalculadora.sumar(a, b);
		
		System.out.println("La suma de a y b es: " + suma);
		
	}

}
