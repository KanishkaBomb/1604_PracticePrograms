import java.util.*;
public class String_bubble_sort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        
        String array [] = new String [len];
        
        for(int i = 0; i < len; i++)
        {
            System.out.println("Enter the characters");
            array [i] = sc.next(); 
        }
        String temp;
        int j;
        for(int i=0; i < len; i++) 
        {
            for(j =0; j< len-i-1;j++) 
            {
                if((array [j].compareTo(array[j+1])>0)) // lexicographically, comparison of ASCII value 
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }  
        }
        for(int i=0; i < len; i++)
        {
            System.out.println(array[i]);
        }
    }
}