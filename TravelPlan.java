import java.util.*;
class TravelPlan
{
    Scanner sc = new Scanner(System.in);
    private long PlanCode;
    private String Place;
    private int Number_of_travellers, Number_of_buses; //declaring private members 
    
    public TravelPlan()
    {
        PlanCode = 1001L;
        Place = "Agra";
        Number_of_travellers = 5;
        Number_of_buses = 1; //initialising private members 
    }
    
    void NewPlan()
    {
        System.out.println("Enter the Plan Code"); // taking data from user 
        PlanCode = sc.nextLong();
        System.out.println("Enter the Place");
        Place = sc.next();  
        System.out.println("Enter the number of travellers");
        Number_of_travellers = sc.nextInt();
        
        if(Number_of_travellers<20) //assigning number of buses as per the number of travellers 
        {
            Number_of_buses =1;
        }
        else if(Number_of_travellers>=20 && Number_of_travellers<40)
        {
            Number_of_buses =2;
        }
        else
        {
            Number_of_buses =3;
        }
    }
    
    void ShowPlan()
    {
        NewPlan();
        System.out.println("Plan Code: " + PlanCode);
        System.out.println("Place: " + Place);
        System.out.println("Number of Travellers: " + Number_of_travellers);
        System.out.println("Number of Buses: " + Number_of_buses); // to display all the data members 
    }
    
    public static void main()
    {
        TravelPlan obj = new TravelPlan(); //object creation 
        obj.ShowPlan();
    }
}