import java.io.IOException;
import java.util.Scanner;

public class B2344Notas_da_Prova {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//recebe nota
		int n = sc.nextInt();
		//verifica
		if (n >= 86) System.out.println("A");
		if (n >=61 && n <= 85) System.out.println("B");
		if (n >= 36 && n <= 60) System.out.println("C");
		if (n >= 1 && n <= 35) System.out.println("D");
		if (n == 0) System.out.println("E");
		
		sc.close();
 
    }
 
}
