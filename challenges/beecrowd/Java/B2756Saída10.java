import java.io.IOException;
import java.util.*;

public class B2756Saída10 {
 
    public static void main(String[] args) throws IOException {
 
        int qntEspacoDentro = 1;
	    int qntEspaco = 6;
	    int qntLetra = 5;
	    char[] letras = {'A', 'B', 'C', 'D', 'E'};
	     
	    for(int i=0;i<qntLetra;i++){
	        for(int j=qntEspaco;j>=0;j--){
	            System.out.print(" ");
	        }
	        if(i==0) System.out.println(letras[i]);
	        else {
	            System.out.print(letras[i]);
	            for(int h=0;h<qntEspacoDentro;h++){
	                System.out.print(" ");
	            }
	            System.out.println(letras[i]);
	            qntEspacoDentro += 2;
	        }
	        qntEspaco--;
	    }
	    
	    for(int i=(qntLetra-2);i>=0;i--){
	        for(int h=0;h<(qntEspaco+3);h++){
	           System.out.print(" ");
	       }
	        if(i==0) System.out.println(letras[i]);
	        else {
	            System.out.print(letras[i]);
	            for(int h=(qntEspacoDentro-5);h>=0;h--){
	                System.out.print(" ");
	            }
	            System.out.println(letras[i]);
	            qntEspacoDentro -= 2;
	        }
	        qntEspaco++;
	    }
 
    }
 
}
