import java.util.*;
public class deletion
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        
        int array [] = new int [len];
        
        for(int i = 0 ; i < len; i++)
        {
          System.out.println("Enter the value of each index in the array");
          array [i] = sc.nextInt();
        }
        
        System.out.println("Enter a number that you want to delete from the array");
        int del = sc.nextInt();
        int pos = -1;
        for(int i = 0 ; i < len ; i++)
        {
           if(array [i] == del)
           {
               pos = i;
               len = len-1;
               for (int k = i;k < len; k++)
               {
                   array [k] = array [k+1];
               }
           }
        }
        if(pos == -1)
        {
            System.out.println("Number not found");
        }
        else
        {
            for(int i = 0 ; i < len ; i++)
            {
             System.out.println(array[i]);
            }
        }
    }
}