import java.util.Scanner;
public class Assignment
{
    double series (double n)
    {
        Scanner series1= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = series1.nextDouble();
        double sum =0;
        
        for(double i=1;i<=n;i++)
        {
            sum = sum +(1/i);
        }
        return sum;
    }
    double series (double a, double n)
    {
        Scanner series2= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = series2.nextDouble();
        System.out.println("Enter the base");
        a= series2.nextDouble();
        double sum=0;
        for(int i = 0;i<n;i++)
        {
            sum = sum+((3*i+1.0)/Math.pow(a,3*i+2));
           
        }
        return sum;
    }
    public static void main ()
    {
        Assignment obj = new Assignment();
        System.out.println(obj.series(2.0));
        System.out.println(obj.series(2.0,10.0));
    }
}