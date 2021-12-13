package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese se edad");
		
		int edad=teclado.nextInt();
		if (edad>=18) {
			System.out.println("Mayor de edad");
			
		}else {
			System.out.println("Menor de edad");
		}
		teclado.close();	
	}

}
