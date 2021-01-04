//Find the smallest index value among the values entered in an array of a given length (according to the user)
import java.util.*;
public class min_num
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int len = sc.nextInt();
        
        int array [] = new int[len];
        
        for(int i =0;i<len;i++)
        {
            System.out.println("Enter the value of each index");
            array [i] = sc.nextInt();
        }
        int small = array [0];
        for(int i =0;i<len;i++)
        { 
            if(array[i]<small)
            {
               small = array[i];
            }
        }
        System.out.println(small);
    }
}