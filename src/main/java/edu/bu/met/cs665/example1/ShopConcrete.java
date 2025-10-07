/****
 * Name: Liangmi Zhang 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/04/2025
 * Description: a class that represents a concrete shop.
 */


package edu.bu.met.cs665.example1;

/**
 * Represents a concrete implementation of the {@code Shop} class
 * 
 */
public class ShopConcrete extends Shop {

  /**
   * Creates a new {@code ShopConcrete} instance with the specified name and address
   * by calling the superclass constructor.
   *
   * @param name the name of the shop
   * @param address the address of the shop
   */
  public ShopConcrete(String name, String address) {
    super(name, address);
  }
}
