import java.util.Scanner;
public class AngleProject
{
    private int Userinput;
    private int acute;
    private int rightA;
    private int obtuse;
    private int straight;
    private int reflex;
    Scanner myObj = new Scanner(System.in);
    
    public AngleProject()
    {
        System.out.println("Please enter the size of an angle: ");
        int Userinput = myObj.nextInt();
        
        if (Userinput < 90){
        System.out.println (" The angle " + Userinput + " is an acute angle!");
    }else if (Userinput == 90){
        System.out.println (" The angle " + Userinput + " is a right angle!");
    } else if (Userinput >90 && Userinput <=180){
        System.out.println (" The angle " + Userinput + " is a obtuse angle!");
    } else if (Userinput == 180){
        System.out.println (" The angle " + Userinput + " is a straight angle!");
    } else
        System.out.println (" The angle " + Userinput + " is a reflex angle!");
        
        
        
        
    }

    
}