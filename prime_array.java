import java.util.*;
public class prime_array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        
        int array[] = new int [len];
        
        for(int i =0; i<len;i++)
        {
            System.out.println("Enter the value at each index");
            array[i] = sc.nextInt();
        }
        for(int i =0; i<len;i++)
        { int count =0;
            for(int j = 2; j<array[i];j++)
            {
                if(array[i]%j==0)
                {
                   count++;
                }
            }
            if(count==0)
            {
                System.out.println(array[i] + " is a Prime number");
            }
        }
    }
}