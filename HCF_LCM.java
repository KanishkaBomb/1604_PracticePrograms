import java.util.*;
public class HCF_LCM
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int HCF =0;
        for(int i=1;i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                HCF=i;
            }
        }
        System.out.println(HCF);
        System.out.println("The LCM is:" + (num1*num2)/HCF);
    }
}