import java.util.*;
public class Krishnamurthy 
{
       int num;
       void input()
       {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter a number");
            num = sc.nextInt();
        }
        
       void check()
       {
            int t1=num,fact = 1,sum=0;
            while(t1!=0)
            {
            int rem = t1%10;
            fact =1;
            for(int i =rem;i>0;i--)
            {
                fact = fact*i;
            }
            sum =sum+fact;
            t1 = t1/10;
            }
            if(sum == num)
           {
             System.out.println("Krishnamurthy number");
           }
            else 
           {
             System.out.println("Not a Krishnamurthy number");
           }
      }
      
      public static void main()
      {
          Krishnamurthy obj = new Krishnamurthy();
          obj.input();
          obj.check();
      }
}