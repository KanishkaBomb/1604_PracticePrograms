public class Percentage
{
    void displaygrade(String name,double percent)
    {
        System.out.println("Student's name: "+ name+"\n"+ " Percentage of marks obtained is: "+percent);
        // Classifying the grade
        if(percent>=80 && percent<=100)
        {
            System.out.println(" Grade obtained is A");
        }
        else if (percent>=60 && percent<80)
        {
            System.out.println("Grade obtained is B");
        }
        else if(percent>=50 && percent <60)
        {
            System.out.println("Grade obtained is C");
        }
        else if(percent<50 && percent>=0)
        {
            System.out.println("Grade obtained is D");
        }
        else
        {
            System.out.println("Invalid percentage value");
        }
    }
}