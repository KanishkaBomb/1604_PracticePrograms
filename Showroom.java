import java.util.Scanner;
public class Showroom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    
    public Showroom()
    {
        name ="";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name = sc.nextLine();
        System.out.println("Enter the mobile number");
        mobno = sc.nextLong();
        System.out.println("Enter the cost of the article");
        cost = sc.nextInt();
    }
    
    void calculate()
    {
        if(cost <=10000)
        {
            dis = (5.0/100) * cost;
            amount = cost - dis;
        }
        else if(cost>1000 && cost <= 20000)
        {
            dis = (10.0/100) * cost;
            amount = cost - dis;
        }
        else if(cost > 20000 && cost <=35000)
        {
            dis = (15.0/100) * cost;
            amount = cost - dis;
        }
        else if(cost>35000)
        {
            dis = (20.0/100)*cost;
            amount = cost - dis;
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
    
    void display()
    {
        System.out.println("Name of the customer" + name);
        System.out.println("Mobile number:" + mobno);
        System.out.println("Amount to be paid after discount:" + amount);
    }
    
    public static void main()
    {
        Showroom obj = new Showroom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}