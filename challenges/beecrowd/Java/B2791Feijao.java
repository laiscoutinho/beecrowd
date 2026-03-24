import java.io.IOException;
import java.util.Scanner;

public class B2791Feijao {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		int qntCup = 4;
		int position = 0;
		
		for(int i=1; i<=qntCup; i++) {
			int value = sc.nextInt();
			if(value == 1) position = i;
		}
		
		System.out.println(position);
		
		sc.close();
 
    }
 
}
