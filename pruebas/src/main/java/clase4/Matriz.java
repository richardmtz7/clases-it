package clase4;

public class Matriz {

	public static void main(String[] args) {
		int canFilas=2;
		int canCols=2;
		Integer[][] matriz = new Integer[canFilas][canCols];
		
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		
		// se carga la matriz
		
		for(int fila=0;fila<canFilas; fila++) {
			for(int columna=0; columna<canCols; columna++) {
				matriz[fila][columna]= (fila+columna);
			}
		}
		
		//muestra
		for(int fila=0;fila<canFilas; fila++) {
			for(int columna=0; columna<canCols; columna++) {
				System.out.println(fila+"-"+columna+"-"+ matriz[fila][columna]);
				
			}
		}
	}

}
