// WAP TO CALCULATE COMMISSION OF A SALESMAN ON CONDITIONS
import java.util.*;
public class Salesman
{
    void commission()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sales earned");
        double sales= sc.nextDouble();
        
        if(sales<10000)
        {
            double commission = (5.0/100.0)*sales;
            System.out.println("Commission of the salesman: " + commission);
        }
        else if(sales>=10000 && sales<=50000)
        {
            double commission = (8.0/100.0)*sales;
            System.out.println("Commission of the salesman: " + commission);
        }
        else if(sales>50000)
        {
            double commission = (10.0/100.0)*sales;
            System.out.println("Commission of the salesman: " + commission);
        }
        else
        {
            System.out.println("Invalid value entered");
        }
        
    }
    
}   