import java.util.*;
public class name_roll
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        
        String array [] = new String [len];
        int array1 [] = new int [len];
        
        for(int i =0; i< len; i++)
        {
            System.out.println("Enter the name");
            array[i] = sc.next();
            System.out.println("Enter the roll number");
            array1 [i] = sc.nextInt();
        }
        System.out.println("Enter a roll number");
        int roll = sc.nextInt();
        int pos = -1,i;
        for(i =0; i< len; i++)
        {
            if(roll == array1[i])
            {
                pos = i;
                break;
            }
        }
        System.out.println("Name: " + array[pos]);
      }
}