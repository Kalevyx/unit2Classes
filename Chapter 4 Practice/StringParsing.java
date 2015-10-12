import java.util.Scanner;

public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String num;
        System.out.print("Enter a number between 1,000 and 999,999: ");
        num = s.next();
        String sub = num.substring(0, num.length()-4);
        String sub2 = num.substring(num.length()-3, num.length());
        System.out.println(sub+sub2);
    }
}