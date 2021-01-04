/* 12222
   2333
   344
   45
   5
   */
import java.util.*;
  public class Pattern4
  {
      public static void main()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of lines");
          int line_no = sc.nextInt();
          
          for(int i = 1; i<=line_no;i++)
          {
              for(int j =1;j>0;j--)
              {
                  System.out.print(i);
              }
              for(int k =1;k<= line_no - i;k++)
              {
                  System.out.print(i+1);
              }
              System.out.println();
          }
          }
      }