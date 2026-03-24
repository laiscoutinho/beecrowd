import java.util.Scanner;

public class B1011Esfera {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    double n = sc.nextDouble();
	    
	    double volume = 3.14159 * (n*n*n) *(4.0/3);
	    
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}
}
