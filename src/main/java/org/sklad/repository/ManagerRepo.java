package org.sklad.repository;

import org.sklad.db.DB;
import org.sklad.model.*;
import org.sklad.model.Package;
import org.sklad.util.Utils;
import java.util.ArrayList;

public class ManagerRepo {
    private DB db = DB.getInstance();

    // ---------------------------- Orders
    private ArrayList<ClientOrder> getOrders(){
        ArrayList<ClientOrder> clientOrders = new ArrayList<>();

        for (Client client: db.clients)
            for (ClientOrder clientOrder : client.clientOrders)
                    clientOrders.add(clientOrder);
        return clientOrders;
    }

    public ArrayList<ClientOrder> getOrdersBy(boolean formed) {
        ArrayList<ClientOrder> orders = new ArrayList<>();
        for (Client client : db.clients) {
            for (ClientOrder clientOrder : client.clientOrders) {
                if (formed){
                    if (clientOrder.deliveryStatus == OrderStatus.READY_TO_DELIVER) {
                        orders.add(clientOrder);
                    }
                } else {
                    if (clientOrder.deliveryStatus == OrderStatus.IN_PROCESS) {
                        orders.add(clientOrder);
                    }
                }
            }
        }
        return orders;
    }

    public void updateOrderStatus(Package pkg, OrderStatus status){
        for (ClientOrder clientOrder : getOrders()) {
            if (clientOrder.getId() == pkg.getOderId()){
                clientOrder.deliveryStatus = status;
            }
        }
    }

    // ---------------------------- Packages
    public ArrayList<Package> getAvailablePackages(){
        ArrayList<Package> packages = new ArrayList<>();
        for (ClientOrder clientOrder : getOrders()) {
            if (Utils.isItToday(clientOrder.deliveryDate) &&
                clientOrder.deliveryStatus == OrderStatus.READY_TO_DELIVER
            )
                packages.add(new Package(clientOrder));
        }
        return packages;
    }

    public void setCurrentPackage(Package pkg){
        db.deliveringPackage = pkg;
    }

    public Package getCurrentPackage(){
        return db.deliveringPackage;
    }

    // ---------------------------- Providers
    public ArrayList<Provider> getProviders(){
        return db.providers;
    }

    public void addProvider(Provider provider){
        db.providers.add(provider);
    }

    public void removeProvider(Provider provider){
        for (Provider rProvider: db.providers) {
            if (rProvider.getId() == provider.getId())
                db.providers.remove(rProvider);
        }
    }

}
