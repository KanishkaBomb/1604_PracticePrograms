import java.util.*;
public class Armstrong_range
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the first and the last term");
        int  num1= sc.nextInt();
       int  num2=sc.nextInt();
        int sum=0,len;
        for(int i=num1;i<num2;i++)
        {   int temp=i;
            sum=0;
            while(temp!=0)
            {
                len=temp%10;
                sum=sum+(len*len*len);
                temp= temp/10;
                }
                if(sum==i)
                {
                
                 System.out.println(i);
                }
            }
        }
    }