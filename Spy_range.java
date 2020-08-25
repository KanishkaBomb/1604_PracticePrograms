import java.util.*;
public class Spy_range
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first and the last term");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0,pro=1,rem;
        for(int i= num1;i<num2;i++)
        {
            sum=0;
            pro=1;
            int temp=i;
            while(temp!=0)
            {
                rem=temp%10;
                sum=sum+rem;
                pro=pro*rem;
                temp=temp/10;
            }
            
            if(sum==pro)
            {
                System.out.println(i);
                }
                }
            }
        }