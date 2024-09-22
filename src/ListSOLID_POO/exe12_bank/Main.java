package ListSOLID_POO.exe12_bank;

public class Main {
    public static void main(String[] args) {

        Bank b = new Bank();

        b.registerClient("Matheus", "12345678900");
        b.registerAccount("12345678900");

        b.deposit(1, 500);
        b.withdraw(1, 100);

        b.registerClient("Joao", "98765432100");
        b.registerAccount("98765432100");

        b.transfer(1, 2, 200);
    }
}


