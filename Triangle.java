import java.util.Scanner;
public class Triangle 
{
    int s1,s2,s3;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
    }
    
    void check ()
    {
        if (s1==s2 && s2 == s3)
        {
            System.out.println("Equilateral triangle");
        }
        else if(s1==s2 || s1==s3 || s2==s3)
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
        Triangle obj = new Triangle();
        obj.input();
        obj.check();
    }
}