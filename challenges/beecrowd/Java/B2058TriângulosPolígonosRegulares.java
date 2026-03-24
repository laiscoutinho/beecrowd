import java.io.IOException;
import java.util.*;

public class B2058TriângulosPolígonosRegulares {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt(); // n lados
	    if(n >= 3){
	        System.out.println(n-2);
	    }
		
		sc.close();
 
    }
 
}
