/* 0
  1 0
  0 1 0
  1 0 1 0
  0 1 0 1 0 */
  import java.util.Scanner;
public class _101
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line number");
        int line_no = sc.nextInt();
        
        for(int i =1; i<=line_no; i ++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                System.out.print("0");
                }
                else
                {
                   System.out.print("1"); 
                }
            }
            System.out.println();
        }
    }
}