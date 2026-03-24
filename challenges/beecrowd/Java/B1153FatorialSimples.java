import java.io.IOException;
import java.util.Scanner;
 
public class B1153FatorialSimples {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 0;
		for (int i=n ; i>0; i--){
		    if (i == n)
		        fat = n;
		    else
		        fat = fat * (n-i);
		}
		System.out.println(fat);
		
		sc.close();
 
    }
 }
