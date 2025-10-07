/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a pizza.
 */


package edu.bu.met.cs665.example1;

/**
 * Represents a {@code Pizza} item with a fixed name and price.
 * Implements the {@code Food} interface.
 */
public class Pizza implements Food {

  private String name;
  private Double price;

  /**
   * Initializes a {@code Pizza} object with a default name and price.
   */
  public Pizza() {
    this.name = "Pizza";
    this.price = 10.00;
  }

  /**
   * Returns the name of this {@code Pizza}.
   * @return the name of the pizza
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Returns the price of this {@code Pizza}.
   * @return the price of the pizza
   */
  @Override
  public Double getPrice() {
    return this.price;
  }
}
