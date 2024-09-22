package ListSOLID_POO.exe12_bank;

import ListSOLID_POO.exe2_bank_count.BankAccount;

public class BankController {

    private Account account;
    private Client client;
    double balance = account.getBalance();

    public BankController() {
    }

    public void makeWithdrawal(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.print("Withdraw successful: $" + balance);
        } else{
            System.out.println("Insufficient balance");
        }

    }

    public void makeDeposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.print("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void makeTransfer(Account accountDestination, double amount){
        if(amount > 0 && amount <= balance){
            this.balance -= amount;
            account.deposit(amount);
            System.out.print("Transfer successful: $" + amount + "for the destination: $" + accountDestination.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
