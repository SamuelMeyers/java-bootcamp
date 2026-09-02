public class Account {

    // Private means outside code cannot directly access balance
    private double balance;


    // Constructor
    public Account(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative");
        }

        balance = initialBalance;
    }


    // Deposit money
    public void deposit(double amount) {

        // Reject zero or negative deposits
        if (amount <= 0) {
            System.out.println(
                    "Deposit rejected: amount must be positive.");
            return;
        }

        balance += amount;
    }


    // Withdraw money
    public boolean withdraw(double amount) {

        // Reject zero/negative amounts OR amounts larger than balance
        if (amount <= 0 || amount > balance) {
            System.out.println("Withdrawal rejected.");
            return false;
        }

        balance -= amount;
        return true;
    }


    // Getter - allows balance to be READ
    public double getBalance() {
        return balance;
    }


    // Exercise 3 will override this method
    public String getAccountType() {
        return "Account";
    }
}