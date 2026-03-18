import java.util.Scanner;
public class Calculategrade {
    public static void main(String[] args) {
        System.out.println("Please enter your grade");
        Scanner input = new Scanner(System.in);
        double grade = input.nextDouble();
        if (grade >= 0 && grade <= 39) {
            System.out.println("fail");
        } else if (grade >= 40 && grade <= 54) {
            System.out.println("pass");
        } else if (grade >= 55 && grade <= 69) {
            System.out.println("merit");
        } else if (grade >= 70 && grade <= 100) {
            System.out.println("distinction");
        }

    }

}