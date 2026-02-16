import java.util.Scanner;

public class InputToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store strings
        String[] stringArray = new String[5]; // Adjust size as needed

        System.out.println("Enter a string to store in the array:");
        String input = scanner.nextLine(); // Read input as a string

        System.out.println("Enter the index where you want to store the string (0-4):");
        int index = scanner.nextInt(); // Read the index

        // Validate the index
        if (index >= 0 && index < stringArray.length) {
            stringArray[index] = input; // Store the input at the specified index
            System.out.println("String stored successfully!");
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and " + (stringArray.length - 1));
        }

        // Display the array contents
        System.out.println("Array contents:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Index " + i + ": " + stringArray[i]);
        }

        scanner.close();
    }
}
