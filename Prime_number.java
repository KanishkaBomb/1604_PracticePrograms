// if a no. is prime or not
import java.util.*;
public class Prime_number
{
    int num;
    void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter a number.");
        num= sc.nextInt();
    }
    
    void check()
    {
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
            System.out.println("Prime number");
            }
            else
            {
                System.out.println(" Not a prime number");
                }
    }
    
    public static void main()
    {
        Prime_number obj = new Prime_number();
        obj.input();
        obj.check();
    }
}