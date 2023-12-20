package org.sklad.model;

import java.util.ArrayList;

public class StorageOrder {
    private int id;
    private int providerId;
    private String providerName;
    private String providerPhone;
    private String deliveryDate;
    private OrderStatus status;
    private ArrayList<Product> products;

    public StorageOrder(
        Provider provider,
        String deliveryDate,
        ArrayList<Product> products
    ){
        providerId = provider.getId();
        providerName = provider.getName();
        providerPhone = provider.getPhone();
        this.deliveryDate = deliveryDate;
        status = OrderStatus.BEING_DELIVERED;
        this.products = products;
    }
}