/*
1 2 3 4 5 
1 2 3 4 1
1 2 3 1 2
1 2 1 2 3
1 1 2 3 4 */ 

public class Pattern6
{
    public static void main()
    {
        for(int i =1; i<=5;i++)
        {
            for(int j =1; j<=6-i;j++)
            {
                System.out.print(j);
            }
            for(int k =1;k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}