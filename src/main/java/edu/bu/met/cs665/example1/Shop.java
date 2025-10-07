/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a shop.
 */


package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an abstract {@code Shop} that can register {@code Driver} observers and notify them of new {@code DeliveryRequest}s.
 */
public abstract class Shop {
  private String name;
  private String address;

  private List<Driver> observers = new ArrayList<>();

  /**
   * Initializes a {@code Shop} with the specified name and address.
   * 
   * @param name the name of the shop
   * @param address the address of the shop
   */
  public Shop(String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * Returns the {@code Shop}'s name.
   * 
   * @return the name of the shop
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the {@code Shop}'s address.
   * 
   * @return the address of the shop
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * Registers a {@code Driver} as an observer to the {@code Shop}.
   * 
   * @param driver the driver to be added as an observer
   */
  public void addObserver(Driver driver) {
    observers.add(driver);
  }

  /**
   * Removes a {@code Driver} from the list of observers.
   * 
   * @param driver the driver to be removed from observers
   */
  public void removeObserver(Driver driver) {
    observers.remove(driver);
  }

  /**
   * Notifies all registered {@code Driver}s of a new {@code DeliveryRequest}.
   * 
   * @param deliveryRequest the delivery request to notify the observers about
   */
  public void notifyObserver(DeliveryRequest deliveryRequest) {
    for (Driver observer : observers) {
      observer.update(deliveryRequest);
    }
  }

  /**
   * Creates a new {@code DeliveryRequest} for the specified {@code Order} and notifies the observers.
   * 
   * @param order the order to process
   */
  public DeliveryRequest processOrder(Order order) {
    DeliveryRequest newRequest = new DeliveryRequest(order);
    this.notifyObserver(newRequest);
    return newRequest;
  }
}
