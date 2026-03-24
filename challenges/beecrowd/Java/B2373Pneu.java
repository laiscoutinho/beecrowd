import java.io.IOException;
import java.util.Scanner;

public class B2373Pneu {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//pressao desejada
		int n = sc.nextInt();
		//pressao lida pela bomba
		int m = sc.nextInt();
		System.out.println(n-m);
		
		sc.close();
 
    }
 
}
