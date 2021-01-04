import java.util.*;
public class Test_Array
{
   Scanner sc = new Scanner(System.in);
   int len, sum =0, avg;
   int array [];
  
    Test_Array() // constructor to initialize the length of the array 
    {
         len =10;
         array = new int [len];
    }

    
     void input()
     {
         for(int i=0;i<len;i++) // initializing value at each index of the array 
         {
            System.out.println("Enter a number");
            array [i] = sc.nextInt(); 
         }
     }

     void compute()
     {
         for(int i=0;i<len;i++)
         {
            sum = sum + array[i]; 
         } 
         avg = sum/10; // calculating sum and average 
     }

     void display() // method to display the calculated sum and average
     {
         System.out.println("Sum of the 10 numbers= " + sum);
         System.out.println("Average of the 10 numbers= " + avg);
     }
   
     public static void main()
     {
        Test_Array obj = new Test_Array();// object creation
        obj.input();
        obj.compute(); 
        obj.display(); // calling methods
     }
}