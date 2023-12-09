package org.sklad.repository;

import org.sklad.db.DB;
import org.sklad.model.Client;

public class ClientRepo {
    private final DB db = DB.getInstance();

    // Adding client to DB
    public void addClientToTable(Client client) {
        db.clients.add(client);
        setCurrentClient(client);
    }
    // Is client already exists in DB
    public boolean isExist(Client client) {
        for (Client dbClient : db.clients) {
            if (dbClient.isEqualTo(client, true)) {
                return true;
            }
        }
        return false;
    }

    // Setting currentClient
    private void setCurrentClient(Client client) {
        db.currentClient = client;
    }

    // Getting current client
    public Client getCurrentClient() {
        return db.currentClient;
    }

    public boolean checkCurrentClient(Client client){
        for (Client dbClient: db.clients) {
            if (dbClient.isEqualTo(client, false)){
                setCurrentClient(dbClient);
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
