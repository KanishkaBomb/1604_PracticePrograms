import java.util.*;
public class Vowel_check
{
    void check()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character to check if it is a vowel or not");
    char ch= sc.next().charAt(0); 
     switch(ch)
     {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         System.out.println("Entered character is a vowel");
         break;
         default:
         System.out.println("Not a vowel");
        }
    }
    public static void main()
    {
        Vowel_check obj= new Vowel_check();
        obj.check();
    }
}