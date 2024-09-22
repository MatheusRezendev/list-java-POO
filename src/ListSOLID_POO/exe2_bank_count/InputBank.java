package ListSOLID_POO.exe2_bank_count;

import java.util.Scanner;

public class InputBank {

    Scanner sc = new Scanner(System.in);
    OperationsBank operationsBank = new OperationsBank();
    BankAccount bank = new BankAccount("40028922", "Matheus", 2500);

    public void inputBank() {
        System.out.println("Which operation do you want to perform: \n 1 - Deposit \n 2 - Withdraw ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                double deposit = operationsBank.getDeposit();
                System.out.println("Enter the value : ");
                deposit = sc.nextDouble();
                System.out.println("Name: " + bank.getName());
                System.out.println("Balance: " + (String.valueOf(bank.getBalance() + deposit)));
                break;
            case 2:
                double withdraw = operationsBank.getWithdraw();
                System.out.println("Enter the value : ");
                withdraw = sc.nextDouble();
                System.out.println("Name: " + bank.getName());
                System.out.println("Balance: " + (String.valueOf(bank.getBalance() - withdraw)));
            default:
                System.out.println("Invalid operation");
        }
    }
}
