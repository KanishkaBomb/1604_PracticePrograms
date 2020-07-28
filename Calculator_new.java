// WAP to create a calculator with 4 methods and 1 method to accept 3 parameters
import java.util.*;
public class Calculator_new
{   
    
    int num1,num2;
    char ch;
    void add(int num, int num3, char ch1)
    {
        num1=num;
        num2=num3;
        ch=ch1;
        if( ch=='+')
        {
            System.out.println( num1 + num2);
    }
    
    }
    void subtract(int num, int num3, char ch1)
    {
         num1=num;
        num2=num3;
        ch=ch1;
        if(ch=='-')
        {
            System.out.println( num1-num2);
    }
    }
    void multiply(int num, int num3, char ch1)
    {
         num1=num;
        num2=num3;
        ch=ch1;
        if(ch=='*')
        {
            System.out.println(num1*num2);
        }
    }
    void divide(int num, int num3, char ch1)
    {
         num1=num;
        num2=num3;
        ch=ch1;
        if(ch=='/')
        {
            System.out.println((num1/num2));
        }
    }
    public static void main()
    {
         Calculator_new obj = new Calculator_new();
         obj.add(5,10,'+');
         obj.multiply(21,10,'*');
         obj.divide(75,5,'/');
         obj.subtract(21,1,'-');
         
    }
}
        