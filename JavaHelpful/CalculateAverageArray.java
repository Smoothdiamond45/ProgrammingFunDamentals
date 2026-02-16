import java.util.Scanner;
public class CalculateAverageArray
{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Step 1: Take array size input
       System.out.print("Enter the number of elements: ");
       int n = scanner.nextInt();
       
       // Step 2: Initialize array and variables
       int[] numbers = new int[n];
       int sum = 0;
       
       // Step 3: Take array elements as input
       System.out.println("Enter " + n + " numbers:");
       for (int i = 0; i < n; i++) {
           numbers[i] = scanner.nextInt();
           sum += numbers[i]; // Add each element to sum
       }
       
       // Step 4: Calculate and display average
       double average = (double) sum / n;
       System.out.println("The average is: " + average);
       scanner.close();
   }
}

