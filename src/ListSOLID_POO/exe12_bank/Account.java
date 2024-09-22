package ListSOLID_POO.exe12_bank;

public class Account {

    private int accountNumber;
    private double balance;
    private Client client;

    public Account(int accountNumber, Client client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + "\nInto account: " + accountNumber + "\nNew balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + "\nfrom account: " + accountNumber + "\nNew balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transferred: $" + amount + "\nto account: " + destinationAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }
}
