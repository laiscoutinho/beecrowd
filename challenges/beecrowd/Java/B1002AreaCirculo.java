import java.io.IOException;
import java.util.Scanner;

public class B1002AreaCirculo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//valores
		double raio = sc.nextDouble();
		
		double circulo = 3.14159 * (raio * raio);
		
		//imprimindo
		System.out.printf("A=%.4f%n", circulo);
		 
		sc.close();
 
    }
 
}
