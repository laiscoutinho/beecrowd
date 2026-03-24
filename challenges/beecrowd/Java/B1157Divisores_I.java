import java.io.IOException;
import java.util.*;

public class B1157Divisores_I { 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // n lados
	    for(int i=1;i<=n;i++){
	        int result = n%i;
	        if(result == 0) System.out.println(i);
	    }
		sc.close();
 
    }
 
}
