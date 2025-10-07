/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a food item that can be ordered.
 */

package edu.bu.met.cs665.example1;

/**
 * Defines the contract for any {@code Food} item that can be ordered.
 * Includes methods to get the name and price of the food item.
 */
public interface Food {
    /**
     * Returns the name of the {@code Food} item.
     *
     * @return the name of the food item
     */
    String getName();

    /**
     * Returns the price of the {@code Food} item.
     *
     * @return the price of the food item
     */
    Double getPrice();
}
