// to check if a no. is an Armstrong no. or not
import java.util.*;
public class Armstrong 
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        
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
            }