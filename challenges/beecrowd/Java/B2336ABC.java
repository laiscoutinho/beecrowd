import java.util.Scanner;

public class B2336ABC {

	public static void main(String[] args) {
		final int MOD = 1000000007, BASE = 26;
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();  
            long result = 0;
            for (int i = 0; i < s.length(); i++) {
                result = (result * BASE + (s.charAt(i) - 'A')) % MOD;
            }
            System.out.println(result);
        }
        
        sc.close();
	}
}
