// program to identify an evil number
import java.util.Scanner;
public class sca122
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = user.nextInt();
        String ans = "";
        String binary = "";
        int i = num;
        int y = 0;
        while(i != 0)
        {
            int x = 0;
            x = i % 2;
            ans = ans + x;
            i = i/2;
            if (x == 1)
            {
                y += 1;
            }
        }
        if(y % 2 == 0)
        {
            System.out.println("The input is an evil number");
        }
        else
        {
            System.out.println("The input is not an evil number");
        }
    }
}