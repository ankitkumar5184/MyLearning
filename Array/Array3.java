package Array;
import java.util.Scanner;
public class Array3 {
    public static void main(String args[])
    {
        int size,i;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the size of array: "); // Dynamic array program

        size = r.nextInt();
        int a[] = new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();

        }
        System.out.print("printed arrays element: ");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

}
