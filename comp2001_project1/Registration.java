
/**
 * COMP 2001 Fall 2021 Assignment 2
 *
 * @author (Emad Salimm, Nurul Islam and Rishi Gandhi.)
 * @version (13th October 2021)
 */
public class Registration
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private int section;
    private int timeSlot;
    private String student;
    private String professor;

    /**
     * Constructor for objects of class Registration
     */
    public Registration(String courseNumber, int section, int slot, 
                      String student,String professor)
    {
        // initialise instance variables
          if(verifyCourseNumber(courseNumber)==true)
        {
            this.courseNumber = courseNumber;
        }
        
        if(verifySection(section)==true)
        {
            this.section = section;
        }
        
        if(verifySlot(slot)==true)
        {
            this.timeSlot = slot;
        }
        
        this.student = student;
        this.professor = professor;
        
    }
    
    private boolean verifyCourseNumber(String courseNumber)
    {
        if( courseNumber.equals("COMP 1501") || courseNumber.equals("ENGL 2201") || courseNumber.equals("CHEM 3060") || courseNumber.equals("PHYS 2344")
        || courseNumber.equals("ENGL 2005") || courseNumber.equals("COMP 2704") || courseNumber.equals("PHYS 2377") || courseNumber.equals("CHEM 4927")
        || courseNumber.equals("COMP 3444") ) 
        {
            return true;
        }
        else{
            return false;
        }

        
    }
    
    private boolean verifySection(int section)
    {
        if(section >= 0 && section <=2)
            return true;
        else
        {
            return false;
        }
    }
    
    private boolean verifySlot (int slot)
    {
         if(slot >= 12 && slot <= 25)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void printInfo()
    {
       // print all the information about the enrollment record
       // each field on a new line
        System.out.println("The course number is: "+this.courseNumber);
        System.out.println("The section is: "+this.section);
        System.out.println("The time slot is: "+this.timeSlot);
        System.out.println("Student: "+this.student);
        System.out.println("Professor: "+this.professor);
    }
    
    public String getProfessor() 
        {
            return professor;
        }
   
    public int getSection() 
        {
            return section;
        }
    public String getStudent() 
        {
            return student;
        }   
    public int getSlot()
        {
            return timeSlot;
        }   
    public String getCourseNumber()
        {
            return courseNumber;
        }   
    
}