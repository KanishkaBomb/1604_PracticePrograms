public class Bus_fare
{
    int dis;
    void distance(int dis)
    {
        this.dis = dis;
        
    }
    void fare_calc()
    {
        System.out.println(" Distance travelled: "+ dis);
        if(dis==1)
        {
            int fare= 4;
            System.out.println(" The fare is : Rs. "+ fare); 
        }
        else if(dis>1 && dis<=5)
        {
            int fare= (dis*4)+4;
            System.out.println("The fare is: Rs. " + fare);
        }
        else if(dis>5 && dis<=15)
        {
            int fare= (dis*6)+20;
            System.out.println("The fare is: Rs. " + fare);
        }
        else if(dis>15)
        {
            int fare = (dis*8)+80;
            System.out.println("The fare is: Rs. " + fare);
        }
    }
    public static void main()
    {
        Bus_fare obj = new Bus_fare();
        obj.distance(15);
        obj.fare_calc();
    }
}