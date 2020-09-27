// to check if a no. is an Armstrong no. or not
import java.util.*;
public class Armstrong 
{
    int num;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a number");
        num = sc.nextInt();
    }
    
    void check()
    {
        int T1=num,len,sum=0;
        while( T1!=0)
        {
            
           len =T1%10;
           sum = sum+(len*len*len);
           T1 = T1/10;
           
        }
        if(num==sum)
        {
            System.out.println(" Armstrong number");
            }
            else 
            {
                System.out.println(" Not an armstrong number");
                }
    }
    
    public static void main()
    {
        Armstrong obj = new Armstrong();
        obj.input();
        obj.check();
    }
}