public class Pell_series
{
    void series()
    {
        int a = 0,b=1;
        int c = 0;
        System.out.println(a + "\n" + b);
        for(int i = 1;i<=13;i++)
        {
         c = 2*b+a;
        System.out.println(c);
        a=b;
        b=c;
        }
    }
    
    public static void main()
    {
        Pell_series obj = new Pell_series();
        obj.series();
    }
}