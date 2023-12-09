package org.sklad.model;

import java.util.ArrayList;

public class Order {

    String deliveryName;
    String deliveryPhone;
    String deliveryAddress;
    String deliveryDate;
    String deliveryStatus;
    ArrayList<Product> deliveryProducts;
    double totalPrice;

    public Order(
            String name,
            String phone,
            String address,
            String date,
            String status,
            ArrayList<Product> products
            ) {
        deliveryName = name;
        deliveryPhone = phone;
        deliveryAddress = address;
        deliveryDate = date;
        deliveryStatus = status;
        deliveryProducts = new ArrayList<>(products);
        totalPrice = countTotalPrice();
    }

    private double countTotalPrice(){
        double sum = 0;
        for (Product product: deliveryProducts) {
            sum += product.availableAmount * product.pricePerPiece;
        }
        return sum;
    }
}
