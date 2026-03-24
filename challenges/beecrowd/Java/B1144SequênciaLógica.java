import java.io.IOException;
import java.util.*;

public class B1144SequênciaLógica {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a = i*i;
            int b = i*i*i;
            System.out.println(i + " " + a + " " + b);
            System.out.println(i + " " + (a+1) + " " + (b+1));
        }
        sc.close();
    }
}
   
