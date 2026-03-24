import java.io.IOException;
import java.util.*;

public class B2172Evento {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 1;
        int m = 1;
        while(x != 0 && m != 0){
            x = sc.nextInt(); // valor aumento 
            m = sc.nextInt(); //valor atual
            if(x==0 && m==0) break;
            int e = x*m; // novo exp
            System.out.println(e);
        }
        
        sc.close();
    }
 
}
