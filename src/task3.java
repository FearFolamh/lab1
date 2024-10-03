import java.util.Scanner;
import static java.lang.Math.*;


public class task3 {
    public static void main(String[] args) {

        {
            double Y = 0;
            double F = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите x");
            int x = sc.nextInt();
            if (x <= -3) {
                Y = pow(x, 3) + 1;
                F = pow(E, sin(x));
            } else if (x <= 4) {
                Y = x * (1 + pow(2, x));
                F = pow(x, 4);
            } else if (x > 4) {
                Y = tan(x);
                F = pow(tan(x), 0.2);
            }
            System.out.println(Y);
            System.out.println(F);
        }
    }
}