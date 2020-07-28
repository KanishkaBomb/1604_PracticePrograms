public class Temperature
{
    double c,f;
    Temperature(double temp)
    {
        f= temp;
    }
    void calc()
    {
        c= ((f-32)*(5.0/9.0));
    }
    void display()
    {
        System.out.println(f+" F is "+ c + " C");
    }
}