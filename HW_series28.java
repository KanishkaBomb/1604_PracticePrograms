import java.util.Scanner;
public class HW_series28
{
    int n;
    void input()
    {
        Scanner init= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n= init.nextInt();
    }
    int sum()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
              sum = sum-i;  
            }
            else
            {
                sum= sum+i;
            }
        }
        return sum;
    }
    
   public static void main()
   {
       HW_series28 obj = new HW_series28();
       obj.input();
       System.out.println("The answer to the series is: "+ obj.sum());
       }
}