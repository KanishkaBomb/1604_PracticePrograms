import java.util.*;
public class Tribonnaci_terms
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms required");
        int terms = sc.nextInt();
        
        int a = 0,b=0,c=1,d;
        System.out.println(a+"\n"+b+"\n"+c);
        for(int i =1;i<=terms-3;i++)
        {
            d = a+b+c;
            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }
    }
}