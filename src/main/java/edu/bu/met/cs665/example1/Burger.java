/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a burger
 */

package edu.bu.met.cs665.example1;

/**
 * Represents a {@code Burger} item with a fixed name and price.
 * Implements the {@code Food} interface.
 */
public class Burger implements Food {

    private String name;
    private double price;

    /**
     * Initializes the {@code Burger} object with default name and price.
     */
    public Burger() {
        this.name = "Burger";
        this.price = 5.00;
    }

    /**
     * Returns the name of this {@code Burger}.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Returns the price of this {@code Burger}.
     */
    @Override
    public Double getPrice() {
        return this.price;
    }
}
