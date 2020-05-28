public class demo
{
    int num1,num2,ans;
    void init(int a, int b) //non parametrized, void, called single method
    {
        num1=a;
        num2=b;//body of the prog
    }
    void calc()
    {
        ans= num1+num2;
    }
    void display()
    {
        System.out.println(ans);
    }
}
        