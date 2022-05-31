// HCF or GCD of 2 numbers
import java.util.Scanner;
public class sca114
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int x = user.nextInt();
        System.out.println("Enter the 2nd number: ");
        int y = user.nextInt();
        int hcf = 1;
        for(int i = 1; i<=x; i++)
        {
            if (x%i==0 && y%i==0)
            {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
