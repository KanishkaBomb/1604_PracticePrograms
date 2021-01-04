import java.util.*;
public class Krishnamurthy_range
{
        int upper,lower;
        void input()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for the range");
        lower=sc.nextInt();
        upper = sc.nextInt();
        }
    
         void range()
        {
          for(int i=lower;i<=upper;i++)
          {
            int temp = i,sum =0;
            while(temp!=0)
            {
                int digit = temp % 10;
                int fact =1;
                for(int j= digit;j>0;j--)
                {
                    fact = fact*j;
                }
                sum = sum + fact;
                temp = temp/10;
            }
            if(sum==i)
                {
                      System.out.println(i);
                }
          }
        }
        
        public static void main()
        {
            Krishnamurthy_range obj = new Krishnamurthy_range();
            obj.input();
            obj.range();
        }
}