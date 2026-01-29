import java.util.Scanner;

public class FindLargestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible value

        System.out.println("Enter integers (negative number to stop):");

        while (true) {
            int input = scanner.nextInt();

            if (input < 0) {
                break; // Stop reading when a negative number is entered
            }

            if (input > largest) {
                largest = input; // Update largest if the current input is greater
            }
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No valid input was entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
        }

        scanner.close();
    }

}
