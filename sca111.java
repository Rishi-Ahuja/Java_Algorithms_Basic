// Prime Number checker
import java.util.Scanner;
public class sca111
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = user.nextInt();
            int num1 = (num/2);
            boolean y = false; 
            if (num > 2)
            {
                for(int x = 2; x <= num1; x++)
                {
                    if(num % x == 0)
                    {
                        y = true;
                        break;
                    }
                }
            }
            if (y)
            {
               System.out.println("The number is Composite");
               System.out.println("...........");
            }
            else
            {
                System.out.println("The number is Prime");
                System.out.println("...........");
            }
        }
    }
}
