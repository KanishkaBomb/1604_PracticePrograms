import java.util.*;
 public class movieMagic
{
     int year;
     String title;
     float rating;
          
    public movieMagic()
    {
        year = 0;
        rating = 0.0f;
        title = "";
    }
    void accept()
     {
         Scanner movie = new Scanner(System.in);
         System.out.println("Enter the year of release of the movie");
         year = movie.nextInt();
         System.out.println("Enter the title of the movie");
         title = movie.next();
         System.out.println("Enter the rating of the movie between 0.0 and 5.0");
         rating = movie.nextFloat();
     } 
                
    void display()
     {
          System.out.println("Title of the movie:" + title);
          System.out.println("Year of release:" + year);
           if(rating<=2.0)
           { 
               System.out.println("Flop");
            }
            else if (rating>=2.1 && rating <=3.4)
            {
               System.out.println("Semi-hit");
             }
            else if(rating>=3.5 && rating <=4.5)
             {
                System.out.println("Hit");
              }
            else
            {
                System.out.println("Super Hit");
           }
     }

    public static void main()
    {
        movieMagic obj = new movieMagic();
        obj.accept();
        obj.display();
    }
                        
}
