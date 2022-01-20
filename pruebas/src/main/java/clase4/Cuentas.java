package clase4;

import java.util.Arrays;

public class Cuentas {

	public static void main(String[] args) {
		
		String[] archivo= new String []{
				"1000; Juan Lopez; 1500; ca",
				"2000; Jose Guzman; 115000; ca",
				"3000; Juan Montoya; -1000;cc",
				"4000; Matias Perez; 100000; cc",
				"5000; Elsa Moyano; 21000; cc"};
		//obtener las cuentas con saldo negativo con apyn
		//obtener las cuentas con saldo > 100000 con apyn
		
		Object[][] resultado = new Object[5][2];
				
		//separar por ;
		
		//for(String registro : archivo) {
		for(int i=0; i< archivo.length; i++) {
			String registro = archivo[i];
			
			String[] cuenta = registro.split(";");
			Integer numCuenta = Integer.parseInt(cuenta[0]);
			String apyn = cuenta[1];
			Double saldo = Double.parseDouble(cuenta[2]);
			String tipo = cuenta[3];
			
			
			if(saldo <0) {
				resultado[i][0] = saldo;
				resultado[i][1] = apyn;
			}
			if(saldo>=100000) {
				resultado[i][0] = saldo;
				resultado[i][1] = apyn;	
			}
		}
		
		for(int f=0; f< resultado.length ;f++) {
			for(int c=0; c<resultado[f].length;c++) {
				if(resultado[f][c] !=null) {
				System.out.println(resultado[f][c]);
				
				}
			}
			System.out.println("-------------------");
		}
	}

}
