import java.util.Scanner;
public class HW_series27
{
    int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
    }
    
    int series()
    {
        int sum=0,ans=0;
        for(int i=1;i<=n;i++)
        {
            ans= ans+i;
            sum=sum+ans;
        }
        return sum;
    }
    public static void main()
    {
        HW_series27 obj= new HW_series27();
        obj.input();
        System.out.println(obj.series());
    }
}