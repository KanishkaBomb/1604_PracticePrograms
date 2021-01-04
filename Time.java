import java.util.*;
public class time
{
    int h,m;
    
    public time()
    {
        h = 0;
        m=0;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        h =sc.nextInt();
        m = sc.nextInt();
    }
    
    public time add (time obj) //formal parameter = mention data type = in function prototype   
    {
        time t = new time();
        t.h = h + obj.h;
        t.m = m + obj.m;
        if(t.m >= 60)
        {
            t.m = t.m - 60;
            t.h = t.h +1;
        }
        return t;
    }
    
    public void display()
    {
        System.out.println("t.m:" + m + "\n"+ "t.h:" + h);
    }
    
    public static void main()
    {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();
        t1.input();
        t2.input();
        t3 = t1.add(t2); //actual parameter = calling statement= no need to mention data type 
        t1.display();
        t2.display();
        t3.display();  // call by reference when we pass objects as parameters
    }
}