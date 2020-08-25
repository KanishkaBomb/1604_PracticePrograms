public class Special
{
    public static void main(int n)
    {
        int t1=n,rem,spe=0,fact=1;
        while(t1!=0)
        {
            rem=t1%10;
            for(int i=rem;i>0;i--)
            {
                fact=fact*i;
            }
            spe=spe+fact;
            t1=t1/10;
            }
            if(spe==n)
            {
                System.out.println("Special No.");
                }
                else
                {
                    System.out.println("Not a special no.");
                    }
                    }
                }