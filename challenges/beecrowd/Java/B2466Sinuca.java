import java.io.IOException;
import java.util.*;

public class B2466Sinuca {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int []cor = new int[n];
	    
	    for(int i=0;i<n;i++){
            cor[i] = sc.nextInt();
        }
        
        String ultimaCor = descobreCor(cor, n);
        System.out.println(ultimaCor);
        sc.close();
 
    }
    public static String descobreCor(int[]cor, int n){
	    if(n == 1) return cor[0] == 1 ? "preta" : "branca";
	    
	    int[] novaCor = new int[n - 1];
	    
	    for(int i=0;i<n-1; i++){
	       if(cor[i] == cor[i+1]) novaCor[i] = 1; 
	       else novaCor[i] = -1; 
	    }
	    
	    return descobreCor(novaCor, n - 1);
	}
}
