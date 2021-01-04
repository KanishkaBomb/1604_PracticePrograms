import java.util.*;
public class array_copy_len
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first array");
        int len1 = sc.nextInt();
        System.out.println("Enter the length of the second array");
        int len2 = sc.nextInt();
        
        
        int array1 [] = new int [len1];
        int array2 [] = new int [len2];
        
        for(int i = 0 ; i < len1 ; i++)
        {
            System.out.println("Enter the value of each index of the first array");
            array1 [i] = sc.nextInt();
        }
        for(int i = 0 ; i < len2 ; i++)
        {
            System.out.println("Enter the value of each index of the second array");
            array2 [i] = sc.nextInt();
        }
        int array3 [] = new int [len1+len2];
        
        for(int i = 0 ; i < len1 ; i++)
        {
          array3 [i] = array1[i];
        }
        int x = len1;
        for(int i =0; i <len2; i++)
        {
          array3 [x++] = array2[i];
        }
        for(int i = 0 ; i < len1+len2 ; i++)
        {
          System.out.println(array3[i]);
        }
    }
}