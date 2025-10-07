/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a DeliveryRequest
 */

package edu.bu.met.cs665.example1;

/**
 * Represents a {@code DeliveryRequest} containing an {@code Order} to be
 * processed.
 */
public class DeliveryRequest {
    private Order order;

    /**
     * Initializes a {@code DeliveryRequest} with the specified {@code Order}.
     *
     * @param order the {@code Order} to be associated with this
     *              {@code DeliveryRequest}
     */
    public DeliveryRequest(Order order) {
        this.order = order;
    }

    /**
     * Returns the {@code Order} associated with this {@code DeliveryRequest}.
     *
     * @return the associated {@code Order}
     */
    public Order getOrder() {
        return this.order;
    }
}
