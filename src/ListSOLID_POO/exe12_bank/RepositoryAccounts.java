package ListSOLID_POO.exe12_bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryAccounts {
    private Map<Integer, Account> accounts;
    private int nextNumberAccount;

    public RepositoryAccounts() {
        this.accounts = new HashMap<>();
        this.nextNumberAccount = 1;
    }

    public void addAccount(Client client) {
        Account newAccount = new Account(nextNumberAccount, client);
        accounts.put(nextNumberAccount, newAccount);
        System.out.println("Account created for the client: " + client.getName() + "\nNumber of this account is: " + accounts.get(nextNumberAccount).getAccountNumber());
        nextNumberAccount++;
    }

    public Account searchAccountNumber(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
