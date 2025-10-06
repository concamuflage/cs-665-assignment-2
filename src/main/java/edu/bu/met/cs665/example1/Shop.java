
package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {
    private String name;
    private String address;

    private List<Driver> observers = new ArrayList<>();

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void addObserver(Driver driver) {
        observers.add(driver);
    }

    public void removeObserver(Driver driver) {
        observers.remove(driver);
    }

    public void notifyObserver(DeliveryRequest deliveryRequest) {
        for (Driver observer : observers) {
            observer.update(deliveryRequest);
        }
    }

    public void processOrder(Order order) {
        DeliveryRequest newRequest = new DeliveryRequest(order);
        this.notifyObserver(newRequest);
    }
}
