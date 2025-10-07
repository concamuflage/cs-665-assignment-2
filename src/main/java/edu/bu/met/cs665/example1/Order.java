/**
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a food order.
 */


package edu.bu.met.cs665.example1;

import java.util.Random;

/**
 * Represents an {@code Order} placed by a {@code Consumer} at a {@code Shop} for a specific {@code Food} item.
 */
public class Order {
  private Shop shop;
  private int orderNumber;
  private Consumer consumer;
  private Food food;

  /**
   * Initializes a new {@code Order} with the specified {@code Shop}, {@code Consumer}, and {@code Food}.
   */
  public Order(Shop shop, Consumer consumer, Food food) {
    this.shop = shop;
    this.food = food;
    this.consumer = consumer;
    this.orderNumber = generateOrderNumber();
  }

  /**
   * Generates a random unique order number for each {@code Order}.
   */
  private int generateOrderNumber() {
    Random rand = new Random();
    return rand.nextInt(800_000_000 - 100_000_000 + 1) + 100_000_000;
  }

  /**
   * Returns the {@code Shop} associated with this {@code Order}.
   */
  public Shop getShop() {
    return this.shop;
  }

  /**
   * Returns the {@code Food} item ordered.
   */
  public Food getFood() {
    return this.food;
  }

  /**
   * Returns the unique order number of this {@code Order}.
   */
  public int getOrderNumber() {
    return this.orderNumber;
  }

  /**
   * Returns the {@code Consumer} who placed this {@code Order}.
   */
  public Consumer getConsumer() {
    return this.consumer;
  }
}
