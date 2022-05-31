// Program to check a pronic number.
// A number which has a pair of consecutive multiples.
import java.util.Scanner;
public class sca116
{
    public static void main(String[] args)
    {   
        while(true)
        {
            Scanner user = new Scanner(System.in);
            System.out.println("enter a number:");
            int num = user.nextInt();
            boolean o = false;
            int x = 0;
            int y = 0;
            for(int i = 1; i <= num; i++)
            {
                if(i*(i+1) == num)
                {
                    o = true;
                    x = i;
                    y = i+1;
                    break;
                }
            }
            if(o)
            {
                System.out.println("The input is a pronic number" + "\n" + "The factors are: " + x + ", " + y + "\n" + " ");
            }
            else
            {
                System.out.println("The input is not a pronic number" + "\n" + " ");
            }
        }
    }
}