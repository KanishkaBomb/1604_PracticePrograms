class Date
{
    int date,month,year;
    Date(int date, int month, int year)
    {
        this.date=date;
        this.month=month;
        this.year=year;
    }
    Date()
    {
        date=20;
        month=1;
        year=2021;
    }
    void display()
    {
        System.out.println(date+"/"+month+"/"+year);
    }
    public static void main()
    
    {
        
        Date obj= new Date(28,7,2020);
        obj.display();
    }
}