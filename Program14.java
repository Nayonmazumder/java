import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program14 {

    public static List<Integer> generatePrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;

        while (primes.size() < count) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of primes to generate: ");
        int count = scanner.nextInt();

        scanner.close();

        List<Integer> primeNumbers = generatePrimes(count);

        System.out.println("Generated prime numbers:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }
}