public class Ternary
{
    public void check()
    {
        int i,k;
        i=5;
        k= i<0?-i:i; // to get the absolute value
        System.out.println("Absolute value of " + i+ " is " + k);
        i =-5;
        k=i<0?-i:i; // to get the absolute value
        System.out.println("Absolute value of " + i+" is " + k);
    }
}