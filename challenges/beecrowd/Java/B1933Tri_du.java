import java.io.IOException;
import java.util.*;

public class B1933Tri_du {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    if(a>=1 && a<=13 && b>=1 && b<=13){
	        if(a > b) System.out.println(a);
	        else if(a < b) System.out.println(b);
	        else if(a == b) System.out.println(a);
	    }
		sc.close();
 
    }
 
}
