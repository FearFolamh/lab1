import java.util.Scanner;
//import static java.lang.Math.*;

public class task1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>y)
        {
            x = x * 5;
            System.out.println(x);
        }
        if (x<y)
        {
            y = y * 5;
            System.out.println(y);
        }

    }
}
