class Counter {
    int seats = 5;

    synchronized void book(String name, int req) {
        System.out.println(name + " booking " + req);
        if (seats >= req) {
            try { Thread.sleep(500); } catch (Exception e) {}
            seats -= req;
            System.out.println(name + " booked. Left: " + seats);
        } else System.out.println("Not enough seats for " + name);
    }
}

public class TicketApp {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable r1 = () -> c.book("User1", 2);
        Runnable r2 = () -> c.book("User2", 2);
        Runnable r3 = () -> c.book("User3", 2);
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
    }
} 








import java.util.*;
import java.io.*;

public class StudentApp {
    static Map<String, List<String>> data = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add\n2.Course\n3.Search\n4.Delete\n5.Save\n6.Exit");
            switch (sc.nextInt()) {
                case 1 -> data.put(prompt(sc, "ID: "), new ArrayList<>());
                case 2 -> {
                    String id = prompt(sc, "ID: "), course = prompt(sc, "Course: ");
                    data.computeIfAbsent(id, k -> new ArrayList<>()).add(course);
                }
                case 3 -> System.out.println(data.getOrDefault(prompt(sc, "ID: "), List.of("No record")));
                case 4 -> {
                    data.remove(prompt(sc, "ID: "));
                    System.out.println("Deleted.");
                }
                case 5 -> {
                    try (BufferedWriter w = new BufferedWriter(new FileWriter("courses.txt"))) {
                        for (var e : data.entrySet())
                            w.write(e.getKey() + " -> " + e.getValue() + "\n");
                    }
                    System.out.println("Saved.");
                }
                case 6 -> System.exit(0);
            }
        }
    }

    static String prompt(Scanner sc, String msg) {
        System.out.print(msg);
        sc.nextLine(); // consume newline
        return sc.nextLine();
    }
}

