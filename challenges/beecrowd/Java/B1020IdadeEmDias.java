import java.util.Scanner;

public class B1020IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade_dias, anos, meses, dias;
		
		System.out.println("Qual sua idade em dias?");
		idade_dias = sc.nextInt();
		
		anos = idade_dias/(365);
		
		int rest = idade_dias%(365);
		meses = rest/(30);
		
		dias = idade_dias - (365*anos + 30*meses);
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
