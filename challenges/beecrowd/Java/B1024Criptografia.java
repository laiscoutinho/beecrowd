import java.util.*;

public class B1024Criptografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a linha em branco

        for (int j = 0; j < n; j++) {
            // Lê a entrada
            String a = sc.nextLine();
            char[] passagem = a.toCharArray();
            
            // PASSADA 01 + PASSADA 02 (inverter e deslocar)
            int tamanho = passagem.length;
            for (int i = 0; i < tamanho / 2; i++) {
                if (Character.isLetter(passagem[i])) 
                    passagem[i] = (char)(passagem[i] + 3); 
                if (Character.isLetter(passagem[tamanho - i - 1])) 
                    passagem[tamanho - i - 1] = (char)(passagem[tamanho - i - 1] + 3); 
                
                // TROCA POSICAO
                char temp = passagem[i];
                passagem[i] = passagem[tamanho - i - 1];
                passagem[tamanho - i - 1] = temp;
            }
            
            // Se o comprimento for ímpar, o meio não foi trocado, então movemos ele
            if (tamanho % 2 != 0) {
                if (Character.isLetter(passagem[tamanho / 2])) 
                    passagem[tamanho / 2] = (char)(passagem[tamanho / 2] + 3);
            }

            // PASSADA 03
            int intervalo = tamanho / 2;
            for (int i = intervalo; i < tamanho; i++) {
                passagem[i] = (char)(passagem[i] - 1);
            }
            
            // EXIBE
            System.out.println(new String(passagem));
        }
        
        sc.close();
    }
}
