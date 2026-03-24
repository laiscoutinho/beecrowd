import java.io.IOException;
import java.util.*;

public class B2388Tacografo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt(); // qnt intervalos tempo tacografo
	    int dist = 0;
	    
	    for(int i=0; i<n; i++){
	        int t = sc.nextInt(); // tempo horas
	        int v = sc.nextInt(); // velocidade media no intervalo
	        dist += (t * v);
	    }
		System.out.println(dist);
		sc.close();
 
    }
 
}
