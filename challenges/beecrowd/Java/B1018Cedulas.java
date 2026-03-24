import java.util.Scanner;

public class B1018Cedulas {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int total;
	    
	    int n100 = n/100;
	    int n50 = (n - (100*n100))/50; 
	    total = 50*n50 + 100*n100;
	    int n20 = (n - total)/20; 
	    total = 20*n20 + 50*n50 + 100*n100;
	    int n10 = (n - total)/10; //6
	    total = 10*n10 + 20*n20 + 50*n50 + 100*n100;
	    int n5 = (n - (total))/5;
	    total = 5*n5 + 10*n10 + 20*n20 + 50*n50 + 100*n100;
	    int n2 = (n - total)/2;
	    total = 2*n2 + 5*n5 + 10*n10 + 20*n20 + 50*n50 + 100*n100;
	    
	    int n1 = n - total;
	    
		System.out.println(n);
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");
		
		sc.close();
	}
}
