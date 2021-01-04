/*
 WAP to print the pattern
 1
 22
 333
 4444
 55555*/
import java.util.Scanner;
public class Digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int line_no = sc.nextInt();
        
        for(int i = 1; i<= line_no;i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}