import java.util.Scanner;
 public class Demo1
 {
     int x;
     public Demo1()
     {
         x = 0;
     }
     public Demo1 (int x)
     {
             this.x = x;
     }
     
     void display()
     {
         System.out.println(x);
     }
     
     public static void main()
     {
           Demo1 obj=new Demo1();
           System.out.println("Value of Default constructor:");
           obj.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a value to initialize the variable");
           int x = sc.nextInt();
           Demo1 obj1 = new Demo1( x);
           System.out.println("Value of parameterised constructor:");
           obj1.display();
     }
 }
