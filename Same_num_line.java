/* 55555
   4444
   333
   22
   1 */
import java.util.*;
public class Same_num_line
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int line_no = sc.nextInt();
        
        for(int i = line_no; i>0; i --)
        {
            for(int j =i; j>0; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

