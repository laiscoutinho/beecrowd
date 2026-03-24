import java.io.IOException;
import java.util.Scanner;

public class B2061AsAbasPéricles {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        String fechou = "fechou";
        String clicou = "clicou";
        
        for (int i = 0; i < m; i++) {
            String ato = sc.next();
            if (ato.equals(fechou))n += 1; 
            else if (ato.equals(clicou)) {
                n -= 1; 
                if (n < 0) n = 0; 
            }
        }
        
        System.out.println(n);
        
        sc.close();
 
    }
 
}
