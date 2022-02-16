// program to convert a decimal to binary
import java.util.Scanner;
public class sca121
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = user.nextInt();
        String ans = "";
        String binary = "";
        int i = num;
        while(i != 0)
        {
            int x = 0;
            x = i % 2;
            ans = ans + x;
            i = i/2;
        }
        int l = ans.length();
        int j = l - 1;
        while(j >= 0)
        {
            char p = ans.charAt(j);
            binary = binary + p;
            j -= 1;
        }
        System.out.println(binary);
    }
}
