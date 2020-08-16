import java.util.Scanner;
public class HW_series29
{
    double n;
    
    void input()
    {
        Scanner init = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n= init.nextDouble();
    }
    double fact()
    {
        double fact=1;
        
        for(double i=n;i>0;i--)
        {
            fact = fact*i;
        }
        return fact;
    }
    void series()
    {
        double ans=0;
        for(int j =2;j<=n;j+=2)
        {
            if(j%4==0)
        {
            ans = ans -fact();
        }
        else
        {
            ans = ans+fact();
        }
        }
        System.out.println("The answer to the series is: "+ ans);
    }
    public static void main()
    {
        HW_series29 obj = new HW_series29();
        obj.input();
        obj.fact();
        obj.series();
    }
}
