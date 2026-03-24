import java.util.Scanner;

public class B2434SaldoVovo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//dias
		int n = sc.nextInt();
		//saldo
		double s = sc.nextDouble();
		//verificação
		double menorSaldo = 0;
		for (int i=0; i<n; i++){
		    double banco = sc.nextDouble();
		    s += banco;
		    if(i == 0) menorSaldo = s;
		    else if(s < menorSaldo) menorSaldo = s;
		}
		System.out.println(menorSaldo);
		 
		sc.close();
		
	}
}
