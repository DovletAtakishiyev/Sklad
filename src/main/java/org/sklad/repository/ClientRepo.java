package org.sklad.repository;

import org.sklad.db.DB;
import org.sklad.model.Client;

public class ClientRepo {
    private final DB db = DB.getInstance();

    public void addClientToTable(Client client) {
        if (!isExists(client))
            db.clients.add(client);
        else
            System.out.println("Uje est");
    }

    public void setCurrentClient(Client client) {
        db.currentClient = client;
    }

    public Client getCurrentClient() {
        return db.currentClient;
    }

    private boolean isExists(Client client) {
        for (Client x : db.clients) {
            if (x.toString().equals(client)) {
                return true;
            }
        }
        return false;
    }
}
