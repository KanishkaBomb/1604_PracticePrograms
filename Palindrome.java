import java.util.Scanner;
public class Palindrome
{
    int num;
    int temp;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    
    void reverse()
    {
        int temp = num;
        int rev = 0;
       while(temp!=0)
       {
           int rem = num%10;
           rev = rev+ 10*rem;
           temp = temp/10;
       }
    }
    
    void check()
    {
        if(temp==num)
        {
        System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
            }
    }
    public static void main()
    {
        Palindrome obj = new Palindrome();
        obj.input();
        obj.reverse();
        obj.check();
    }
}