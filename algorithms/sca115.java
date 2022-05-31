// LCM of two numbers
import java.util.Scanner;
public class sca115
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = user.nextInt();
        System.out.println("Enter 2nd number");
        int y = user.nextInt();
        int lcm = 0;
        if(x>=y)
        {
            lcm = x;
        }
        else
        {
            lcm = y;
        }
        while (true)
        {
            if (lcm % x == 0 && lcm % y == 0)
            {
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }
}
