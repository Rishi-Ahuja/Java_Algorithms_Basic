//program to detect a happy number
import java.util.*;
public class sca132
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = user.nextInt();
        int sum = 0;
        boolean flag = false;
        while (flag == false)
        {
            while (num !=0)
            {
                int x = num % 10;
                sum = sum + x * x;
                num = num / 10;
            }
            System.out.println(sum);
            if (sum == 1)
            {
                flag = true;
                System.out.println("happy number  :)");
            }
            else if (sum == 4)
            {
                flag = true;
                System.out.println("sad number  :(");
            }
            else
            {
                num = sum;
                sum = 0;
            }
        }
    }
}