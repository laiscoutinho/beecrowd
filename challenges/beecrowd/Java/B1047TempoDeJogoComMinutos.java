import java.io.IOException;
import java.util.Scanner;

public class B1047TempoDeJogoComMinutos {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int initialHour = sc.nextInt();
        int initialMin = sc.nextInt();
        int finalHour = sc.nextInt();
        int finalMin = sc.nextInt();
        
        int durationHour = 0;
        int durationMin = 0;
        
        // Cálculo dos minutos
        durationMin = finalMin - initialMin;
        if (durationMin < 0) {
            durationMin += 60;
            finalHour -= 1; // "Empresta" uma hora
        }
        
        // Cálculo das horas
        durationHour = finalHour - initialHour;
        if (durationHour < 0) durationHour += 24; 
        
        // Se a duração for zero (horas e minutos), ajusta para 24 horas
        if (durationHour == 0 && durationMin == 0) durationHour = 24;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", durationHour, durationMin);
        
        sc.close();
    }
}
