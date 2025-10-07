/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a consumer
 */

package edu.bu.met.cs665.example1;

/**
 * Represents a {@code Consumer} who can place an order and notify {@code Shop}.
 */
public class Consumer {
    private String name;
    private String address;

    /**
     * Initializes a {@code Consumer} with the provided name and address.
     *
     * @param name    the name of the consumer
     * @param address the address of the consumer
     */
    public Consumer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the {@code Consumer}'s name.
     *
     * @return the name of the consumer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the {@code Consumer}'s address.
     *
     * @return the address of the consumer
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Allows the {@code Consumer} to create a new {@code Order} and notify the
     * {@code Shop}.
     *
     * @param shop the shop to order from
     * @param food the food to order
     */
    public Order placeOrder(Shop shop, Food food) {
        Order newOrder = new Order(shop, this, food);
        this.notifyShop(newOrder);
        return newOrder;
    }

    /**
     * Notifies the {@code Shop} to process the given {@code Order}.
     *
     * @param order the order to notify the shop about
     */
    public void notifyShop(Order order) {
        Shop shop = order.getShop();
        shop.processOrder(order);
    }
}
