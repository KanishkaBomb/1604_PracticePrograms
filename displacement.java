public class displacement
{
    int u,t,a;
    public displacement()
    {
        int u= 20;
        int t=20;
        int a = 10;
    }
double calc_displacement()
    {
        double S =(u*t)+(1/2*a*t*t);
        System.out.println(S);
        return S;
        
    }
    public static void main()
    {
        displacement obj= new displacement();
        obj.calc_displacement();
    }
}
