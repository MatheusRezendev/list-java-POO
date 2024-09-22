package ListSOLID_POO.exe12_bank;

public class AccountController {

    Account account;
    double balance = account.getBalance();
    int accountNumber = account.getAccountNumber();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void transfer(AccountController destinationAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to account " + account.getAccountNumber());
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }
}
