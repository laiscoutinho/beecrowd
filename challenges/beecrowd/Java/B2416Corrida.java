import java.io.IOException;
import java.util.Scanner;

public class B2416Corrida {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); // metros p correr
		int n = sc.nextInt(); // tam pista
		int pTermino = c % n;
		
		System.out.println(pTermino);
		
		sc.close();
    }
 
}
