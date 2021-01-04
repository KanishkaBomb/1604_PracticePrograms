public class pattern_practice
{
    public static void main()
    {
        int x;
        for (int i=1;i<=4;i++)
        {
            x =i;
            for (int j =1;j<=i;j++)
            {
                System.out.print(x--);
            }
            System.out.println();
        }
    }
}