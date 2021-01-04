import java.util.Scanner;
 public class Demo
 {
     int x;
     public Demo()
     {
         x = 0;
     }
     public Demo (int x)
     {
             this.x = x;
     }
     
     void display()
     {
         System.out.println(x);
     }
     
     public static void main()
     {
           Demo obj=new Demo();
           System.out.println("Value of Default constructor:");
           obj.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a value to initialize the variable");
           int x = sc.nextInt();
           Demo obj1 = new Demo( x);
           System.out.println("Value of parameterised constructor:");
           obj1.display();
     }
 }
