import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        // Example array
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        String userInput = scanner.nextLine();

        // Finding the index
        int index = -1; // Default value if not found
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(userInput)) {
                index = i;
                break;
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
