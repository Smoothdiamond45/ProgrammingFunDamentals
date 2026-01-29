import java.util.*;

public class Excercise2 {

    private Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        Excercise2 driver = new Excercise2();
        driver.exercise_2();
    }

    public void exercise_2() {

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("value " + (i+0)  + " is: " + numbers[i]);
        }
    }

}
