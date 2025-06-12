package file_handling;


import java.io.*;
import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "students.txt";
        while(true)
        {
        System.out.println("Choose an option:");
        System.out.println("1: Write student data to file");
        System.out.println("2: Read student data from file");
        System.out.println("3: Display lowest and average score");
        System.out.println("4: exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                writeToFile(fileName, scanner);
                break;
            case 2:
                List<Student> students = readFile(fileName);
                if (students.isEmpty()) {
                    System.out.println("No student data found.");
                } else {
                    students.forEach(System.out::println);
                }
                break;
            case 3:
                students = readFile(fileName);
                if (students.isEmpty()) {
                    System.out.println("No student data available for calculation.");
                } else {
                    int lowest = calculateLowest(students);
                    double average = calculateAverage(students);
                    System.out.println("Lowest score: " + lowest);
                    System.out.println("Average score: " + average);
                }
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        }

        //scanner.close();
    }

    static void writeToFile(String filename, Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.println("Enter student name and score (comma separated): ");
            String input = scanner.nextLine();
            writer.write(input);
            writer.newLine();
            System.out.println("Student data saved.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    static List<Student> readFile(String filename) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    students.add(new Student(parts[0], Integer.parseInt(parts[1])));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return students;
    }

    static int calculateLowest(List<Student> students) {
        return students.stream().mapToInt(s -> s.score).min().orElse(0);
    }

    static double calculateAverage(List<Student> students) {
        return students.stream().mapToInt(s -> s.score).average().orElse(0);
    }

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + " - " + score;
        }
    }
}
