import java.util.Scanner;

public class B1016Distancia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int xvm=60, yvm=90;
		int dist;
		
		dist = sc.nextInt();
		
		int minutos = dist*2;
		System.out.println(minutos + " minutos");
		
		sc.close();
	}

}
