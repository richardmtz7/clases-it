package clase4;

public class CicloForConBreak {

	public static void main(String[] args) {

		int []datos=new int[] {10,0,15};
		
		//break
		for(int dato:datos) {
			if(dato==0) {
				break;
			}
			System.out.println("dato "+ dato);
		}
		
		//continue
		
		for(int dato: datos) {
			if(dato ==0 ) {
				continue;
			}
			System.out.println("dato: "+ dato);
		}
		
		
		System.out.println("Fin");
	}

}
