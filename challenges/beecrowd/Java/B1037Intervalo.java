import java.util.Scanner;

public class B1037Intervalo {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double n = sc.nextDouble();
	    if (n >= 0 && n <=25) System.out.println("Intervalo [0,25]");
	    if (n > 25 && n <= 50) System.out.println("Intervalo (25,50]");
	    if (n > 50 && n <= 25) System.out.println("Intervalo (50,75]");
	    if (n > 75 && n <= 100) System.out.println("Intervalo (75,100]");
	    if (n < 0 || n > 100) System.out.println("Fora de intervalo");
	    
	    sc.close();
	}
}
