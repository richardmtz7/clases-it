package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {
		//Solicitar al usuario la cantidad de registros 
		// cargar en un vector de enteros los datos del usuario 
		// contar la cantidad de numeros pares
		//contar la cantidad de numeros impares
		// sumar los numeros pares
		// sumar los numeros impares
		// promedio de los valores ingresados
		
		int cantidadRegistros;
		int[] vector;
		int CantPares=0;
		int CantImpares=0;
		int sumaPares=0;
		int sumaImpares=0;
		double promedio;
		
		//definir el tamaño del vector
		//1 carga de datos
		//2 procesamiento
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la cantidad de registros a procesar:");
			cantidadRegistros = teclado.nextInt();
		}while(cantidadRegistros<=0);
		
		vector = new int[cantidadRegistros];
	
		//carga de datos
		
		for(int i=0;i<cantidadRegistros;i++ ) {
			System.out.println("Ingrese un dato: ");
			int datoleido=teclado.nextInt();
			vector[i]=datoleido;	
		}
		//Procesamiento del vector
	
		for(int dato:vector) {
			if(dato % 2 == 0) {
				CantPares++;
				sumaPares+=dato;
			}else {
			CantImpares++;
			sumaImpares+=dato;
			}
		}
		//promedio=suma/cantidad de registros
		
		promedio=(double) (sumaImpares+sumaPares)/(CantImpares+CantPares);
		
		//mostrar datos calculados
		
		System.out.println("Cantidad de registros: "+ cantidadRegistros);
		System.out.println("Cantidad de pares: "+ CantPares);
		System.out.println("Cantidad de impares: "+ CantImpares);
		System.out.println("Suma de impares: "+ sumaImpares);
		System.out.println("Suma de pares: "+ sumaPares);
		System.out.println("Promedio: "+ promedio);
		
	
		teclado.close();		
	}

}
