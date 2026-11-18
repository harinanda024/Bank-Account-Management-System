
class BankAccount {

    // Data members
    int accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance method
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating two bank account objects
        BankAccount account1 = new BankAccount(101, "Harinanda", 5000);
        BankAccount account2 = new BankAccount(102, "Anjali", 3000);

        // Operations on first account
        System.out.println("===== ACCOUNT 1 =====");

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();
        account1.displayDetails();

        System.out.println();

        // Operations on second account
        System.out.println("===== ACCOUNT 2 =====");

        account2.deposit(1000);
        account2.withdraw(500);
        account2.checkBalance();
        account2.displayDetails();

        System.out.println();

        // Testing insufficient balance
        System.out.println("===== WITHDRAWAL TEST =====");

        account2.withdraw(10000);

    }
}
