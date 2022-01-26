package practicaAdicionalSemana3;

import java.util.Scanner;

public class PracticaSemana3 {

	
	
	public static void inicializar(double notas[], String alumnos[], Scanner teclado)
	{
	

		for(int i = 0; i < notas.length; i++) {
			System.out.println("Ingrese el nombre y apellido del alumno " + i);
			alumnos[i] = teclado.next();
			System.out.println("Ingrese las notas del alumno >=0 y <=10 "+ i);
			notas[i]=teclado.nextDouble();	
		}
	}
	
	public static double promedio(double notas[])
	{
		double prom;
		double suma = 0;
		for(int i=0; i<notas.length; i++) 
			suma += notas[i];
			prom = suma / notas.length;
			return prom;
	}
	
	public static void imprimir(double notas[], String alumnos[], double promedio)

	{
		System.out.printf("%-15s %-15s%n%n", "Alumnos", "Notas");
		for(int i=0; i<notas.length;i++) {
			System.out.printf("%-15s %-15f%n", alumnos[i], notas[i]);
			
		}
		System.out.println("El promedio es: " + promedio);
	}
	
	public static void mayor(double notas[], String alumnos[])
	{
		double mayor=notas[0];
		String alumno = null;
		
		for(int i=0; i<notas.length;i++) {
			if(notas[i]>mayor) {
				mayor=notas[i];
				alumno = alumnos[i];	
			}
			
		}
		System.out.println("La calificacion mas alta fue " + mayor);
		System.out.println("El alumno con la nota mas alta fue "+ alumno);
	}
	
	public static void menor(double notas[], String alumnos[])

	{
		double menor= notas[0];
		String alum = null;
		for(int i=0; i<notas.length;i++) {
			if(notas[i]<menor) {
				menor=notas[i];
				alum=alumnos[i];
			}
			
		}
		System.out.println("La calificación mas baja fue " + menor);
		System.out.println("El alumno con la nota mas baja fue: " + alum);
	}
	
	public static void reprueban(double notas[], String alumnos[])
	{
		String aprobados = null;
		String estReprobados = null;
		for(int i=0; i<notas.length;i++) {
			if(notas[i]<7) {
				estReprobados=alumnos[i]+estReprobados;
			}else {
				if(notas[i]>=7) {
					aprobados=alumnos[i]+aprobados;
				}
			}
		}
		System.out.println("Los estudiantes aprobados fueron: " + aprobados);
		System.out.println("Los estudiantes reprobados fueron: " + estReprobados);
		
	}


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);

		double notas[];
		String alumnos[];
		int cantAlumnos;
		double promedio;
		
		
		System.out.println("Ingrese la cantidad de alumnos: ");
		cantAlumnos=teclado.nextInt();
		
		notas = new double[cantAlumnos];
		alumnos = new String[cantAlumnos];
		
		inicializar(notas, alumnos,teclado);
		promedio = promedio(notas);
		imprimir (notas, alumnos, promedio);
		mayor(notas,alumnos);
		menor(notas, alumnos);
		reprueban(notas, alumnos);
	}
}
