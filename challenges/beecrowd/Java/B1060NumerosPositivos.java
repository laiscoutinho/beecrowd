
import java.util.Scanner;

public class B1060NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float v[] = new float[6];
		int cont = 0;
		
		for(int i=0; i<6; i++) {
			v[i] = sc.nextFloat();
			if(v[i]>0) {
				cont++;
			}
		}
		
		System.out.println(cont + " valores positivos");

		sc.close();
	}

}
