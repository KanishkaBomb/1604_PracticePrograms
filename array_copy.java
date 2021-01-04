import java.util.*;
public class array_copy
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int len = sc.nextInt();
        
        int num1 [] = new int [len];
        int num2 [] = new int [len];
        
        for(int i =0; i< len; i++)
        {
            System.out.println("Enter the number for the first array");
            num1 [i] = sc.nextInt();
        }
        for(int i =0; i< len; i++)
        {
            System.out.println("Enter the number for the second array");
            num2 [i] = sc.nextInt();
        }
        int num3 [] = new int [len*2];
        for(int i =0; i< len; i++)
        {
              num3[i] = num1[i];
        }  
        int x = len;
        for(int i =0; i< len; i++)
        {
              num3[x++] = num2[i];
        }   
        for(int i =0; i<len*2;i++)
        {
            System.out.println(num3[i]);
        }
    }
}