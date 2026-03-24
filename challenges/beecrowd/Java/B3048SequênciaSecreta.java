import java.io.IOException;
import java.util.Scanner;

public class B3048SequênciaSecreta {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //  tam sequencia
		int qnt = 1; 
		int[] seq = new int[n];
		
		if(n >= 3 && n <= 500) {
			for(int i=0; i<n; i++) {
				int v = sc.nextInt(); // sequencia desenhada no chao
				if(v == 1 || v == 2) seq[i] = v;
			}
		}
		for(int i=1; i<n; i++) {
			if(seq[i] != seq[i-1]) qnt++;
		} 
		
		System.out.println(qnt);
		
		sc.close();
    }
 
}
