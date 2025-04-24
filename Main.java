public class Main {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("Md Ebrahim", "123456789", 5000.00);

        // Accessing data through public methods
        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Performing operations
        myAccount.deposit(1500);
        myAccount.withdraw(2000);
        myAccount.withdraw(6000); // Should fail
    }
}
