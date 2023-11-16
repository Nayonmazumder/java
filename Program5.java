import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        int resultRecursive = fibonacciRecursive(n);
        int resultNonRecursive = fibonacciNonRecursive(n);

        System.out.println("Using recursive function: " + resultRecursive);
        System.out.println("Using non-recursive function: " + resultNonRecursive);
    }

    // Recursive function to calculate nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive function to calculate nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1)
            return n;
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}