public class BankAccountPractice {

    public static void main(String[] args) {

        // Create a BankAccount object
        BankAccount account = new BankAccount("12345", 1000.00);

        // GETTERS
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Starting balance: $" + account.getBalance());


        // DEPOSIT AND WITHDRAW
        account.deposit(500.00);
        System.out.println("After deposit: $" + account.getBalance());

        account.withdraw(200.00);
        System.out.println("After withdrawal: $" + account.getBalance());


        // SETTERS
        account.setAccountNumber("67890");
        account.setBalance(2000.00);

        System.out.println("New account number: " + account.getAccountNumber());
        System.out.println("New balance: $" + account.getBalance());


        // TEST THE VALIDATION
        account.setAccountNumber("");
        account.setBalance(-500.00);
    }
}


class BankAccount {

    // PRIVATE FIELDS
    private String accountNumber;
    private double balance;

    // DEFAULT ACCESS
    double minimumBalance;

    // PROTECTED ACCESS
    protected double interestRate;

    // PUBLIC ACCESS
    public String bankName;


    // CONSTRUCTOR
    public BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;

        minimumBalance = 0;
        interestRate = 4.5;
        bankName = "Trusted Bank";
    }


    // GETTER FOR ACCOUNT NUMBER
    public String getAccountNumber() {
        return accountNumber;
    }


    // SETTER FOR ACCOUNT NUMBER
    public void setAccountNumber(String accountNumber) {

        if (accountNumber != null && !accountNumber.isBlank()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number!");
        }
    }


    // GETTER FOR BALANCE
    public double getBalance() {
        return balance;
    }


    // SETTER FOR BALANCE
    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }


    // DEPOSIT
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }


    // WITHDRAW
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}