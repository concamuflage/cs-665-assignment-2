package edu.bu.met.cs665.example1;

public class Consumer {
    private String name;
    private String address;

    public Consumer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void placeOrder(Shop shop,Food food){
        Order newOrder = new Order(shop,this,food);
        this.notifyShop(newOrder);
    }

    public void notifyShop(Order order){
        Shop shop = order.getShop();
        shop.processOrder(order);
        
    }


}
