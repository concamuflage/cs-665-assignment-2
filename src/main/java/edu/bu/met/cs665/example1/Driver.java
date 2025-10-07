/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a driver that delivers food.
 */

package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents an abstract {@code Driver} responsible for handling and delivering
 * {@code DeliveryRequest}s.
 */
public abstract class Driver {
    private int idNumber;
    private List<DeliveryRequest> requests;

    /**
     * Initializes the {@code Driver} with a randomly generated ID and an empty list
     * of {@code DeliveryRequest}s.
     */
    public Driver() {
        this.idNumber = generateID();
        this.requests = new ArrayList<>();
    }

    /**
     * Adds a new {@code DeliveryRequest} to the driver's request list.
     * 
     * @param request the delivery request to add
     */
    public void update(DeliveryRequest request) {
        requests.add(request);
    }

    /**
     * Returns the driver's unique ID number.
     * 
     * @return the ID number of the driver
     */
    public int getIdNumber() {
        return this.idNumber;
    }

    /**
     * Returns a list of {@code DeliveryRequest}s assigned to the driver.
     * 
     * @return list of delivery requests
     */
    public List<DeliveryRequest> getRequests() {
        return this.requests;
    }

    /**
     * Generates a random 6-digit unique identifier for the driver.
     * 
     * @return a randomly generated 6-digit ID
     */
    public int generateID() {
        Random rand = new Random();
        return rand.nextInt(800_000 - 100_000 + 1) + 100_000;
    }
}
