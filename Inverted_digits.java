/* WAP a prog to print
  1 2 3 4 5 
  1 2 3 4 
  1 2 3 
  1 2 
  1*/
 
 import java.util.Scanner;
public class Inverted_digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int line_no = sc.nextInt();
        
        for(int i = line_no;i>0;i--)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}