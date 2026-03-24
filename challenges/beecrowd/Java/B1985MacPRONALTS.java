import java.io.IOException;
import java.util.*;

public class B1985MacPRONALTS {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double value = 0;
        for(int i=0;i<p;i++){
            int cod = sc.nextInt();
            int q = sc.nextInt();
            switch(cod){
                case 1001: value += q * 1.5; break;
                case 1002: value += q * 2.5; break;
                case 1003: value += q * 3.5; break;
                case 1004: value += q * 4.5; break;
                case 1005: value += q * 5.5; break;
            }
        }
        System.out.printf("%.2f\n", value);
        sc.close();
    }
}
   
