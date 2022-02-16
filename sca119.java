// Program to check a smith number.
import java.util.Scanner;
public class sca119
{
    public static void main(String[] args)
    {   
        while (true)
        {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = user.nextInt();
            int sum = 0;
            int psum = 0;
            int nu = num;
            while (nu != 0)
            {
                int x = nu % 10;
                sum = sum + x;
                nu = nu/10;
            }
            for(int i = 2; i < num; i++)
            {
                if(num%i==0)// num=225  3,5,15,45,75
                {
                   boolean flag = false;
                   for(int j = 2; j < i; j++)
                   {
                        if(i % j == 0)
                        {
                           flag = true;
                           //break;
                        }
                   }
                   if(!flag)
                        {    
                            int prime = i;
                            while (prime != 0)
                            {
                                int digit = prime % 10;
                                psum = psum + digit;
                                prime = prime/10;
                            }   
                        }
                }
            }
            if(sum == psum)
            {
                System.out.println("The input is a Smith Number");
            }
            else
            {
                System.out.println("The input is not a Smith Number");
            }
        }
    }
}
