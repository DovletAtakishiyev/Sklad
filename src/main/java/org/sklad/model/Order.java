package org.sklad.model;

import org.sklad.util.OrderStatus;

import java.util.ArrayList;

public class Order {

    public String deliveryName;
    public String deliveryPhone;
    public String deliveryAddress;
    public String deliveryDate;
    public OrderStatus deliveryStatus;
    public ArrayList<Product> deliveryProducts;

    public Order(
            String name,
            String phone,
            String address,
            String date,
            OrderStatus status,
            ArrayList<Product> products
            ) {
        deliveryName = name;
        deliveryPhone = phone;
        deliveryAddress = address;
        deliveryDate = date;
        deliveryStatus = status;
        deliveryProducts = new ArrayList<>(products);
    }
    public Order(
            Order anotherOrder
    ) {
        deliveryName = anotherOrder.deliveryName;
        deliveryPhone = anotherOrder.deliveryPhone;
        deliveryAddress = anotherOrder.deliveryAddress;
        deliveryDate = anotherOrder.deliveryDate;
        deliveryStatus = anotherOrder.deliveryStatus;
        deliveryProducts = new ArrayList<>(anotherOrder.deliveryProducts);
    }

    public double calculateTotalPrice(){
        double sum = 0;
        for (Product product: deliveryProducts) {
//            sum += product.calculateTotalPrice();
            sum += product.availableAmount * product.pricePerPiece;
        }
        return sum;
    }

    public boolean checkValidity(){
        if (deliveryName == null || deliveryName.isBlank())
            return false;
        if (deliveryPhone == null || deliveryPhone.isBlank())
            return false;
        if (deliveryAddress == null || deliveryAddress.isBlank())
            return false;
        if (deliveryDate == null || deliveryDate.isBlank())
            return false;
        return true;
    }
}
