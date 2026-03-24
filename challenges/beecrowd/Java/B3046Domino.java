import java.io.IOException;
import java.util.*;

public class B3046Domino {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int p = (int)((n+1)*(n+2))/2;
        System.out.println(p);
        sc.close();
    }
 
}
