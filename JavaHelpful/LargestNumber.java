import java.util.*;
public class LargestNumber {
    // Method to find the largest number in an array using a for loop
    public static int findLargest(int[] numbers) {
        int max = numbers[0];  // Assume the first number is the largest

        // Loop through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // Update max if current number is larger
            }
        }
        return max;  // Return the largest number found
    }

    // Main method to take user input and display the largest number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and display the largest number
        int largest = findLargest(numbers);
        System.out.println("Largest number: " + largest);
        
        scanner.close();  // Close the scanner
    }
}   

