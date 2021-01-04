import java.util.*;
public class special_2014
{
    int num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    } 
    
    void check()
    {
        int t1 =num;
        int rem,sum =0, pro=1;
        while(t1!=0)
        {
            rem = t1%10;
            sum += rem;
            pro *= rem;
            t1 = t1/10;
        }
        
        if ((sum+pro) == num)
        System.out.println("Special");
        else
        System.out.println("Not a Special");
    }
    
    public static void main()
    {
        special_2014 obj = new special_2014();
        obj.input();
        obj.check();
    }
}