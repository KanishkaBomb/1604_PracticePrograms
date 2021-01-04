import java.util.*;
public class Railway_Ticket
{
    String name;
    String coach;
    long mobno;
    int amt, totalamt;
    
    public Railway_Ticket()
    {
        name = "";
        coach = "";
        mobno = 0;
        amt= 0;
        totalamt =0;
    }
    
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer, his/her mobile number and the coach.");
        name = sc.next();
        mobno = sc.nextLong();
        coach= sc.next();
    }
    
    void update()
    {
        if(coach.equals("First_AC"))
        {
           totalamt = 700;
        }
        else if(coach.equals("Second_AC"))
        {
            totalamt=500;
        }
        else if(coach.equals("Third_Ac"))
        {
            totalamt = 250;
        }
        else if(coach.equals("Sleeper"))
        {
            System.out.println("None");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
    
    void display()
    {
        System.out.println("Name of the customer:"+ name);
        System.out.println("Mobile number of the customer:"+ mobno);
        System.out.println("Coach type selected by the customer:"+ coach);
        System.out.println("Total amount to be paid:"+ totalamt);
    }
    
    public static void main()
    {
        Railway_Ticket obj = new  Railway_Ticket();
        obj.accept();
        obj.update();
        obj.display();
    }
}