//also known as Happy number/sad number
import java.util.Scanner;
public class Magic_number
{
    
    public static int sum (int num)
    {
        int rem,sum =0;
        while (num!=0)
        {
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        while(num>9)
        {
            num = sum(num);
        }
        
        if(num==1)
        {
            System.out.println("Magic/Happy Number");
        }
        else
        {
            System.out.println("Sad number");
        }
    }
}