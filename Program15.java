import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program15 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Eve");
        names.add("Bob");
        names.add("Daniel");
        names.add("Charlize");

        System.out.println("List before sorting:");
        for (String name : names) {
            System.out.println(name);
        }

        Collections.sort(names);

        System.out.println("\nList after sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}