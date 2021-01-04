import java.util.*;
public class q1
{
    Scanner sc = new Scanner(System.in);
    int field [];
    int n;
    
    q1()
    {
        System.out.println("Enter the size");
        n= sc.nextInt();
        field = new int [n];
    }
    
    void init()
    {
        for(int i=0;i<field.length;i++)
        {
            field [i]= sc.nextInt();
        }
    }
    
    void odd_element()
    {
        int count=0;
        for(int i=0;i<field.length;i++)
        {
            if(field [i]%2!=0)
            {
                count++;
            }
        }
        System.out.println("The number of elements that are odd: " + count);
    }
    
    public static void main()
    {
        q1 obj = new q1();
        obj.init();
        obj.odd_element();
    }
}