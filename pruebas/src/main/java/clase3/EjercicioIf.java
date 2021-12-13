package clase3;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
	
		//Dado 3 numeros, averiguar cual es el mayor
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		double num1=teclado.nextDouble();
		System.out.println("Ingrese el segundo numero");
		double num2=teclado.nextDouble();
		System.out.println("Ingrese el segundo numero");
		double num3=teclado.nextDouble();
		
		if (num1>num2 && num1>num3) {
			System.out.println("El numero mayor es: " + num1);
		}else if (num2>num1 && num2>num3) {
			System.out.println("El numero mayor es: " + num2);
		}else {
			System.out.println("El numero mayor es: " + num3);
		}
		teclado.close();
	}

}
