import java.util.*;
public class Duck_number
{
    int num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num= sc.nextInt();
    }  
    
    void check()
    {
        int rem,count=0;
        while(num!=0)
        {
            rem = num%10;
            if(rem==0)
            {
                count++;
            }
            num = num/10;
        }
        if(count==0)
            {
                System.out.println("Not a duck number");
            }
            else
            {
                System.out.println("Duck number");
            }
    }
    
    public static void main()
    {
        Duck_number obj = new Duck_number();
        obj.input();
        obj.check();
    }
}