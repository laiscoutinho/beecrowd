import java.io.IOException;
import java.util.Scanner;

public class B2936QuantaMandioca {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		
		int FOLCLORE = 5;
		int qnt = 225;
		
		for(int i=1; i<=FOLCLORE; i++) {
			int porcao = sc.nextInt();
			switch(i) {
			case 1: qnt += porcao * 300; break;
			case 2: qnt += porcao * 1500; break;
			case 3: qnt += porcao * 600; break;
			case 4: qnt += porcao * 1000; break;
			case 5: qnt += porcao * 150; break;
			}
		}
		System.out.println(qnt);
		
		sc.close();
    }
 
}
