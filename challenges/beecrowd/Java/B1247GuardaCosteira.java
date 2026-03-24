import java.io.IOException;
import java.util.Scanner;

public class B1247GuardaCosteira {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int d, vf, vg;
        double timef, timeg;

        while (sc.hasNext()) {
            d = sc.nextInt(); 
            vf = sc.nextInt(); 
            vg = sc.nextInt();

            double hip = Math.sqrt((12 * 12) + (d * d));
            timef = 12.0 / vf;
            timeg = hip / vg;   
            
            if (timeg <= timef) System.out.println("S");
            else System.out.println("N");
        }

        sc.close();
    }
}
