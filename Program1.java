import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: Area = pi * radius^2
        double area = Math.PI * Math.pow(radius, 2);
        
        // Print the result
        System.out.println("The area of the circle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}