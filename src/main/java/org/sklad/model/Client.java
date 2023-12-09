package org.sklad.model;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    String name;
    String phone;
    String address;
    String password;
    ArrayList<Order> orders;


    public Client() {
    }

    public Client(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public boolean isEqualTo(Client anotherClient) {
        if (!(Objects.equals(name, anotherClient.name))){
            return false;
        }
        if (!(Objects.equals(address, anotherClient.address))){
            return false;
        }
        return true;
    }

}
