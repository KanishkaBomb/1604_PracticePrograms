//Question 5
import java.util.Scanner;
public class Question_5
{
    public static void main()
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1 for pattern 1");
    System.out.println("Enter 2 for pattern 2");//asking the user to enter his/her choice 
    int n= sc.nextInt(); 
    
    if(n==1)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    else if(n==2)
    {
       char x='a';
       for(int i=1;i<=5;i++)
       {
           x='a';
           for(int j=1;j<=6-i;j++)
           {
               System.out.print(x++);
               
               }
               System.out.println();
            }
        }
    else
    {
         System.out.println("Wrong entry");
        }
    }
}