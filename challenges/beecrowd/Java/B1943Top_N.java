import java.io.IOException;
import java.util.Scanner;

public class B1943Top_N {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int categoria = 25;
		
		if(k==1) categoria = 1;
		if(k>=2 && k<=3) categoria = 3;
		if(k>=4 && k<=5) categoria = 5;
		if(k>=6 && k<=10) categoria = 10;
		if(k>11 && k<=25) categoria = 25;
		if(k>=26 && k<=50) categoria = 50;
		if(k>=51 && k<=100) categoria = 100;
		
		System.out.println("Top " + categoria);
		
		sc.close();
 
    }
 
}
