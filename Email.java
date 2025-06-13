import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> people = new HashSet<>();

        people.add("Abdul - abdul@example.com");
        people.add("Nawas - nawas@example.com");
        people.add("Vivin - vivin@example.com");

        for (String person : people) {
            System.out.println(person);
        }
    }
}

