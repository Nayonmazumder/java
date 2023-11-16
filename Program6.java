import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter Employee Name:");
            String name = reader.readLine();

            System.out.println("Enter Employee ID:");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("Enter Employee Age:");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Age: " + age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
