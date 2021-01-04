import java.util.Scanner;
public class triangle
{
    void type(int a,int b,int c)
    {
        if(a<90 && b<90 && c<90)
        {
            System.out.println("Acute angled triangle");
        }
        else if(a==90 || b==90 || c==90)
        {
            System.out.println("Right angled trangle");
        }
        else
        {
            System.out.println("Obtuse angled triangle");
        }
    }
    
    void type(double l1,double l2,double l3)
    {
        if(l1==l2 && l2==l1 && l1==l3)
        {
            System.out.println("Equilateral triangle");
        }
        else if(l1 == l2 || l2==l3 || l1==l3)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        triangle obj = new triangle();
        int choice;
        char ch;
        do
        {
            System.out.println("\f");
            System.out.println("Which type of triangle do you want to know?");
            System.out.println("1.Based on angles");
            System.out.println("2.Based on length of the sides");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                obj.type(a,b,c);
                break;
                case 2:
                double l1 =sc.nextDouble();
                double l2 =sc.nextDouble();
                double l3 = sc.nextDouble();
                obj.type(l1,l2,l3);
                break;
                default:
                System.out.println("Invalid choice");
            }
            System.out.println("Enter y to continue");
            ch = sc.next().charAt(0);
     }while(ch == 'y');
   }
}