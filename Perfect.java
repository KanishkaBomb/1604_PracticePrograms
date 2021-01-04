import java.util.Scanner;
public class Perfect
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sum =0;
            for(int i =1;i<num;i++)
            {
                if(num%i==0)
                {
                    sum = sum+i;
                }
            }
            if(sum == num)
            {
                System.out.println("Perfect number");
            }
            else
            {
                System.out.println("Not a perfect number");
            }
    }
}