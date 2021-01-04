import java.util.*;
public class q2
{
    Scanner sc = new Scanner(System.in);
    String names [];
    int len;
    
    q2()
    {
        System.out.println("Enter the size");
        len = sc.nextInt();
        names = new String [len];
    }
    
    void init()
    {
        for(int i=0;i<len;i++)
        {
            names [i] =sc.next();
        }
    }
    
    void reverse()
    {
        for(int i=names.length-1;i>-1;i--)
        {
            System.out.print(" " + names[i] + " ");
        }
    }
    
    public static void main()
    {
        q2 obj = new q2();
        obj.init();
        obj.reverse();
    }
}