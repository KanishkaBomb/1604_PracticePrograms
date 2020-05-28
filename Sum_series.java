// Question 9- WAP to print the sum of the given series 
import java.util.*;
public class Sum_series
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter x"); // user will enter the value
        int x = sc.nextInt();
        int sum = 0;
        double sum1=0;
        for(int i =2;i<=20;i+=2)
        {
            if(i%4==0)
            {
             sum = sum-i; //pattern 1
            }
            else
            {
                sum= sum+i;
            }
        }
        System.out.println(sum);
        for(double i =2;i<=20;i+=3.0)
        {
            sum1= sum1+x/i; //pattern 2
        }
        System.out.println(sum1);
    }
}
        