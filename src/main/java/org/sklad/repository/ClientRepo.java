package org.sklad.repository;

import org.sklad.db.DB;
import org.sklad.model.Client;

public class ClientRepo {
    private final DB db = DB.getInstance();

    // Adding client to DB
    public void addClientToTable(Client client) {
        if (!isExists(client)) {
            db.clients.add(client);
            setCurrentClient(client);
        } else {
            System.out.println("Уже есть такой пользователь");
        }
    }

    // Setting currentClient
    private void setCurrentClient(Client client) {
        db.currentClient = client;
    }

    // Getting current client
    public Client getCurrentClient() {
        return db.currentClient;
    }

    // Is client already exists in DB
    private boolean isExists(Client client) {
        for (Client x : db.clients) {
            if (x.isEqualTo(client)) {
                return true;
            }
        }
        return false;
    }

    public void allClients(){
        for (Client client: db.clients) {
            System.out.println(client);
        }
    }
}
