package org.sklad.db;

import org.sklad.model.*;
import org.sklad.model.Package;
import org.sklad.util.Constant;

import java.util.ArrayList;
import java.util.List;

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
    public ArrayList<Product> productsInWarehouse = new ArrayList<>(
            List.of(
                    new Product("Prod 0", "description 0", 100, 34,    Constant.img0),
                    new Product("Prod 1", "description 1", 65,  63,    Constant.img1),
                    new Product("Prod 2", "description 2", 25,  123,   Constant.img2),
                    new Product("Prod 3", "description 3", 11,  154,   Constant.img3),
                    new Product("Prod 4", "description 4", 643, 4,     null),
                    new Product("Prod 5", "description 5", 42,  2262,  Constant.img5),
                    new Product("Prod 6", "description 6", 86,  25234, Constant.img6),
                    new Product("Prod 7", "description 7", 97,  867,   Constant.img7),
                    new Product("Prod 8", "description 8", 1,   949,   Constant.img8),
                    new Product("Prod 9", "description 9", 53,  1000,  Constant.img9)
            )
    );

    // User
    public Client currentClient;
    public ClientOrder clientOrderInfo;
    public Package deliveringPackage;

    // Providers
    public ArrayList<Provider> providers = new ArrayList<>();
}
