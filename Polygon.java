import java.util.*;
public class Polygon
{
    void polygon(int n, char ch)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square and the character in which the square should be formed");
        n=sc.nextInt();
        ch=sc.next().charAt(0);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and the breadth of the rectangle");
        x= sc.nextInt();
        y=sc.nextInt();
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
            obj.polygon(5,'*');
            break;
            case 2:
            obj.polygon(5,7);
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