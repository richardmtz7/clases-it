package clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese una opción"
				+ "1- Alta"
				+ "2- Baja"
				+ "3- Modificar");
		int opcion=teclado.nextInt();
		/*
		if(opcion==1){
			System.out.println("Alta");
		}else if (opcion==2) {
			System.out.println("Baja");
		}else if (opcion==3) {
			System.out.println("Modificar");
		}else {
			System.out.println("Ninguna");
		}
		*/
		
		//switch
		switch (opcion) {
		case 1:
			System.out.println("Alta");
			break;
		case 2:
			System.out.println("Baja");
			break;
		case 3:
			System.out.println("Modificar");
			break;

		default:
			System.out.println("Ninguna");
			break;
		}
		
		teclado.close();
	}

}
