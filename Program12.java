import java.util.Scanner;

public class Program12 {
  
    public static int calculateHCF(int number1, int number2) {
        int smallerNumber = Math.min(number1, number2);
        int hcf = 1;
        
        for (int i = 1; i <= smallerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
        }
        
        return hcf;
    }

    public static int calculateLCM(int number1, int number2) {
        int greaterNumber = Math.max(number1, number2);
        int lcm = greaterNumber;

        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                break;
            }
            lcm += greaterNumber;
        }

        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        scanner.close();

        int hcf = calculateHCF(number1, number2);
        int lcm = calculateLCM(number1, number2);

        System.out.println("The HCF of " + number1 + " and " + number2 + " is: " + hcf);
        System.out.println("The LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }
}