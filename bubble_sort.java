import java.util.*;
public class bubble_sort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        
        int array [] = new int [len]; 
        
        for(int i = 0; i <len;i++)
        {
            System.out.println("Enter the value of each index of the array");
            array[i] = sc.nextInt();  
        }
        int temp=0;
        for (int i = 0; i < len ; i ++)
        {
            for(int j = 0; j<len-i-1; j++)   
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        for(int i = 0 ; i < len ; i++)
        {
          System.out.println(array[i]);
        }
    }
}