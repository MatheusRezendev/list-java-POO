package ListSOLID_POO.exe2_bank_count;

public class OperationsBank {

    private double deposit;
    private double withdraw;

    public double makeADeposit(BankAccount bankAccount){
        return bankAccount.getBalance() + deposit;
    }

    public double makeAWithdraw(BankAccount bankAccount){
        return bankAccount.getBalance() - withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }
}
