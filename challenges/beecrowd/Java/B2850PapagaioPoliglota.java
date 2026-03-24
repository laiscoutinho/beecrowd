import java.util.Scanner;

public class B2850PapagaioPoliglota {  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = "esquerda", b = "direita", c = "nenhuma", d = "as duas";
		
		while (sc.hasNext()) {
			String act = sc.nextLine();
			if(a.equals(act)) System.out.println("ingles");
			else if(b.equals(act)) System.out.println("frances");
			else if(c.equals(act)) System.out.println("portugues");
			else if(d.equals(act)) System.out.println("caiu");	
		}
		
		sc.close();

	}

}
