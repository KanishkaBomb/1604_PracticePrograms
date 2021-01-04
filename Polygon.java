import java.util.*;
public class Polygon
{
    void polygon(int n, char ch)
    {
        for(int i = 1; i<=n;i++)
        {
            for(int j =1;j<=n;j++)
            {
               System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    void polygon(int x, int y)
    {
         for(int i =1;i<=x;i++)
        {
            for(int j = 1;j<=y;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    
    void polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        Polygon obj = new Polygon();
        Scanner sc = new Scanner(System.in);
        char cont = 'y';
        do
        {
            System.out.println("\f");
           System.out.println("What would you like to do?");
           System.out.println("1.Print a square");
           System.out.println("2.Print a rectangle");
           System.out.println("3.Print a triangle");
            int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
           
            System.out.println("Enter the side of the square.");
            int n=sc.nextInt();
            System.out.println("Enter the character in which the square should be formed");
            char ch=sc.next().charAt(0);
            obj.polygon(n,ch);
            break;
            case 2:
            System.out.println("Enter the length of the rectangle.");
            int x= sc.nextInt();
            System.out.println("Enter the breadth of the rectangle");
            int y=sc.nextInt();
            obj.polygon(x,y);
            break;
            case 3:
            obj.polygon();
            break;
            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Enter y to continue");
        cont = sc.next().charAt(0);
      }   while(cont =='y');
    }
}