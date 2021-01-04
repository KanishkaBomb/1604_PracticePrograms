import java.util.*;
public class country_capital
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int len = sc.nextInt();
        
        String country [] = new String [len];
        String capital [] = new String [len];
        
        for(int i =0; i< len; i++)
        {
            System.out.println("Enter the country");
            country [i] = sc.next();
            System.out.println("Enter the country's capital");
            capital [i] = sc.next();
        }
        System.out.println("Enter any country's name");
        String input = sc.next();
        int pos= -1, i; 
        for(i =0; i< len; i++)
        {
            if(input.equals(country[i]))
            {
              pos = i;
              break;
            }
        }
        System.out.println("Capital's name: " + capital[pos]);
    }
}