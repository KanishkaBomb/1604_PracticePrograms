public class Quadratic_Equations
{
    int a,b,c,d;
    
    void init(int num1,int num2,int num3)
    {
        a=num1;
        b=num2;
        c=num3;
    }
    
    void discriminant()
    {
        d=b*b-(4*a*c);
    }
    
    void check()
    {
        discriminant();
        if(d==0)
        {
            System.out.println("Real and Equal Roots");
            int r1= -b/(2*a);
            int r2 = b/(2*a);
            System.out.println("Root 1= "+r1+"\n"+"Root 2= "+r2);
        }
        else if(d>0)
        {
            System.out.println("Real and unequal roots");
            int r1=(-b+d)/(2*a);
            int r2 =(-b-d)/(2*a);
            System.out.println("Root 1= "+r1+"\n"+"Root 2= "+r2);
        }
        else
        {
            System.out.println("Imaginary roots");
        }
    }
    public static void main()
    {
        Quadratic_Equations obj=new Quadratic_Equations();
        obj.init(2,4,8);
        obj.discriminant();
        obj.check();
    }
}