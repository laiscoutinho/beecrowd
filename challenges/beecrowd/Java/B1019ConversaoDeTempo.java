import java.util.Scanner;

public class B1019ConversaoDeTempo {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int minutos = 0;
	    int horas = 0;
	    if (n >= 60){
	        minutos = n / 60;
	        n = n - minutos * 60;
	    }
	    if (minutos >= 60){
	        horas = minutos / 60;
	        minutos = minutos - horas * 60;
	    }
	    System.out.println(horas + ":" + minutos + ":" + n);
	    
	    sc.close();
	}
}
