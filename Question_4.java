//Bank deposit
import java.util.*;
public class Question_4
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal/monthly installment,rate of interest and time period");
        double P=sc.nextDouble();
         double r=sc.nextDouble();
         double n=sc.nextDouble();
        System.out.println("1. Term Deposit");// asking the user for his/her choice
        System.out.println("2. Recurring Deposit");
        System.out.println("Enter 1 or 2");
        int ch=sc.nextInt();
        double A=0;
        switch(ch)
        {
           case 1:
           A=P*Math.pow((1+r/100),n); // term deposit
            System.out.println(A);
            break;
        case 2:
         A=(P*n)+(((n*(n+1))/2)*(r/100)*(1/12)); //recurring deposit
         System.out.println(A);
         break;
        default:
        System.out.println("Invalid number entered");
        }
        }
    }