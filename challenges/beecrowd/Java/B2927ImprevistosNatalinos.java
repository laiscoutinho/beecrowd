import java.io.IOException;
import java.util.*;

public class B2927ImprevistosNatalinos {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // alunos
        int c = sc.nextInt(); // pc
        int x = sc.nextInt(); // pc queimados
        int y = sc.nextInt(); // pc sem compilador
        
        int disponivelTotal = c - x - y - 1;
        
        if((a > disponivelTotal) && (x > (y/2))) System.out.println("Caio, a culpa eh sua!");
        else if(a > disponivelTotal) System.out.println("Igor bolado!");
        else if(a <= disponivelTotal) System.out.println("Igor feliz!");
        
        sc.close();
        
    }
 
}
