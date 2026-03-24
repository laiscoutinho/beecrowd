import java.util.*;

public class B1035TesteDeSeleção_1 {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();

		sc.close();
	    
	    int s1 = c + d;
	    int s2 = a + b;
	    
	    if(b > c && d > a && c > 0 && d > 0 && (a%2)==0 && s1 > s2)
	        System.out.println("Valores aceitos"); 
	    else
	        System.out.println("Valores nao aceitos");
		
	}
}
