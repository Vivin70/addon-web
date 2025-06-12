package file_handling;

import java.io.*;
import java.util.*;

public class EmployeeFileSystem {
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Record System (File-Based)");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addEmployee(scanner);
                case 2 -> viewEmployees();
                case 3 -> updateEmployee(scanner);
                case 4 -> deleteEmployee(scanner);
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            writer.write(name + "," + age + "\n");
            System.out.println("Employee added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void viewEmployees() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\nEmployee List:");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Name: " + data[0] + ", Age: " + data[1]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void updateEmployee(Scanner scanner) {
        List<String> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.print("Enter Employee Name to update: ");
        scanner.nextLine();
        String targetName = scanner.nextLine();
        System.out.print("Enter New Age: ");
        int newAge = scanner.nextInt();

        boolean updated = false;
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (String emp : employees) {
                String[] data = emp.split(",");
                if (data[0].equalsIgnoreCase(targetName)) {
                    writer.println(data[0] + "," + newAge);
                    updated = true;
                } else {
                    writer.println(emp);
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }

        System.out.println(updated ? "Employee updated successfully!" : "Employee not found.");
    }

    private static void deleteEmployee(Scanner scanner) {
        List<String> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.print("Enter Employee Name to delete: ");
        scanner.nextLine();
        String targetName = scanner.nextLine();

        boolean deleted = false;
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (String emp : employees) {
                String[] data = emp.split(",");
                if (data[0].equalsIgnoreCase(targetName)) {
                    deleted = true;
                } else {
                    writer.println(emp);
                }
            }
        } catch (IOException e) {
            System.out.println("Error deleting from file: " + e.getMessage());
        }

        System.out.println(deleted ? "Employee deleted successfully!" : "Employee not found.");
    }
}

