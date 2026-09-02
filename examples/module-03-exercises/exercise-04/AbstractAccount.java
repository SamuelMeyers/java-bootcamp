public abstract class AbstractAccount {

    protected double balance;

    public AbstractAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Every concrete subclass MUST implement this
    public abstract String getAccountType();
}
