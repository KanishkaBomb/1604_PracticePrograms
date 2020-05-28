// WAP to find the area of square using overloading
public class Square_area
{
    void area( int side)
    {
        System.out.println(" The area of the square with side "+ side+ " is " + side*side);
    }
    void area( char side)
    {
        System.out.println(" Since " + side + " it is a character, area can't be calculated");
    }
    void area(float side)
    {
        System.out.println(" The area of the square with side "+ side+ " is " + side*side);
    }
    void area(double side)
    {
        System.out.println(" The area of the square with side "+ side+ " is " + side*side);
    }
}
