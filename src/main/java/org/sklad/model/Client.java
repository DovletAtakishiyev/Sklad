package org.sklad.model;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    public String name;
    public String phone;
    public String address;
    public String password;
    public ArrayList<Order> orders = new ArrayList<>();
    public ArrayList<Product> cart = new ArrayList<>();


    public Client(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Client(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public boolean isEqualTo(Client anotherClient, boolean usingAddress) {
        if (!(Objects.equals(name, anotherClient.name)))
            return false;
        if (usingAddress && !(Objects.equals(address, anotherClient.address)))
            return false;
        if (!usingAddress && !(Objects.equals(password, anotherClient.password)))
            return false;
        return true;
    }

    public void addToCart(Product product){
        cart.add(product);
    }

}
