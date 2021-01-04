import java.util.*;
public class trial
{
    Scanner sc = new Scanner(System.in);
    int arr [];
    int len,i,pos;
    trial()
    {
        len = sc.nextInt();
        arr = new int [len];
    }
    
    void input ()
    {
        for(i =0; i<len;i ++)
        {
            arr[i] = sc.nextInt();
        }
    }
    
    void search()
    {
        int temp;
        for(i =0;i<len;i++)
        {
            for (int j =0;  j < len - i -1; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp = arr [j];
                    arr [j] = arr [j+1];
                    arr [j+1] = temp;
                }
            }
        }
        display();
    }
    
    void display()
    {
        for(i = 0; i<len;i++)
        {
            System.out.println(arr [i]);
        }
    }
    
    public static void main()
    {
        trial obj = new trial ();
        obj.input();
        obj.search();
    }
}