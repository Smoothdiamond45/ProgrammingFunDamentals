import java.util.*;
public class DriverFT
{
    public static void main (String[] args){
        Scanner input =  new Scanner(System.in);
        
        FortuneTeller fortune = new FortuneTeller();
        
        fortune.sayRandomFortune();
        
        
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();
        fortune.personalFortune(name);
        
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();
        String message = fortune.futurePrediction(age);
        System.out.println(message);
    }
}
