package edu.bu.met.cs665;

import static org.junit.Assert.assertSame;

import edu.bu.met.cs665.example1.*;

import org.junit.Test;

public class TestDeliveryRequest {
  public TestDeliveryRequest() {}

  // test that all the drivers received the correct request.

  @Test
  public void testDeliveryRequest() {
    Consumer mark = new Consumer("Mark","Street A, 55");
    Shop shop = new ShopConcrete("McDonald", "Street B, 65");
    Pizza pizza = new Pizza();

    Order newOrder = mark.placeOrder(shop, pizza);
    DeliveryRequest newRequest = shop.processOrder(newOrder);
    assertSame(newOrder, newRequest.getOrder());
  }
  


}
