import java.util.*;
public class driverAN
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        addNum adding = new addNum();
        
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter a second number");
        int num2 = input.nextInt();
        System.out.println("Please enter a third number");
        int num3 = input.nextInt();
        String message = adding.addingNumber(num1,num2,num3);  
        System.out.println(message);
        String message1 = adding.multiplyNumber(num1,num2,num3);  
        System.out.println(message1);
        String message2 = adding.biggestNumber(num1,num2,num3);  
        System.out.println(message2);
    }
}
