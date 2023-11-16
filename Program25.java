// Interface for employees
public interface Employee {
    // Method to calculate the salary
    double calculateSalary();
}

// FullTimeEmployee class implementing the Employee interface
public class FullTimeEmployee implements Employee {
    private double salary;

    // Constructor to set the salary for a full-time employee
    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    // Implementation of calculateSalary method for full-time employees
    @Override
    public double calculateSalary() {
        return salary; // For simplicity, full-time employee's salary is returned as is
    }
}

// PartTimeEmployee class implementing the Employee interface
public class PartTimeEmployee implements Employee {
    private double hoursWorked;
    private double ratePerHour;

    // Constructor to set hoursWorked and ratePerHour for a part-time employee
    public PartTimeEmployee(double hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Implementation of calculateSalary method for part-time employees
    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour; // Salary calculation for part-time employee
    }
}

public class Program25 {
    public static void main(String[] args) {
        // Creating a FullTimeEmployee with a salary of 50000
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000);

        // Creating a PartTimeEmployee who worked 40 hours at a rate of 15 per hour
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(40, 15);

        // Calculating salaries
        double fullTimeSalary = fullTimeEmployee.calculateSalary();
        double partTimeSalary = partTimeEmployee.calculateSalary();

        // Displaying the calculated salaries
        System.out.println("Full-Time Employee Salary: " + fullTimeSalary);
        System.out.println("Part-Time Employee Salary: " + partTimeSalary);
    }
}
