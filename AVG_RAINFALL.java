public class AVG_RAINFALL
{
    double April,May,June,avg;
    void init(double april,double may,double june)
    {
        April=april;
        May=may;
        June=june;
    }
    void calc()
    {
        avg= (April+May+June)/3.0;
    }
    void display()
    {
        System.out.println("Rainfall in April: " + April +" cm");
        System.out.println("Rainfall in May: " + May +" cm");
        System.out.println("Rainfall in June: " + June +" cm");
        System.out.println("Average rainfall: " + avg +" cm");
    }
    public static void main()
    {
        AVG_RAINFALL obj = new AVG_RAINFALL();
        obj.init(16.0,20.0,12.0);
        obj.calc();
        obj.display();
    }
}