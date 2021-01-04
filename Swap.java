import java.util.*;
public class Swap //assignment answer 
{
     Scanner sc = new Scanner(System.in);
     int array [];
     int len;

      Swap() //constructor to initialize the length of the array
      {
          System.out.println("Enter the length of the array");
          len = sc.nextInt();
          array = new int [len]; 
      }

      void init() //initializing each index of the array with a value from user
      {
         for(int i=0;i<len;i++)
         {
             System.out.println("Enter a number");
             array[i] = sc.nextInt();
         }
      }
 
      void swap()
      {
          int temp;
          for(int i=0;i<len-1;i++)
          {
               if(i%2==0) //swapping of numbers if the index is even
               {
                   temp = array[i];
                   array [i] = array[i+1];
                   array[i+1] = temp;
               }
          }
      }
      
      void display()
      {
           for(int i=0;i<len;i++)
           {
               System.out.print(" "+ array[i]+ " ");
           }
      }
     
     public static void main()
     {
          Swap obj = new Swap(); //object creation
          obj.init();
          obj.swap();
          obj.display();
     }
}