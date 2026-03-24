import java.io.IOException;
import java.util.Scanner;

public class B1013OMaior {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//valores
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior1 = (a + b + Math.abs(a - b)) / 2;
		int maior2 = (maior1 + c + Math.abs(maior1 - c)) / 2;
		
		//imprimindo
		System.out.println(maior2 + " eh o maior");
		 
		sc.close();
 
    }
 
}
