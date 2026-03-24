import java.io.IOException;
import java.util.*;

public class B2455Gangorra {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    int p1 = sc.nextInt();
	    int c1 = sc.nextInt();
	    int p2 = sc.nextInt();
	    int c2 = sc.nextInt();
	    if(p1>=10 && p1<=100 && c1>=10 && c1<=100 && p2>=10 && p2<=100 && c2>=10 && c2<=100){
	        int esq = p1*c1;
	        int dir = p2*c2;
	        if(esq == dir) System.out.println("0");
	        else if(esq > dir) System.out.println("-1");
	        else if(esq < dir) System.out.println("1");
	    }
	    
		sc.close();
 
    }
 
}
