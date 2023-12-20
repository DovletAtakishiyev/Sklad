package org.sklad.model;

import java.util.ArrayList;

public class Provider {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Product> products;
    private static int counter = 0;

    public Provider(
            String name,
            String phone
    ) {
        this.id = provideId();
        this.name = name;
        this.phone = phone;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void setProduct(Product product) {
        products.add(product);
    }

    private static int provideId(){
        return counter++;
    }

}
