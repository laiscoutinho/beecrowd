import java.util.Scanner;

public class B1017GastoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int km = 12;
		int tempo, vm;
		float litros;
		
		tempo = sc.nextInt();
		vm = sc.nextInt();
		
		float distancia = vm/tempo;
		
		litros = distancia*km;
		
		System.out.println(String.format("%.3f", litros));
		
		sc.close();
	}

}
