
import java.util.Scanner;

class Bank {
    private String accountNumber;
    private double balance;

    public Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Bank bank = new Bank(accountNumber, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bank.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bank.withdraw(withdrawAmount);

        bank.display();

        scanner.close();
    }
}
