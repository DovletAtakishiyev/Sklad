package org.sklad.db;

import org.sklad.model.Client;
import org.sklad.model.Product;

import java.util.ArrayList;

// Singleton
public class DB {
    private static DB instance;

    private DB() {
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

    //---------------------------------------------------------------------------//
    // Tables
    public ArrayList<Client> clients = new ArrayList<>();
    public ArrayList<Product> productsInWarehouse = new ArrayList<>();

    // User
    public Client currentClient;

}
