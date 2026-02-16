import java.util.Scanner;

public class JokeGenerator {

    // Method 1: No parameters, no return
    public void tellJoke() {
        System.out.println("Why don’t programmers like nature? It has too many bugs!");
    }

    // Method 2: Parameter, no return
    public void tellStory(String name) {
        System.out.println("Once upon a time, " + name + " tried to debug code at 3am...");
        System.out.println("The bug fixed itself. Legends still talk about it.");
    }

    // Method 3: Parameter and return value
    public String ageInTenYears(int age) {
        int futureAge = age + 10;
        return "In 10 years, you'll be " + futureAge + " years old — still debugging!";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an object of JokeGenerator
        JokeGenerator joker = new JokeGenerator();

        // 1. Tell a joke
        joker.tellJoke();

        // 2. Ask for name and tell a story
        System.out.print("\nEnter your name: ");
        String userName = input.nextLine();
        joker.tellStory(userName);

        // 3. Ask for age and give future message
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();
        String message = joker.ageInTenYears(age);
        System.out.println(message);
    }
}
