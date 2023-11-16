import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // A year is a leap year if it is divisible by 400 or if it is divisible by 4
        // but not by 100.
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}