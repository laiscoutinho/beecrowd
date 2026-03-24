import java.io.IOException;
import java.util.Scanner;

public class B2006IdentificandoCha {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
       //tipo de cha
		int t = sc.nextInt();
		//obtendo e verificando respostas
		int[] vec = new int[5];
		int sum = 0;
		for (int i=0; i<=4 ;i++){
		    vec[i] = sc.nextInt();
		    if(vec[i] == t) sum++;
		}
		System.out.println(sum);
		
		sc.close();
 
    }
 
}
