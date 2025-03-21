package insurance;

import java.util.Scanner;

public class InsuranceEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you married? (yes/no): ");
        String maritalStatus = scanner.next().trim().toLowerCase();

        
        if (maritalStatus.equals("yes")) {
            System.out.println("You are eligible for insurance.");
        } 
        else if (maritalStatus.equals("no")) {
         
            System.out.print("Enter your gender (male/female): ");
            String gender = scanner.next().trim().toLowerCase();

            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            
            if ((gender.equals("male") && age >= 30) || (gender.equals("female") && age >= 25)) {
                System.out.println("You are eligible for insurance.");
            } else {
                System.out.println("You are NOT eligible for insurance.");
            }
        } else {
            System.out.println("Invalid input.");
        }

      
    }
}
	


