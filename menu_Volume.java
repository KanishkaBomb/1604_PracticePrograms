import java.util.Scanner;
public class menu_Volume
{
    void Menu()
    {
       System.out.println("What would you like to do?"); 
       System.out.println("1.Find the volume of a sphere");
       System.out.println("2.Find the volume of a cylinder");
       System.out.println("3. Find the volume of a cone?");
       System.out.println("Enter any integer other than 1/2/3 to exit");
    }
    
    void Sphere()
    {
        Scanner sc = new Scanner(System.in);
        double vol, pi =3.14;
        System.out.println("Enter the radius of the sphere.");
        int r = sc.nextInt();
        vol = 4/3*pi*r*r*r;
        System.out.println("The volume of the sphere is "+vol);
    }
    
    void cylinder()
    {
        Scanner sc = new Scanner (System.in);
        double vol,pi= 3.14;
         System.out.println("Enter the radius of the cylinder");
        int r = sc.nextInt();
        System.out.println("Enter the height of the cylinder");
        int h = sc.nextInt();
        vol = pi*r*r*h;
        System.out.println("The volume of the cylinder is "+vol);
    }
    
    void cone()
    {
        Scanner sc=new Scanner(System.in);
        double vol,r,h;
        System.out.println("Enter the radius of the cone");
        r=sc.nextDouble();
        System.out.println("Enter the height of the cone");
        h=sc.nextDouble();
        vol=(Math.PI*r*r*h)/3;
        System.out.println("The volume is "+vol);
    }
    
    public static void main ()
    {
        menu_Volume obj = new menu_Volume();
        
    }
}