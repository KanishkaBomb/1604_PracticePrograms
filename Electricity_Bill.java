import java.util.*;
public class Electricity_Bill
{
    double bill;
    int units;
    
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        int u=0;
        System.out.println("Enter the units consumed");
        u= sc.nextInt();
        units=u;
    }
    void generate_bill()
    {
        if((units>0)&&(units<=100))
        {
            bill= units*40/100; 
        }
        else if((units>100)&&(units<=300))
        {
            bill=(100*40/100) +((units-100)*(60/100));
        }
        else
        {
            bill=(100*40/100)+(200*60/100)+((units-300)*1);       
        }
        bill=bill+500;//adding the meter rent
        System.out.println("The amount of Bill is: Rs. "+ bill);
    }
    public static void main()
    {
        Electricity_Bill obj = new Electricity_Bill();
        obj.getData();
        obj.generate_bill();
    }
}