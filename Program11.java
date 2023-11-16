import java.util.Scanner;

class SalaryCalculator {
    private double[] monthlySalary;

    // Parameterized constructor
    public SalaryCalculator(double[] monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double totalSalary = 0.0;

        for (double salary : monthlySalary) {
            totalSalary += salary;
        }

        return totalSalary;
    }
}

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner; 
        scanner = new Scanner(System.in);
        double[] monthlySalary = new double[12];

        // Accepting salary data from user
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter salary for month " + (i + 1) + ": ");
            monthlySalary[i] = scanner.nextDouble();
        }

        // Creating an instance of SalaryCalculator class
        SalaryCalculator calculator = new SalaryCalculator(monthlySalary);

        // Calculating gross salary
        double grossSalary = calculator.calculateGrossSalary();

        System.out.println("Gross Salary: " + grossSalary);
    }
}