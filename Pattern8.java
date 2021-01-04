/*
12345
23455
34555
45555
55555*/
public class Pattern8
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            int x =i;
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(x++);
            }
            for(int k =1;k<=i;k++)
            {
                System.out.print("5");
            }
            System.out.println();
        }
    }
}