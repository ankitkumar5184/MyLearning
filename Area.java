import java.util.Scanner;

public class Area {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the width: ");
        double b = s.nextDouble();
        System.out.print("Enter the height: ");
        double h = s.nextDouble();

        double area= (b*h)/2;
        System.out.print("Area of traingle:"+ area);
    }
}
