import java.io.IOException;
import java.util.Scanner;

public class B1006Media2 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		//notas
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		//calculando a media
		double media = ((2 * a) + (3 * b) + (5 * c))/10;
		System.out.printf("MEDIA = %.1f%n", media);
		 
		sc.close();
 
    }
 
}
