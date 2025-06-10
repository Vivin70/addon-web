import java.util.Scanner;

class DefaultConstructor {
    String name;
    int year;
    String language;

    // Parameterized constructor
    DefaultConstructor(String name, int year, String lang) {
        this.name = name;
        this.year = year;
        this.language = lang;
    }

    // Copy constructor
    DefaultConstructor(DefaultConstructor copy) {
        this.name = copy.name;
        this.year = copy.year;  // fixed typo
        this.language = copy.language;
    }

    // Display method
    void Display() {
        System.out.println("UNDefault Constructor: " + name + " " + year);
       
    }

    public static void main(String[] args) {
        System.out.println("Original constructor:");
        DefaultConstructor ref = new DefaultConstructor("Java", 1995, "Programming");
        ref.Display();

        System.out.println("Copy constructor:");
        DefaultConstructor ref2 = new DefaultConstructor(ref);
        ref2.Display();
    }
}
