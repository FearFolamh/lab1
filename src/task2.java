import java.util.Scanner;
import static java.lang.Math.*;


public class task2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a и b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mn = min(a,b);
        int mx = max(a,b);
        double d = (pow(mx,5)-3.2*mn)/(1+mn);
        System.out.println(d);
    }

}