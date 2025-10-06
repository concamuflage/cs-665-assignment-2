package edu.bu.met.cs665.example1;

import java.util.Random;

public class Order {
    private Shop shop;
    private int orderNumber;
    private Consumer consumer;
    private Food food; 

    public Order(Shop shop, Consumer consumer,Food food) {
        this.shop = shop;
        this.food = food;
        this.consumer = consumer;
        this.orderNumber = generateOrderNumber();

    }

    private int generateOrderNumber() {
        Random rand = new Random();
        return rand.nextInt(800_000_000 - 100_000_000 + 1) + 100_000_000;
    }

    public Shop getShop() {
        return this.shop;
    }

    public Food getFood() {
        return this.food;
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public Consumer getConsumer() {
        return this.consumer;
    }

}
