package ListSOLID_POO.exe12_bank;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    private RepositoryAccounts repAccounts;
    private RepositoryClients repClients;

    public Bank() {
        this.repAccounts = new RepositoryAccounts();
        this.repClients = new RepositoryClients();
    }

    public void registerClient(String name, String cpf){
        Client newClient = new Client(name, cpf);
        repClients.addClient(newClient);
    }

    public void registerAccount(String cpf){
        Client client = repClients.searchClientCpf(cpf);
        if(client != null){
            repAccounts.addAccount(client);
        } else {
            System.out.println("Client with to CPF " + cpf + " does not exists");
        }
    }

    public void deposit(int numberAccount, int amount){
        Account account = repAccounts.searchAccountNumber(numberAccount);
        if(account != null){
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int numberAccount, int amount){
        Account account = repAccounts.searchAccountNumber(numberAccount);
        if(account != null){
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void transfer(int fromAccount, int toAccount, int amount){
        Account from = repAccounts.searchAccountNumber(fromAccount);
        Account to = repAccounts.searchAccountNumber(toAccount);
        if(from != null && to != null && from.getBalance() >= amount){
            from.transfer(to, amount);
        } else {
            System.out.println("Transfer failed");
        }
    }

}
