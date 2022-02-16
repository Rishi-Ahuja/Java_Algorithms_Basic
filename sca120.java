//Program to identify armstrong number
import java.util.Scanner;
public class sca120
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner user = new Scanner(System.in);
            int num = user.nextInt();
            int sum = 0;
            int i = num;
            while (i > 0)
            {
                int x = i % 10;
                sum += Math.pow (x, 3);
                i = i/10;
            }
            if(sum == num)
            {
              System.out.println("Yes, the input is an armstrong number.");
            }
            else
            {
                System.out.println("No, the number is not an armstrong number");
            }
        }
    }
}