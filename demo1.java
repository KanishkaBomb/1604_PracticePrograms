// WAP using return statement
public class demo1
{
    int num1,num2,ans;
    void init(int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }
    double calc()
    {
        ans= num1+num2;
        return ans;
    }
    public static void main()
    {
        demo1 obj= new demo1();
        obj.init(7,20);
        double ans= obj.calc();
        System.out.println(ans);
        }
        }
        
        
