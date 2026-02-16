
import java.util.Scanner;
public class Driver
{
    private String name;
    private String address;
    private String dateOfBirth;
    private double height;
    Scanner myObj = new Scanner(System.in);
   

    public Driver()
    {
        System.out.println("Please enter your full name");
        String name = myObj.nextLine();
        
        System.out.println("Please enter your address");
        String address = myObj.nextLine();
        
        System.out.println("Please enter your date of birth");
        String dateOfBirth = myObj.nextLine();
        
        System.out.println("Please enter your rough height");
        double height = myObj.nextDouble();
        
        
        System.out.println("Entered Details");
        System.out.println("-------------------");
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Date of Birth is: " + dateOfBirth);
        System.out.println("Height: " + height);
    }
   
    
}