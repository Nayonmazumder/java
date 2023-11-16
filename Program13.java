import java.util.Scanner;

public class Program13 {

    public static boolean isPalindrome(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}