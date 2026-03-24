import java.util.Scanner;

public class B1093Vampiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ev1 = sc.nextInt();
            int ev2 = sc.nextInt();
            int at = sc.nextInt();
            int d = sc.nextInt();

            if (ev1 == 0 && ev2 == 0 && at == 0 && d == 0) break;

            ev1 = (ev1 + d - 1) / d; // Divide e arredonda para cima
            ev2 = (ev2 + d - 1) / d; // Divide e arredonda para cima

            double probability;

            if (at == 3) {
                probability = (double) ev1 / (ev1 + ev2);
            } else {
                double ratio = 1.0 - (6 - at) / 6.0;
                double dFactor = (1 - ratio) / ratio;
                probability = (1.0 - Math.pow(dFactor, ev1)) / (1.0 - Math.pow(dFactor, ev1 + ev2));
            }

            System.out.printf("%.1f%n", probability * 100);
        }

        sc.close();
    }
}
