import java.util.Scanner;
public class menu_switch
{
    void fibo()
    {
        int a =0,b=1,c;
        System.out.println(a+"\n"+b);
        for(int i=1;i<=8;i++)
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        }
  
    void sum() 
     {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc1.nextInt();
        int sum = 0;
        while(num!=0)
        {
            int rem = num%10;
            sum = sum +rem;
            num=num/10;
        }
        System.out.println(sum);
      }
    
    public static void main()
    {
        menu_switch obj = new menu_switch();
        Scanner sc = new Scanner(System.in); 
        char opt;
        do
        {
            System.out.println("\f");
        System.out.println("What would you like to do?");
        System.out.println("Enter 1 for the Fibonnaci series");
        System.out.println("Enter 2 to get the sum of the digits of a number");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            obj.fibo();
            break;
        case 2:
            obj.sum();
            break;
        default:
         System.out.println("Invalid choice");
        }
        System.out.println("Enter y to continue or any other character to exit");
        opt = sc.next().charAt(0);
       
    } while(opt == 'y');
        
  }
}