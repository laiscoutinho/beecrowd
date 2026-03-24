import java.io.IOException;
import java.util.Scanner;

public class B1014Consumo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//distancia
		int x = sc.nextInt();
		//combustivel gasto
		double y = sc.nextDouble();
		System.out.printf("%.3f km/l%n", x/y);
		 
		sc.close();
 
    }
 
}
