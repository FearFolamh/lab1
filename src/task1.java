import java.util.Scanner;
//import static java.lang.Math.*;

public class task1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x и y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>y)
        {
            x = x * 5;
            System.out.println("Большее значение * 5 = " + x);
        }
        if (x<y)
        {
            y = y * 5;
            System.out.println("Большее значение * 5 = " + y);
        }
        if (x==y)
            System.out.println("Значения x и y равны");

    }
}
