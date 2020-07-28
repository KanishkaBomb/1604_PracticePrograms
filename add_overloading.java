// WAP to add two numbers through funtion overloading
public class add_overloading
{
    int add ( int a, int b) // interactive
    {
        System.out.println("Its data type is int " + (a+b));
        return a+b;
    }
    double add(double a, double b)
    {
        System.out.println(" Its data type is double " + (a+b));
        return a+b; //it will return the value
    }
    public static void main()
    {
        add_overloading obj = new add_overloading();
        obj.add(20.0,10.0); // double add()
        obj.add(10,22); // int add()
    }
}
