import java.io.IOException;
import java.util.*;

public class B3055NotaEsquecida {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // nota prova
        int m = sc.nextInt(); // media
        int b = (m*2) - a;
        System.out.println(b);
        sc.close();
    }
 
}
