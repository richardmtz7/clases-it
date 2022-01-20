package clase4;

public class VectorObject {

	public static void main(String[] args) {
		// object es la base de todos los tipos de java, se puede agregar cualquier dato
		Object edad=10;
		Object nombres= "Carlos";
		Object flag= true;
		Object letra='a';
		
		
		Object[] datos= new Object[] {edad, nombres, flag,letra};
		
		//detemerminar que datos son de tipo boolean
		
		for(Object dato : datos) {
			if(dato instanceof Boolean) {
				//casteo
				Boolean aux = (Boolean)dato;
				//api reflection
				System.out.println("Encontre!");
			}
			
		}
	}

}
