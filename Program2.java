import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of the series is: " + sum);

        scanner.close();
    }
}