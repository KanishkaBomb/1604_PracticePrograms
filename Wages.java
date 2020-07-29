public class Wages
{
    double rate, time,wages;
     
    void input(double r, double t)
    {
        rate=r;
        time=t;
    }
    void calc()
    {
        if((time>0)&&(time<=35.0))
        {
            wages=rate*time;
        }
        else if((time>35)&(time<=60))
        {
            wages=(rate*35)+((1.5*rate)*(time-35));
        }
        else 
        {
            wages=(rate*35)+((1.5*rate)*25)+((2*rate)*(time-60));
        }
        System.out.println(" Wage: "+ wages);
    }
    public static void main()
    {
        Wages obj = new Wages();
        obj.input(500.0,75.0);
        obj.calc();
    }
}