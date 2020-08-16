import java.util.Scanner;
public class Sum_series
{
    int x;
    double sum1=0;
     void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter x"); // user will enter the value
        x = sc.nextInt();
        
    }
    void ans1()
    {
        double sum = 0;
        for(double i =2;i<=20;i+=2)
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
    }
    void ans2()
    {
        for(double i =2;i<=20;i+=3.0)
        {
            sum1= sum1+x/i; //pattern 2
        }
        System.out.println(sum1);
    }
    public static void main()
    {
        Sum_series obj= new Sum_series();
        obj.input();
        obj.ans1();
        obj.ans2();
    }
}
        