package week3.HomeAssignment;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The amount given must be greater than 0");
        }
    }

    public double withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return amount;
        } else {
            return 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }
}
