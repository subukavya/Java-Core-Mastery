/*
 * Topic: Encapsulation
 *
 * Encapsulation is the process of wrapping data (variables)
 * and methods into a single unit (class).
 *
 * It is achieved by:
 * - Making variables private
 * - Providing public getter and setter methods
 *
 * Benefits:
 * - Data hiding
 * - Better security
 * - Controlled access to data
 *
 * This program demonstrates how to protect class data
 * using private variables and getter/setter methods.
 */

class BankAccount {

    // Private variables (Data hiding)
    private String accountHolderName;
    private double balance;

    // Public setter method
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Public getter method
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Controlled access using setter
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Setting values using setter methods
        account.setAccountHolderName("Kavya");
        account.setBalance(5000);

        // Accessing values using getter methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        System.out.println();

        // Trying to set invalid balance
        account.setBalance(-2000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
