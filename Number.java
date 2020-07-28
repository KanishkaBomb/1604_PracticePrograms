public class Number
{
    int a,b,c;
    public Number(int num,int num1,int num2)
    {
        a= num;
        b= num1;
        c= num2;
    }
    void check()
    {
        if(a>b && a>c)
        {
            if(b>c)
            { 
                System.out.println("Smallest Number: " + c + "\n"+ " Second smallest number: " + b);
            }
            else
            {
                System.out.println("Smallest Number: " + b + "\n"+ " Second smallest number: " + c);
            }
            System.out.println("Largest Number: " + a);
        }
        else if(b>a && b>c)
        {
            if(a>c)
            {
               System.out.println("Smallest Number: " + c + "\n"+ " Second smallest number: " + a); 
            }
            else
            {
                System.out.println("Smallest Number: " + a + "\n"+ " Second smallest number: " + c);
            }
            System.out.println("Largest Number: " + b);
        }
        else if(c>a && c>b)
        {
            if(a>b)
            {
            System.out.println("Smallest Number: " + b + "\n"+ " Second smallest number: " + a);
            }
            else
            {
                System.out.println("Smallest Number: " + a + "\n"+ " Second smallest number: " + b);
            }
            System.out.println("Largest Number: " + c);
        }
}
}