//WAP to generate 20 unique random numbers within the range of 1 to 100
public class Question_3
{
    public static void main()
    {
        int max=100;
        int min= 1;// storing the maximum and minimum value
        for(int i =1;i <=20;i++)
        {
            
            System.out.println( Math.random()*(max-min+1)+min);
        }
    }
}