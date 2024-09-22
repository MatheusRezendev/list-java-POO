package ListSOLID_POO.exe12_bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryClients {
    private Map<String, Client> clients;

    public RepositoryClients() {
        this.clients = new HashMap<>();
    }

    public void addClient(Client client) {
        clients.put(client.getCpf(), client);
        System.out.println("Client added successfully: " + client.getName());
    }

    public Client searchClientCpf(String cpf) {
        return clients.get(cpf);
    }
}
