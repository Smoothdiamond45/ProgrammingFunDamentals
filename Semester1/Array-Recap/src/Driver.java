import java.util.*;

public class Driver {

    private Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.exercise_1();
    }

    public void exercise_1() {

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("value " + (i+1)  + " is: " + numbers[i]);
        }
    }

}
