public class Library
{
     int acc_num;
     String title;
     String author;

     void input( int acc_num1, String title1, String author1) //initialising values
     {
      acc_num = acc_num1;
      title= title1;
      author= author1;
      }
     int compute(int day)
      {
       int fine= day*2;
       return fine; //calculation of fine for returning late
      }
     void display()
     {
         System.out.println("Accession Number" +"\t"+"Title"+ "\t"+"Author"  );
         System.out.println(acc_num + "\t"+ title +"\t"+ author);
     }
      public static void main()
      {
        Library obj= new Library();
        obj.input(2001, "The Sign Of Four", "Arthur Conan Doyle");
        obj.compute(3);
        obj.display();//calling methods
      }
}



