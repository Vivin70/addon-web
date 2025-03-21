package BasicProgram;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number to convert:");
        double number = s.nextDouble();

        System.out.println("Choose conversion type: ");
        System.out.println("1. Convert to Miles");
        System.out.println("2. Convert to Kilometers");
        int choice = s.nextInt();

        if (choice == 1) {
            double miles = number * 0.621371; // Conversion factor
            System.out.println(number + " kilometers is " + miles + " miles.");
        } else if (choice == 2) {
            double kilometers = number / 0.621371; // Conversion factor
            System.out.println(number + " miles is " + kilometers + " kilometers.");
        } else {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }


    }
}

