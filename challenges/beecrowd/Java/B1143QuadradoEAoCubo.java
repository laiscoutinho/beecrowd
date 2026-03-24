import java.io.IOException;
import java.util.Scanner;

public class B1143QuadradoEAoCubo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=1 ; i<=n; i++){
		    System.out.printf("%d %d %d%n", i, i*i, i*i*i);
		}
		
		sc.close();
 
    }
 
}
