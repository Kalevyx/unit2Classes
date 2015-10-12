import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double x, y;
        System.out.print("Enter the length: ");
        x = s.nextDouble();
        System.out.print("Enter the width: ");
        y = s.nextDouble();
        double perimeter = 2*x+2*y;
        System.out.println("Perimeter: " + perimeter);
        double area = x*y;
        System.out.println("Area: " + area);
        double x2 = Math.pow(x,2);
        double y2 = Math.pow(y,2);
        double z = x2+y2;
        double diagonal = Math.sqrt(z);
        System.out.println("Diagonal: " + diagonal);
    }
}