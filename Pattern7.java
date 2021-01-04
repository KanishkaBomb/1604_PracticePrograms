/* 
0
10
210
3210
43210 */
import java.util.*;
public class Pattern7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        int x;
        for(int i =1; i<= lines;i++)
        {
            x=i-1;
            for(int j =1;j<=i;j++)
            {
                System.out.print(x--);
            }
            System.out.println();
        }
    }
}