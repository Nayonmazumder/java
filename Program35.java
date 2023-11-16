import java.util.Arrays;
import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String sortedString = sortAlphabetically(input);
        System.out.println("String in alphabetical order: " + sortedString);

        scanner.close();
    }

    public static String sortAlphabetically(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
