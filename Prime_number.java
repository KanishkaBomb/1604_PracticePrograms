// if a no. is prime or not
import java.util.*;
public class Prime_number
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter num");
        int num= sc.nextInt();
        
        
        int count = 0;
        for(int i= 2; i<num;i++)
        {
            if(num %i==0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Prime no.");
            }
            else
            {
                System.out.println(" Not a prime no.");
                }
                }
            }