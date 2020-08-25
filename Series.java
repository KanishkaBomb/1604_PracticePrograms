import java.util.Scanner;
public class Series
{
    int n,x;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int x1=sc.nextInt();
        x=x1;
        System.out.println("Enter the power");
        int n1=sc.nextInt();
        n=n1;
    }
    void sum()
    {
        double sum = 0;
        for(int i=1;i<=n;i++)
        {
        sum= sum + Math.pow(x,n);
        }
        System.out.println("Sum: "+sum );
    }
    public static void main()
    {
        Series obj = new Series();
        obj.input();
        obj.sum();
    }
}