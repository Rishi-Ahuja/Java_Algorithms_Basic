//String method testing program
import java.util.Scanner;
public class sca123
{
   public static void main(String[] args)
   {
       String s1 = "hello ";
       String s2 = "how are you";
       String a = s1 + s2;
       String a1 = s1.trim() + s2;
       System.out.println(a + "\n" + a1);
       String x = "computer".substring(2, 5);
       System.out.println(x);
       String y = "welcome here, all are welcome here!";
       int w = y.indexOf('e', 4);
       int g = y.lastIndexOf("welcome");
       System.out.println(g);
   }
}
