// Class that demonstrates encapsulation
public class BankAccount {
    // Private fields - can't be accessed directly from outside the class
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String holderName, String accNumber, double initialBalance) {
        this.accountHolderName = holderName;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // Public method to get account holder name (read-only access)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public method to get current balance (read-only access)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money (controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money (controlled access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
