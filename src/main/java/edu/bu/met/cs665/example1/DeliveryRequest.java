package edu.bu.met.cs665.example1;

public class DeliveryRequest {
    private Order order;
    public DeliveryRequest(Order order){
        this.order = order;
    }

    public Order getOrder(){
        return this.order;
    }
}
