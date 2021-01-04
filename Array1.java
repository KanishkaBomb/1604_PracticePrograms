import java.util.*;
public class Array1
{
    int array [];
    int size;
    Scanner sc = new Scanner(System.in);
    public Array1()
    {
        size = sc.nextInt();
        array = new int [size];
    }
      
    void prog()
    {
        for(int i =0;i<size;i++)
        {
            System.out.println("Enter a number to store in an index/sub script");
            array [i] = sc.nextInt();
        }
        for(int i =0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    
    public static void main()
    {
        Array1 obj = new Array1();
        obj.prog();
    }
    
}