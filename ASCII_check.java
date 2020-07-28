public class ASCII_check
{
    int a;
    ASCII_check(char ch)
    {
        a=ch;
    }
    void check()
    {
        if((a>=65 && a<=90) || (a>=97 && a<=122))
        {
           System.out.println(" Entered character is an alphabet"); 
        }
        else if(a>=48 && a<=57)
        {
           System.out.println("Entered character is a digit"); 
        }
        else
        {
            System.out.println("It is a special character");
        }
    }
    public static void main(char ch)
    {
        ASCII_check obj = new ASCII_check(ch);
        obj.check();
    }
}