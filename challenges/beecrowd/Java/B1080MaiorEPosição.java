
import java.util.Scanner;

public class B1080MaiorEPosição {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v[] = new int[100];
		int maior = 0, posi = 0;
		
		for(int i=0; i<8; i++) {
			v[i] = sc.nextInt();
			if(i==0) {
				maior = v[i];
				posi = (i+1);
			} else {
				if(v[i]>maior) {
					maior = v[i];
					posi = (i+1);
				}
			}
		}
		
		System.out.println(maior);
		System.out.println(posi);

		sc.close();
	}

}
