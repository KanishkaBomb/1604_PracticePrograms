import java.util.*;
public class Prime_range
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first and the last term");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int count=0;
        for(int i=num1;i<num2;i++)
        {
            count=0;
            for(int j=2; j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    }
                 
                
                        
                   
                    }
                   if(count==0)
                   {
                       System.out.println(i);
                   
                }
                
            }
           }
        }