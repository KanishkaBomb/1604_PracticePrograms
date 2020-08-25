import java.util.Scanner;
class oddeve
{
    int a,b,a1=0,b1=0,e,f;
    void oddeve1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a no. between 1-6");
        a=sc.nextInt();
        compute1();
    }
    void oddeve2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a no. between 1-6");
        b=sc.nextInt();
        compute2();
    }
    void compute1()
    {
        if(a!=b)
        {
            a1+=a;
            e=1;
        }
        else
        {
            System.out.println("You are out");
        }
    }
    void compute2()
    {
        if(a!=b)
        {
            b1+=b;
            e=2;
        }
        else
        {
            System.out.println("You are out");
        }
    }
    void toss()
    {
        f=(int)(Math.random()*10);
        if(f<5)
        {
            compute1();
        }
        else
        {
            compute2();
        }
    }
    public static void main()
    {
        oddeve obj=new oddeve();
        if(obj.f<5)
        {
            while(obj.e!=1)
            {
                obj.oddeve1();
                obj.oddeve2();
            }
        }
        else
        {
            while(obj.e!=2)
            {
                obj.oddeve1();
                obj.oddeve2();
            }
        }
        obj.toss();
        int d=(obj.a1>obj.b1)?1:2;
        if(d==1)
        {
             System.out.println("The winner is a");
        }
        else
        {
             System.out.println("The winner is b");
        }
    }
}