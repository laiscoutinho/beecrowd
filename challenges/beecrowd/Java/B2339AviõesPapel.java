import java.io.IOException;
import java.util.*;

public class B2339AviõesPapel {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    
	    int c = sc.nextInt(); //n competidores
	    int p = sc.nextInt(); // qnt folhas diretora
	    int f = sc.nextInt(); // qnt folhas competidor
	    
	    int qnt = f * c;
	    
		if(qnt <= p) System.out.println("S");
		else System.out.println("N");
		
		sc.close();
 
    }
 
}
