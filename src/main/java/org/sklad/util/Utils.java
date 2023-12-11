package org.sklad.util;

import org.sklad.model.Order;

abstract public class Utils {
    public static String getStatus(Order order){
        if (order.deliveryStatus == OrderStatus.READY_TO_DELIVER){
            return "Ready to Deliver";
        }
        if (order.deliveryStatus == OrderStatus.BEING_DELIVERED){
            return "Coming Soon";
        }
        if (order.deliveryStatus == OrderStatus.DELIVERED){
            return "Delivered";
        }
        return "N/A";
    }
}
