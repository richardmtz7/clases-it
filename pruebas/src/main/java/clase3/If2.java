package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su usuario");
		String usuario=teclado.next();
		System.out.println("Ingrese su contraseña");
		String contraseniaa=teclado.next();
		
		if (contraseniaa=="1234" && usuario == "admin") {
			System.out.println("Welcome");
			
		}else {
			System.err.println("Fail");
		}
		teclado.close();	
	}

}
