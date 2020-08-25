import java.util.Scanner;
public class Spy_number
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int sum=0,rem,pro=1;
        while(num!=0)
        {
         rem= num%10;
         sum= sum+rem;
         pro = pro*rem;
         num=num/10;
        }
        if(sum==pro)
        {
            System.out.println("Spy number");
            }
            else
            {
                System.out.println("Not a spy number");
                }
            }
        }
                
                
         
         